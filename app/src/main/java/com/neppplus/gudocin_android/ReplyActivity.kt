package com.neppplus.gudocin_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.neppplus.gudocin_android.databinding.ActivityReplyBinding
import com.neppplus.gudocin_android.datas.BasicResponse
import com.neppplus.gudocin_android.datas.ReplyData
import com.neppplus.gudocin_android.datas.ReviewData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ReplyActivity : BaseActivity() {

    lateinit var binding: ActivityReplyBinding

    lateinit var mReviewData : ReviewData

    val mReplyList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_reply)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {


    }

    override fun setValues() {
        val intputReply = binding.edtReply.text.toString()

        apiService.getRequestReviewReply(mReviewData.id).enqueue(object : Callback<BasicResponse>{
            override fun onResponse(call: Call<BasicResponse>, response: Response<BasicResponse>) {

            }

            override fun onFailure(call: Call<BasicResponse>, t: Throwable) {

            }


        })

    }

}