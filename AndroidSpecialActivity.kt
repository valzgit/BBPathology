package com.example.bbpathology

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_android_special.*


class AndroidSpecialActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int=1;
    private var mQuestionsList:ArrayList<Question>?=null
    private var mSelectedOptionPosition: Int=0
    private var mCorrectAnswers: Int=0
    private var mUserName: String?=null;
    private var mDozvola:Int=1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_special)

        mUserName=intent.getStringExtra(Constants.USER_NAME)

        mQuestionsList=Constants.get20Questions()
        setQuestion()
        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this);
    }
    private fun setQuestion(){

        val question= mQuestionsList!![mCurrentPosition-1];

        defaultOptionsView()

        if(mCurrentPosition==mQuestionsList!!.size && btn_submit.text.equals("FINISH")){
            btn_submit.text="FINISH"
        }
        else{
            btn_submit.text="SUBMIT"
        }
        progressBar.progress=mCurrentPosition
        tv_progress.text="$mCurrentPosition" + "/" + progressBar.max
        tv_question.text=question!!.question
        iv_image.setImageResource(question.image)
        tv_option_one.text=question.optionOne
        tv_option_two.text=question.optionTwo
        tv_option_three.text=question.optionThree
        tv_option_four.text=question.optionFour
    }
    private fun defaultOptionsView(){
        val options=ArrayList<TextView>()
        options.add(0,tv_option_one)
        options.add(1,tv_option_two)
        options.add(2,tv_option_three)
        options.add(3,tv_option_four)

        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface= Typeface.DEFAULT;
            option.background= ContextCompat.getDrawable(this,R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(p0: View?) {

        when(p0?.id){
            R.id.tv_option_one->{
                if(mDozvola==1)
                    selectedOptionView(tv_option_one,1)
            }
            R.id.tv_option_two->{
                if(mDozvola==1)
                    selectedOptionView(tv_option_two,2)
            }
            R.id.tv_option_three->{
                if(mDozvola==1)
                    selectedOptionView(tv_option_three,3)
            }
            R.id.tv_option_four->{
                if(mDozvola==1)
                    selectedOptionView(tv_option_four,4)
            }
            R.id.btn_submit->{
                mDozvola=0
                if(mSelectedOptionPosition==0){
                    mCurrentPosition++
                    mDozvola=1
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
                }else {
                    val question = mQuestionsList?.get(mCurrentPosition -1)
                    if(question!!.correctAnswer!=mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition,R.drawable.wrong_option_border_bg)
                    }else{
                        mCorrectAnswers++
                    }
                    answerView(question.correctAnswer,R.drawable.correct_option_border_bg)

                    if(mCurrentPosition == mQuestionsList!!.size){
                        btn_submit.text="FINISH"
                    }else {
                        btn_submit.text="GO TO NEXT QUESTION"
                    }
                    mSelectedOptionPosition=0
                }
            }

        }
    }
    private fun answerView(answer:Int,drawableView:Int){
        when(answer){
            1->{
                tv_option_one.background= ContextCompat.getDrawable(this,drawableView)
            }
            2->{
                tv_option_two.background= ContextCompat.getDrawable(this,drawableView)
            }
            3->{
                tv_option_three.background= ContextCompat.getDrawable(this,drawableView)
            }
            4->{
                tv_option_four.background= ContextCompat.getDrawable(this,drawableView)
            }
        }
    }
    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){
        defaultOptionsView()
        mSelectedOptionPosition= selectedOptionNum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background= ContextCompat.getDrawable(this,R.drawable.selected_option_border_bg)
    }
}