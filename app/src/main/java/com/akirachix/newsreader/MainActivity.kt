package com.akirachix.newsreader

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.newsreader.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvNews.layoutManager = LinearLayoutManager(this)
        displayBooks()
    }
    fun displayBooks(){
        val book2 = Book("Anabel Winner", "New Wins", "11/1/2001", "",)
        val book3 = Book("Catherine Maina", "The Milestone", "10/1/2002", "",)
        val book4 = Book("Abigail Peter", "Step by Step", "9/1/2003", "",)
        val book5 = Book("Peter Andy", "Love, Life, Laugh", "8/1/2004", "")
        val book6 = Book("Ann Beccy", "Let the Game Begin", "7/1/2005", "",)
        val book7 = Book("Gladwell Wanjiku", "My Experience", "6/1/2006", "",)
        val book8 = Book("Rebecca Shasa", "We Shall Get There", "5/1/2007", "")
        val myBooks= listOf(book2,book3,book4,book5,book6,book7,book8)

        val bookAdapter = BookAdapter(myBooks)
        binding.rvNews.adapter= bookAdapter
    }
}