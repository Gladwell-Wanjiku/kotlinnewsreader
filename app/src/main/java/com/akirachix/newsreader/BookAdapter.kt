package com.akirachix.newsreader

import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class BookAdapter (var bookList: List<Book>)
    :RecyclerView.Adapter<BooksViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.author_details,parent,false)
        return  BooksViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
       val book = bookList[position]
        holder.tvAuthor.text = book.name
        holder.tvTitle.text = book.title
        holder.tvPublishing.text = book.date

    }

    override fun getItemCount(): Int {
       return bookList.size
    }

}
class BooksViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvAuthor = itemView.findViewById<TextView>(R.id.tvAuthor)
    var tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    var tvPublishing = itemView.findViewById<TextView>(R.id.tvPublishing)
    var tvPreview = itemView.findViewById<TextView>(R.id.tvPreview)
}