package buu.informatics.s59160587.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton:Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()

    }
}