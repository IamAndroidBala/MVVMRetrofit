package com.android.bala.mvvmretrofit.model.album

import okhttp3.Response
import org.json.JSONArray
import com.google.gson.Gson

data class AlbumResult (private val response: Response) {

    var allResult : List<Album>? =null

    init {

        val gson = Gson()

        allResult = response.body()?.string()?.let {
            JSONArray(it)
                    .let { array ->
                        (0 until array.length()).map {
                            array.getJSONObject(it)
                        }.map {
                            gson.fromJson(it.toString(), Album::class.java)
                        }
                    }
        }

    }
}

