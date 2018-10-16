package com.example.user.sampleappkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class SecondActivity : AppCompatActivity() {
    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    private fun showRandomNumber() {
        //Get the count from the intent extras
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        //generate the random number
        val random = Random()
        var randomInt = 0
        if (count > 0) {
            //Add one because the bound is exclusive
            randomInt = random.nextInt(count + 1)
        }
        //display the random number
        textview_random.text  = Integer.toString(randomInt)
        //Substitute the max value into the string resources
        //for the heading, and update the heading
        textView_label.text = getString(R.string.header_random, count)
    }
}
