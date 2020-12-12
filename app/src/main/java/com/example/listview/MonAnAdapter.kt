package com.example.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MonAnAdapter (var contex : Context, var mangMonAn : ArrayList<MonAn>) : BaseAdapter() {
    override fun getCount(): Int {
        return mangMonAn.size
    }

    override fun getItem(position: Int): Any {
        return mangMonAn.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    class ViewHolder(row : View){
        var tvTenMonAn : TextView
        var tvGiaMonAn : TextView
        var imvMonAn : ImageView

        init {
            tvTenMonAn = row.findViewById(R.id.tvTen)
            tvGiaMonAn = row.findViewById(R.id.tvGia)
            imvMonAn = row.findViewById(R.id.imvMonAn)
        }

    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view : View?
        var viewholder : ViewHolder

        if (convertView == null){
            var layoutInflater : LayoutInflater = LayoutInflater.from(contex)
            view = layoutInflater.inflate(R.layout.dong_mon_an,null)

            viewholder = ViewHolder(view)
            view.tag = viewholder
        }else{
            view = convertView
            viewholder = convertView.tag as ViewHolder
        }
        var monan : MonAn = mangMonAn.get(position)
        viewholder.tvTenMonAn.text = monan.tenMonAn
        viewholder.tvGiaMonAn.text = monan.giaMonAn.toString()
        viewholder.imvMonAn.setImageResource(monan.hinhMonAn)

        return view as View
    }
}