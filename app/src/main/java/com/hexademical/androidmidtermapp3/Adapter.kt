package com.hexademical.androidmidtermapp3

import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class Adapter(val oilArrs: ArrayList<Oil>):RecyclerView.Adapter<ModalViewHolder>() {
    private lateinit var oilListener: onItemClickListener

    interface onItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener){
        oilListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModalViewHolder {
        return ModalViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.oil_modal, parent, false), oilListener)
    }

    override fun onBindViewHolder(holder: ModalViewHolder, position: Int) {
        holder.oilNameView.text = oilArrs.get(position).getOilName();
        holder.oilPriceView.text = oilArrs.get(position).getOilPrice().toString();
        Log.d("onBindViewHolderAdapter","${holder.oilNameView.text.toString()}/ ${oilArrs.get(position).getOilPrice().toString()}");

    }

    override fun getItemCount(): Int = oilArrs.size
}


class ModalViewHolder(itemView: View, listener: Adapter.onItemClickListener) : RecyclerView.ViewHolder(itemView) {
    internal var oilNameView : TextView = itemView.findViewById(R.id.oil_name)
    internal var oilPriceView : TextView = itemView.findViewById(R.id.oil_price)
    init {
        itemView.setOnClickListener{
            listener.onItemClick(adapterPosition);
        }
    }
}