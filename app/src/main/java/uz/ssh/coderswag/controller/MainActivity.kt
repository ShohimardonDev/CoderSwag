package uz.ssh.coderswag.controller

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import uz.ssh.coderswag.R
import uz.ssh.coderswag.model.Category
import uz.ssh.coderswag.service.DataService

class MainActivity : AppCompatActivity() {
    lateinit var adapter: ArrayAdapter<Category>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(
            this, android.R.layout
                .simple_list_item_1, DataService.categorys
        )
        findViewById<ListView>(R.id.catogoryListView).adapter = adapter

    }
}