package com.example.iteradmin.june4project

import android.content.Context
import android.service.autofill.Dataset
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import java.text.FieldPosition

class TitanAdapter(context: Context,dataset: Array<Card>):RecyclerView.Adapter<TitanAdapter.MyViewHolder>(){

    private val mContext:Context
    private val dataset:Array<Card>

    init {
        this.mContext=context
        this.dataset=dataset
    }
    class MyViewHolder(view:View):RecyclerView.ViewHolder(view) {
        val thumbnail:ImageView
        val title:TextView
        val subtitle:TextView

        init {
            this.thumbnail=view.findViewById<ImageView>(R.id.thumbnail)
            this.title=view.findViewById(R.id.title)
            this.subtitle=view.findViewById(R.id.subtitle)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): TitanAdapter.MyViewHolder {
        val rootView=LayoutInflater.from(parent.context)
                .inflate(R.layout.album_card,parent,false)
        return MyViewHolder(rootView)
    }

    override fun getItemCount(): Int {
        return this.dataset.size

    }

    override fun onBindViewHolder(holder: TitanAdapter.MyViewHolder, position: Int) {
        Glide.with(mContext).load(dataset[position].getThumbnail()).into(holder.thumbnail)
        holder.title.text=dataset[position].getTitle()
        holder.subtitle.text=dataset[position].getSubtitle()

    }




}