package ru.mggtk.practice14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameText: EditText = findViewById(R.id.editTextText)
        val ageText: EditText = findViewById(R.id.editTextNumber)
        val emailText: EditText = findViewById(R.id.editTextTextEmailAddress)
        val tv1:TextView = findViewById(R.id.textView5)
        val tv2:TextView = findViewById(R.id.textView6)
        val tv3:TextView = findViewById(R.id.textView7)


        val arguments: Bundle? = intent.extras

        if (arguments != null){
            val name: String = arguments.getString("name").toString()
            val email: String? = arguments.getString("email").toString()
            val age: Int = arguments.getInt("age")
            nameText.setText("$name")
            ageText.setText("$age")
            emailText.setText("$email")
            tv1.setText("*")
            tv2.setText("*")
            tv3.setText("*")

    }
    }

    fun btnSendClick(view: View){
        val nameText: EditText = findViewById(R.id.editTextText)
        val ageText: EditText = findViewById(R.id.editTextNumber)
        val emailText: EditText = findViewById(R.id.editTextTextEmailAddress)
        val Name:String?;
        val Age:Int?;
        val Email:String?;
        if(nameText.text.toString()!=""&&ageText.text.toString()!=""&&emailText.text.toString()!="")
        {
            Name = nameText.text.toString()
            Age = ageText.text.toString().toInt()
            Email = emailText.text.toString()
            val intent: Intent = Intent(this@MainActivity, MainActivity2::class.java)

            intent.putExtra("name", Name)
            intent.putExtra("age", Age)
            intent.putExtra("email", Email)

            startActivity(intent)
        }
        else
        {
            if(nameText.text.toString()=="")
                nameText.setText("null")
            if(emailText.text.toString()=="")
                emailText.setText("null")
            if(ageText.text.toString()=="")
                ageText.setText("0")
        }





    }
}