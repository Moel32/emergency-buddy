package com.schoolproject.emergencybuddy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mGreetingTextView =
            findViewById(R.id.activity_main_greeting_txt);
        mEmergencyInput =
            findViewById(R.id.activity_main_emergency_input);
        mHelpButton =
            findViewById(R.id.activity_main_help_btn);

        mHelpButton.isEnabled = false;
        mHelpButton.isEnabled = toString().isNotEmpty();

        mEmergencyInput.addTextChangedListener(textWatcher)

        mHelpButton.setOnClickListener {
            val toast = Toast
                .makeText(applicationContext, "Emergency Noted",
                Toast.LENGTH_SHORT).show()
        }
    }

    private lateinit var mGreetingTextView: TextView;
    private lateinit var mEmergencyInput: EditText;
    private lateinit var mHelpButton: Button;

    private val textWatcher = object : TextWatcher {
        override fun beforeTextChanged(
            s: CharSequence?, start: Int, count: Int,
            after: Int
        ) {

        }
        
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

        }

        override fun afterTextChanged(s: Editable?) {
        }
    }
}