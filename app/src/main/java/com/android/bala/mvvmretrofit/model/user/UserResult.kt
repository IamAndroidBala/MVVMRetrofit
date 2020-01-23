package com.android.bala.mvvmretrofit.model.user

import com.google.gson.Gson
import okhttp3.Response
import org.json.JSONArray

data class UserResult (private val response : Response) {

    var allUser : List<User>? = null

    init {

        val gson = Gson()

        allUser = response.body()?.string()?.let {
            JSONArray(it)
                    .let { array ->
                        (0 until array.length()).map {
                            array.getJSONObject(it)
                        }.map {
                             gson.fromJson(it.toString(), User::class.java)
                        }
                    }
        }

    }

}