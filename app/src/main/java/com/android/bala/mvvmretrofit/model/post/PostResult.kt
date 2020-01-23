package com.android.bala.mvvmretrofit.model.post

import com.google.gson.Gson
import okhttp3.Response
import org.json.JSONArray

data class PostResult (private val response: Response) {

    var allResult : List<Post>? = null

    init {

        val gson = Gson()

        allResult = response.body()?.string()?.let {
            JSONArray(it)
                    .let { array ->
                        (0 until array.length()).map {
                            array.getJSONObject(it)
                        }.map {
                            gson.fromJson(it.toString(), Post::class.java)
                            //Post(it.getLong("userId"), it.getLong("id"), it.getString("title"), it.getString("body"))
                        }
                    }
        }

    }
}



