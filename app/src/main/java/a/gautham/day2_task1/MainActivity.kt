package a.gautham.day2_task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counter_tv = findViewById<TextView>(R.id.counter_tv);
        val increase = findViewById<Button>(R.id.increase);

        var counter = counter_tv.toString().toInt();

        increase.setOnClickListener {
            counter += 1;
            counter_tv.setText(counter.toString());
        }

    }

}