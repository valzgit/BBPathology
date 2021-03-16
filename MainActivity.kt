package com.example.bbpathology

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.annotation.NonNull
import com.google.android.gms.ads.*
import com.google.android.gms.ads.rewarded.RewardItem
import kotlinx.android.synthetic.main.activity_main.*
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdCallback
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback


class MainActivity : AppCompatActivity() {
    lateinit var mAdView : AdView
    private lateinit var mInterstitialAd: InterstitialAd
    var pom=0
    private lateinit var rewardedAd: RewardedAd
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this) {}
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-3940256099942544/1033173712"
        mInterstitialAd.loadAd(AdRequest.Builder().build())
        pom=0
        rewardedAd = RewardedAd(this,
            "ca-app-pub-3940256099942544/5224354917")
        val adLoadCallback = object: RewardedAdLoadCallback() {
            override fun onRewardedAdLoaded() {
                // Ad successfully loaded.
            }
            override fun onRewardedAdFailedToLoad(adError: LoadAdError) {
                // Ad failed to load.
            }
        }
        rewardedAd.loadAd(AdRequest.Builder().build(), adLoadCallback)


    btn_start.setOnClickListener {

        if (mInterstitialAd.isLoaded && pom==0) {
            mInterstitialAd.show()
            pom=1
            return@setOnClickListener
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.")
            pom=0
        }
        if(et_name.text.toString().isEmpty()){
            Toast.makeText(this,"Please enter Your name",Toast.LENGTH_SHORT).show();
        }else{

            val intent =Intent(this,QuizQuestionsActivity::class.java);
            intent.putExtra(Constants.USER_NAME,et_name.text.toString())
            startActivity(intent);
            finish();
        }
    }
        btn_library.setOnClickListener {

            if (mInterstitialAd.isLoaded && pom==0) {
                mInterstitialAd.show()
                pom=1
                return@setOnClickListener
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                pom=0
            }

            if(et_name.text.toString().isEmpty()){
                Toast.makeText(this,"Please enter Your name",Toast.LENGTH_SHORT).show();
            }else{
                val intent =Intent(this,LibraryActivity::class.java);
                intent.putExtra(Constants.USER_NAME,et_name.text.toString())
                startActivity(intent);
                finish();
            }
        }
        btn_exam.setOnClickListener {

            if (mInterstitialAd.isLoaded && pom==0) {
                mInterstitialAd.show()
                pom=1
                return@setOnClickListener
            } else {
                Log.d("TAG", "The interstitial wasn't loaded yet.")
                pom=0
            }
            if(et_name.text.toString().isEmpty()){
                Toast.makeText(this,"Please enter Your name",Toast.LENGTH_SHORT).show();
            }else{
                val intent =Intent(this,IspitActivity::class.java);
                intent.putExtra(Constants.USER_NAME,et_name.text.toString())
                startActivity(intent);
                finish();
            }

        }
        btn_android.setOnClickListener{
            if (rewardedAd.isLoaded && pom==0) {
                val activityContext: Activity = this@MainActivity
                val adCallback = object: RewardedAdCallback() {
                     override fun onRewardedAdOpened() {
                        // Ad opened.
                    }
                     override fun onRewardedAdClosed() {
                        // Ad closed.
                    }
                     override fun onUserEarnedReward(@NonNull reward: RewardItem) {
                        // User earned reward.
                    }
                     override fun onRewardedAdFailedToShow(adError: AdError) {
                        // Ad failed to display.
                    }
                }
                rewardedAd.show(activityContext, adCallback)
                pom==1
                return@setOnClickListener
            }
            else {
                Log.d("TAG", "The rewarded ad wasn't loaded yet.")
                pom=0
            }
            if(et_name.text.toString().isEmpty()){
                Toast.makeText(this,"Please enter Your name",Toast.LENGTH_SHORT).show();
            }else{

                val intent =Intent(this,AndroidSpecialActivity::class.java);
                intent.putExtra(Constants.USER_NAME,et_name.text.toString())
                startActivity(intent);
                finish();
            }
        }
    }



}