package za.ac.iie.myweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts

class Detailedviewscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailedviewscreen)

        val btnMainscreen: Button =
            findViewById(R.id.btnMainscreen)
        val tvDetails = findViewById<TextView>(R.id.tvDetails)
        val display=
            intent.getStringExtra("Display_Data")
        tvDetails.text= display

        //val tvAvg = findViewById<TextView>(R.Id.tvAvg)
        //val dissplayAverage =
        intent.getStringExtra("Display_Data_Average")
        //tvAvg.text = displayAverage

        btnMainscreen.setOnClickListener {
            val intent = Intent(this,
                Mainscreen::class.java)
            ActivityResultContracts.StartActivityForResult
        }



    }
}