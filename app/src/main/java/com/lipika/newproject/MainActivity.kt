package com.lipika.newproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var editText2: EditText
    lateinit var button: Button
    val validPassword ="123456"
    private var counter = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText =findViewById(R.id.editText)
        editText2 =findViewById(R.id.editText2)
        button = findViewById(R.id.button)




        button.setOnClickListener{

            val name = editText.text.toString()
            val password = editText2.text.toString()

            if (name.isEmpty()) {
                Toast.makeText(this,"Enter Your Name", Toast.LENGTH_SHORT).show()
            }
            else {
                if (password == validPassword) {

                    val intent = Intent(this@MainActivity, NotificationActivity::class.java)
                    intent.putExtra("${setData.name}", editText.text.toString())
                    startActivity(intent)
                }
                    else {

                    Toast.makeText(this@MainActivity, "Wrong Password", Toast.LENGTH_LONG)
                        .show()

                        counter--

                        if (counter == 0) {
                            button.isEnabled = false

                            Toast.makeText(this@MainActivity, "Three attempts over", Toast.LENGTH_LONG)
                                .show()
                        }

                    }

            }

        }


    }

}
