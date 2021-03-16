package com.example.bbpathology

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ispit.*
import kotlinx.android.synthetic.main.activity_ispit.et_name
import kotlinx.android.synthetic.main.activity_main.*

class IspitActivity : AppCompatActivity(), View.OnClickListener {
    private var mCurrentPosition:Int=1;
    private var mQuestionsList:ArrayList<Elements>?=null
    private var mCorrectAnswers: Int=0
    private var mUserName: String?=null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ispit)

        mUserName=intent.getStringExtra(Constants.USER_NAME)

        mQuestionsList=Constants.getIspitQuestions()
        setQuestion()

        btn_submit.setOnClickListener(this);
    }

    override fun onClick(p0: View?) {
        when(p0?.id) {
            R.id.btn_submit -> {
                if(et_name.text.toString().equals(mQuestionsList!![mCurrentPosition-1].optionOne)){
                    Toast.makeText(this,"CORRECT!", Toast.LENGTH_SHORT).show()
                    mCorrectAnswers++
                }
                else{
                    Toast.makeText(this,"Correct answer: "+ mQuestionsList!![mCurrentPosition-1].optionOne, Toast.LENGTH_SHORT).show();
                }
                mCurrentPosition++
                when{
                    mCurrentPosition<=mQuestionsList!!.size->{
                        setQuestion()
                    }else->{
                    val intent= Intent(this,ResultActivity::class.java)
                    intent.putExtra(Constants.USER_NAME,mUserName)
                    intent.putExtra(Constants.CORRECT_ANSWERS,mCorrectAnswers)
                    intent.putExtra(Constants.TOTAL_QUESTIONS,mQuestionsList!!.size)
                    startActivity(intent)
                    finish()
                }
                }

            }
        }
    }
    private fun setQuestion(){

        val question= mQuestionsList!![mCurrentPosition-1];

        iv_image.setImageResource(question.image)

    }
}