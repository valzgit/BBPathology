package com.example.bbpathology

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.*


class ResultActivity : AppCompatActivity() {
    var pom=0
    lateinit var mAdView : AdView
    private lateinit var mInterstitialAd: InterstitialAd
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        MobileAds.initialize(this) {}
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-3940256099942544/1033173712"
        mInterstitialAd.loadAd(AdRequest.Builder().build())

        val username=intent.getStringExtra(Constants.USER_NAME)
        tv_name.text=username
        val totalQuestions=intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctAnswers=intent.getIntExtra(Constants.CORRECT_ANSWERS,0)

        tv_score.text="Your score is $correctAnswers out of $totalQuestions"

        if(correctAnswers==5 && totalQuestions==5){
            tv_congratulations.text="Congratulations!\n    (20 points)"
            iv_trophy.setImageResource(R.drawable.zlato)
        }
        else if(correctAnswers==4 && totalQuestions==5){
            tv_congratulations.text="Well Done!\n(16 points)"
            iv_trophy.setImageResource(R.drawable.srebro)
        }
        else if(correctAnswers==3 && totalQuestions==5){
            tv_congratulations.text="    Good!"+"\n"+"(12 points)"
            iv_trophy.setImageResource(R.drawable.bronza)
        }
        else if(totalQuestions==5){
            tv_congratulations.text="Better luck next time!\n          (0 points)"
        }

        if(correctAnswers==20 && totalQuestions==20){
            tv_congratulations.text="Congratulations!"
            iv_trophy.setImageResource(R.drawable.zlato)
        }
        else if(correctAnswers==19 && totalQuestions==20){
            tv_congratulations.text="Well Done!"
            iv_trophy.setImageResource(R.drawable.srebro)
        }
        else if(correctAnswers==18 && totalQuestions==20){
            tv_congratulations.text="  Good!"
            iv_trophy.setImageResource(R.drawable.bronza)
        }
        else if(totalQuestions==20){
            tv_congratulations.text="Better luck next time!"
        }

        btn_finish.setOnClickListener{
            if (mInterstitialAd.isLoaded && pom==0) {
                mInterstitialAd.show()
                pom=1
                return@setOnClickListener
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                pom=0
            }
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }

}