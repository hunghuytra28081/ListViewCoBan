package com.example.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MonAn2Adapter(var context: Context, var arrayList: ArrayList<MonAn>) : BaseAdapter() {
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return arrayList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    class ViewHolder(row : View){
        var textViewTen : TextView
        var textViewGia : TextView
        var imageView : ImageView

        init {
            textViewTen = row.findViewById(R.id.tvTen)
            textViewGia = row.findViewById(R.id.tvGia)
            imageView = row.findViewById(R.id.imvMonAn)
        }
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view : View
        var viewHolder : ViewHolder

        if (convertView == null){
            var layoutInflater : LayoutInflater = LayoutInflater.from(context)
            view = layoutInflater.inflate(R.layout.dong_mon_an,null)

            viewHolder = ViewHolder(view)

            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = convertView.tag as ViewHolder
        }

        var monan : MonAn = arrayList.get(position)
        viewHolder.textViewTen.text = monan.tenMonAn
        viewHolder.textViewGia.text = monan.giaMonAn.toString()
        viewHolder.imageView.setImageResource(monan.hinhMonAn)

        return view
    }
}