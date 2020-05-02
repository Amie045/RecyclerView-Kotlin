package com.example.recyclerviewkotlin

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*

class MyAdapter (val arrayList: ArrayList<Model>, val context: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItems(model: Model){

            itemView.titleTV.text = model.title
            itemView.DescTV.text = model.des
            itemView.imageV.setImageResource(model.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
         holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener {


//            if (position == 0){
//                Toast.makeText(
//                    context,
//                        "you clicked over Newsfeed",
//                    Toast.LENGTH_LONG
//
//                ).show()
//            }
//
//            if (position == 1){
//                Toast.makeText(
//                    context,
//                    "you clicked over Business",
//                    Toast.LENGTH_LONG
//
//                ).show()
//            }
//
//            if (position == 2){
//                Toast.makeText(
//                    context,
//                    "you clicked over People",
//                    Toast.LENGTH_LONG
//
//                ).show()
//            }
//
//            if (position == 3){
//                Toast.makeText(
//                    context,
//                    "you clicked over Notes",
//                    Toast.LENGTH_LONG
//
//                ).show()
//            }
//
//            if (position == 4){
//                Toast.makeText(
//                    context,
//                    "you clicked over Feedback",
//                    Toast.LENGTH_LONG
//
//                ).show()
//            }

            val model = arrayList.get(position)

            var gtitle : String = model.title
            var gDescription : String = model.des

            var gImageView : Int = model.image

            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra("iTitle", gtitle)
            intent.putExtra("iDescription", gDescription)
            intent.putExtra("iImageView", gImageView)

            context.startActivity(intent)




        }
    }
}