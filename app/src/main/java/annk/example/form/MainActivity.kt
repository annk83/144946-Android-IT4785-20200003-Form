package annk.example.form

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import androidx.core.view.isEmpty

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tou = findViewById<CheckBox>(R.id.tou)
        val lname = findViewById<EditText>(R.id.lname)
        val fname = findViewById<EditText>(R.id.fname)
        val mail = findViewById<EditText>(R.id.mail)
        val addr = findViewById<EditText>(R.id.addr)
        val ck = findViewById<RadioGroup>(R.id.radioGroup)
        val b = findViewById<EditText>(R.id.bd)
        val check = {
            !lname.text.isBlank() && !fname.text.isBlank() && !mail.text.isBlank() && !addr.text.isBlank() && !ck.isEmpty() && !b.text.isBlank()
        }

        findViewById<Button>(R.id.register).setOnClickListener {
            if(!check()) Toast.makeText(this, "Must complete the info", Toast.LENGTH_SHORT).show()
            else if(!tou.isChecked) Toast.makeText(this, "Must agree with Term of Use", Toast.LENGTH_SHORT).show()
            else Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show()
        }
    }
}