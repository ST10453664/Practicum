package za.ac.iie.myweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonMainscreen: =
            findViewById<Button>(R.id.buttonMainscreen)
        buttonMainscreen.setOnClickListner {
            val intent = Intent(
                this,
                MainActivity::class.java
            )
            startActivity(Intent)
        }
        val buttonExitapp: Button = findViewById(R.id.buttonExitapp)
        buttonExitapp.setOnClickListener {
            exitProcess(0)

        }
        }
    }
