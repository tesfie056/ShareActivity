package edu.temple.funwithintents

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // This view contains the text to share
        val editText = findViewById<EditText>(R.id.editTextText)

        // When the user clicks this button, share the text
        findViewById<ImageButton>(R.id.shareImageButton).setOnClickListener {

            val intent = Intent().apply {
               action = Intent.ACTION_SEND
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, editText.text)

            }
            startActivity(Intent.createChooser(intent, null))

        }
    }
}



















//val share_text_1_btn = findViewById<com.google.android.material.floatingactionbutton.FloatingActionButton>(R.id.share_text_1_btn)
//share_text_1_btn.setOnClickListener {
//    val intent= Intent()
//    intent.action=Intent.ACTION_SEND
//    intent.putExtra(Intent.EXTRA_TEXT,"Hey Check out this Great app:")
//override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//share_text_1_btn.setOnClickListener {
//            val t1 = share_text_1_t.text.toString()
//            val shareIntent = Intent()
//            shareIntent.action = Intent.ACTION_SEND
//            shareIntent.type="text/plain"
//            shareIntent.putExtra(Intent.EXTRA_TEXT, t1)
//            startActivity(Intent.createChooser(shareIntent,"Share via"))
//        }
//}