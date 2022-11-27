package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var tvName: TextView = findViewById(R.id.tvName)
        var tvScore: TextView = findViewById(R.id.tvScore)
        var btnFinish: Button = findViewById(R.id.btnFinish)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)

        val totalQuestion = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctQuestion = intent.getIntExtra(Constants.CORRECT_ANSWER, 0)
        val textScore = "Your score is $correctQuestion out of $totalQuestion"
        tvScore.text = textScore

        btnFinish.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}