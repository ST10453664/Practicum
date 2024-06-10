package za.ac.iie.myweatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import org.w3c.dom.Text
import java.time.MonthDay

class Mainscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainscreen)

        override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
            super.onCreate(savedInstanceState, persistentState)
            setContentView(R.layout.activity_mainscreen)
            val Mondayinput = findViewById<TextView>(R.id.Mondayinput)
            val Tuesdayinput = findViewById<TextView>(R.id.Tuesdayinput)
            val Wednesdayinput = findViewById<TextView>(R.id.Wednesdayinput)
            val Thursdayinput = findViewById<TextView>(R.id.Thursdayinput)
            val Fridayinput = findViewById<TextView>(R.id.Fridayinput)
            val Saturdayinput = findViewById<TextView>(R.id.Saturdayinput)
            val Sundayinput = findViewById<TextView>(R.id.Sundayinput)

            // Initialize them
            var i: Int = 0 // Stores number of entries in array
            var display: String = "" // Display blank first
            val maxEntries = 7 // Only allow 7 array entries

            var averageAm: Int = 0
            var averagePm: Int = 0
            var averageTotal: Int = 0
            var displayAverage: String = ""

            //Create arrays
            val Monday = array(maxEntries) {""}
            val Tuesday = array(maxEntries) {""}
            val Wednesday = array(maxEntries) {""}
            val Thursday = array(maxEntries) {""}
            val Friday = array(maxEntries) {""}
            val Saturday = array(maxEntries) {""}
            val Sunday = array(maxEntries) {""}

            val buttonInsert: Button = findViewById<Button>(R.id.buttonInsert)
            val buttonDetails: Button = findViewById<Button>(R.id.buttonDetails)
            val buttonClear: Button = findViewById<Button>(R.id.buttonClear)

            buttonDetails.setOnClickListener {
                val intent = intent (this,Detailedviewscreen::class.java)
                startActivity(intent)
            }
            buttonClear.setOnClickListener {
                Mondayinput.text = ""
                Tuesdayinput.text = ""
                Wednesdayinput.text = ""
                Thursdayinput.text = ""
                Fridayinput.text = ""
                Saturdayinput.text = ""
                Sundayinput.text = ""

                // Pass the data to DetailedViewActivity and start the activity
                val intent = Intent(this, DetailedViewActivity::class.java)
                intent.putExtra("DISPLAY_DATA", display)
                intent.putExtra("DISPLAY_DATA_AVG", displayAverage)
                startActivity(intent)

            }
        }


    }

}