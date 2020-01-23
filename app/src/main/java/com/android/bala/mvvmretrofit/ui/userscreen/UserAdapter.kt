package com.android.bala.mvvmretrofit.ui.userscreen

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.android.bala.mvvmretrofit.R
import com.android.bala.mvvmretrofit.model.user.User
import com.android.bala.mvvmretrofit.utils.CommonMethods
import kotlinx.android.synthetic.main.item_user.view.*

class UserAdapter (var thisList : ArrayList<User>, var activity: FragmentActivity) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    override fun onBindViewHolder(itemView: ViewHolder, position: Int) {
        itemView.bindItems(thisList[position])
    }

    override fun getItemCount() = thisList.size

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false)
        return ViewHolder(view)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(user: User) {

            user.name.let {
                val strName = "${user.name} (${user.username})"
                itemView.tvUsername.text = strName
            }

            user.phone.let { itemView.tvPhone.text = user.phone }

            user.email.let { itemView.tvEmail.text = user.email }

            user.address.let {
                val address = "${it.suite}, ${it.city}, \n ${it.street}, \n ${it.city} - ${it.zipcode}"
                itemView.tvAddress.text = address
            }

            user.company.let {
                itemView.tvWork.text = user.company.name
            }

            itemView.tvPhone.setOnClickListener {
                if(user.phone.isEmpty()) {
                    return@setOnClickListener
                }
                CommonMethods.call(user.phone,activity)
            }

            itemView.tvEmail.setOnClickListener {
                if(user.email.isEmpty()) {
                    return@setOnClickListener
                }
                CommonMethods.sendEmail(user.email,activity)
            }

            itemView.tvOpenMap.setOnClickListener {
                user.address.geo.let {
                    val lat = user.address.geo.lat
                    val lng = user.address.geo.lng
                    val gmmIntentUri = Uri.parse("geo:$lat,$lng?q=$lat,$lng(${user.address.city})")
                    val mapIntent    = Intent(Intent.ACTION_VIEW, gmmIntentUri)
                    mapIntent.setPackage("com.google.android.apps.maps")

                    if (mapIntent.resolveActivity(activity.packageManager) != null) {
                        activity.startActivity(mapIntent)
                    }
                }
            }

        }

    }

    fun addUser(newList : List<User>){
        thisList.addAll(newList)
        notifyDataSetChanged()
    }

}