package my.e.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnRoll: Button = findViewById(R.id.btn_roll)
        val txtResult: TextView = findViewById(R.id.txt_result)
        btnRoll.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
        })

    }
}