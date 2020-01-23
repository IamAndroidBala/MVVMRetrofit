package com.android.bala.mvvmretrofit.utils

import android.content.Context
import android.content.Intent
import android.net.Uri
import javax.inject.Inject

class CommonMethods  @Inject constructor(){

    companion object {

        fun call(phone: String, mContext: Context) {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phone"))
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            mContext.startActivity(intent)
        }

        fun sendEmail(email : String, mContext: Context) {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("mailto:$email"))
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.putExtra(Intent.EXTRA_SUBJECT, "")
            intent.putExtra(Intent.EXTRA_TEXT, "")
            mContext.startActivity(intent)
        }

    }

}