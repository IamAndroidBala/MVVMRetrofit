package com.android.bala.mvvmretrofit.ui.albumscreen

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.android.bala.mvvmretrofit.R
import com.android.bala.mvvmretrofit.model.album.Album
import com.android.bala.mvvmretrofit.ui.photoscreen.PhotosActivity
import kotlinx.android.synthetic.main.item_album.view.*

class AlbumAdapter (var thisList : ArrayList<Album>, var activity: FragmentActivity) : RecyclerView.Adapter<AlbumAdapter.ViewHolder>() {

    override fun onBindViewHolder(itemView: ViewHolder, position: Int) {
        itemView.bindItems(thisList[position])
    }

    override fun getItemCount() = thisList.size

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_album, parent, false)
        return ViewHolder(view)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(album: Album) {
            itemView.tvAlbumTitle.text = album.title

            itemView.setOnClickListener {
                activity.startActivity(Intent(activity, PhotosActivity::class.java).apply {
                    putExtra("Album", album)
                    flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
                })
            }
        }

    }

    fun addAlbum(newList : List<Album>){
        thisList.addAll(newList)
        notifyDataSetChanged()
    }

}