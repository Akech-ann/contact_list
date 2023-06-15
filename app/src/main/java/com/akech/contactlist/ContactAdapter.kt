package com.akech.contactlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akech.contactlist.databinding.ContactlistItemBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactAdapter (var contactList: List<ContactData>):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding=
            ContactlistItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContacts=contactList.get(position)
        var binding=holder.binding
        binding.tvName.text=currentContacts.name
        binding.tvEmail.text=currentContacts.email
        binding.tvPhoneNumber.text=currentContacts.phoneNum
        Picasso
            .get()
            .load(currentContacts.img)
            .resize(80,80)
            .centerCrop()
            .transform(CropCircleTransformation())
            .into(binding.ivAnn)





    }

}
class ContactViewHolder(var binding: ContactlistItemBinding):RecyclerView.ViewHolder(binding.root)