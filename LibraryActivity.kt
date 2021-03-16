package com.example.bbpathology

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_library.*
import kotlinx.android.synthetic.main.activity_quiz_questions.btn_submit
import kotlinx.android.synthetic.main.activity_quiz_questions.iv_image


class LibraryActivity : AppCompatActivity(), View.OnClickListener {
    private var mCurrentPosition:Int=1;
    private var mQuestionsList:ArrayList<Elements>?=null
    lateinit var mAdView : AdView
    private lateinit var mInterstitialAd: InterstitialAd
    var pom=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)

        mQuestionsList=Constants.getAllQuestions()
        setQuestion()
        MobileAds.initialize(this) {}
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-3940256099942544/1033173712"
        mInterstitialAd.loadAd(AdRequest.Builder().build())

        btn_submit.setOnClickListener(this);
        btn_back.setOnClickListener(this);
        btn_return.setOnClickListener(this);
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.btn_submit-> {
                pom++
                if(pom==2){mInterstitialAd.loadAd(AdRequest.Builder().build())}
                if (mInterstitialAd.isLoaded && pom>=30) {
                    mInterstitialAd.show()
                    pom=0
                    return
                }else {if(pom>=30)pom=0}

                    mCurrentPosition++
                    if (mCurrentPosition > 107) mCurrentPosition = 1
                    setQuestion()
                }
            R.id.btn_back->{
                pom++
                if(pom==2){mInterstitialAd.loadAd(AdRequest.Builder().build())}
                if (mInterstitialAd.isLoaded && pom>=30) {
                    mInterstitialAd.show()
                    pom=0
                    return
                }else {if(pom>=30)pom=0}
                mCurrentPosition--
                if(mCurrentPosition==0)mCurrentPosition=107
                setQuestion()
            }
            R.id.btn_return->{

                mCurrentPosition=1
                val intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
    private fun setQuestion(){

        val question= mQuestionsList!![mCurrentPosition-1];

        iv_image.setImageResource(question.image)
        tv_opis.text=question.optionOne

    }
}