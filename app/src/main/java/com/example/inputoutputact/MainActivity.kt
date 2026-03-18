package com.example.inputoutputact

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //enumerator to switch between different languages
    enum class Languages{
        ENGLISH,
        AFRIKAANS,
        ZULU,
        XHOSA,
        SOTHO
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //assigning UI elements to variables
        val nameTxt = findViewById<EditText>(R.id.nameTxt)
        val zuluSwitch = findViewById<Switch>(R.id.zuluSwitch)
        val displayTxt = findViewById<TextView>(R.id.displayTxt)
        val clickMeBtn = findViewById<Button>(R.id.clickMeBtn)

        //create enum here

        //code for when the button is clicked
        clickMeBtn?.setOnClickListener {
            //local variables only for the scope of THIS function
            var greeting: String
            var zulu: Boolean = zuluSwitch.isChecked
            var age: Int = 20
//
//            //creating a toast to display when the user clicks the button
//            Toast.makeText(this@MainActivity, "Button clicked!",
//                Toast.LENGTH_LONG).show()
//
//            //if Zulu toggle is on
//            if (zulu){
//                greeting = "Sawubona, ${nameTxt}"
//            }
//
//            //if Zulu toggle is NOT on
//            else {
//                //Special greeting if your name is Sam/Samantha AND your age is older than 20
//                if ((nameTxt.text.toString() == "Sam" || nameTxt.text.toString() == "Samantha")
//                    && age > 20){
//
//                    greeting = "Yo ${nameTxt.text}"
//                } else {
//                    //displaying the welcome message to the user
//                    greeting = "Greetings ${nameTxt.text}"
//                }
//            }
//            //display our greeting on the text field in our UI
//            displayTxt.text = greeting
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}