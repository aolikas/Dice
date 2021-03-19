package my.e.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var ivDiceResult: ImageView
    lateinit var btnRoll: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnRoll = findViewById(R.id.btn_roll)
        ivDiceResult = findViewById(R.id.iv_result)
        btnRoll.setOnClickListener(View.OnClickListener {
            rollDice()
        })
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val imgDice = when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        ivDiceResult.setImageResource(imgDice)
    }
}