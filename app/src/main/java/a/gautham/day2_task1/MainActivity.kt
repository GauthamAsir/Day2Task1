package a.gautham.day2_task1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counterTv = findViewById<TextView>(R.id.counter_tv)
        val increase = findViewById<Button>(R.id.increase)

        var counter = 0

        increase.setOnClickListener {
            counter += 1
            counterTv.text = counter.toString()
        }

    }

}