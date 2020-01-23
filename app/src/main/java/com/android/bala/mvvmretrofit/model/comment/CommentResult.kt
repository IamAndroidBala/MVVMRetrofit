package com.android.bala.mvvmretrofit.model.comment

import android.util.Log
import com.google.gson.Gson
import okhttp3.Response
import org.json.JSONArray

class CommentResult (private val response: Response) {

    var allComment : List<Comment>? = null

    init {

        val gson = Gson()

        allComment = response.body()?.string()?.let {
            JSONArray(it)
                    .let { array ->
                        (0 until array.length()).map {
                            array.getJSONObject(it)
                        }.map {
                            Log.d("okkkskksk", "ookkskskkssks " + it)
                            gson.fromJson(it.toString(), Comment::class.java)
                        }
                    }
        }

    }

}