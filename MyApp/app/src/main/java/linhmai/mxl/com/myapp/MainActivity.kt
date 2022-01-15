package linhmai.mxl.com.myapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.buttonRoll)
        rollButton.setOnClickListener(){
            rollDice()
        }

    }
    class Dice(val numSide: Int){
        fun roll():Int{
            return (1..numSide).random()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView:TextView = findViewById(R.id.textViewRoll)
        val imageViewRoll: ImageView = findViewById(R.id.imageViewRoll)

        val drawbleResource = when (diceRoll){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        imageViewRoll.setImageResource(drawbleResource)
        //Descriprion
        imageViewRoll.contentDescription = diceRoll.toString()
    }


}