package com.example.tictactoe
//https://brainoncode.com/tic-tac-toe-android-kotlin-tutorial-part-3/
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.graphics.drawable.Drawable
import android.widget.ImageButton
import androidx.core.content.res.ResourcesCompat

class MainActivity : AppCompatActivity() {
    //TODO() 1: declare class variables here
    lateinit var buttons: Array<Array<Button>>
    lateinit var textViewPlayer1: TextView
    lateinit var textViewPlayer2: TextView

    private var player1Turn: Boolean = true
    private var roundCount: Int = 0
    private var player1Points: Int = 0
    private var player2Points: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO() 2: initialize player 1 and player 2 textviews
        textViewPlayer1 = findViewById(R.id.player1TextView)
        textViewPlayer2 = findViewById(R.id.player2TextView)
        //TODO() 3: initialize 3x3 buttons
        buttons = Array(3){r->
            Array(3){c->
                initButton(r, c)
            }
        }
        //TODO() 5: initialize resetbutton
        //TODO() 6: set reset button onclick listener
        val btnReset: Button = findViewById(R.id.btnReset)
        btnReset.setOnClickListener{
            Toast.makeText(
                applicationContext,
                "Reset game button clicked!",
                Toast.LENGTH_SHORT).show()
        }


    }
    //TODO() 4: declare initButton() function to initialize and set onClickListener to each button in 3x3 array.

    private fun initButton(r: Int, c: Int): Button {
        val btn: Button =
            findViewById(resources.getIdentifier("btn$r$c", "id", packageName))
        btn.setOnClickListener{
            Toast.makeText(
                applicationContext,
                "button $r$c clicked",
                Toast.LENGTH_SHORT).show()
        }
        return btn
    }
}