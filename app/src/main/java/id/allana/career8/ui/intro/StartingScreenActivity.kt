package id.allana.career8.ui.intro

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import id.allana.career8.R

class StartingScreenActivity : AppCompatActivity() {

    private lateinit var motionLayoutStartingScreen: MotionLayout
    private lateinit var tvOne: TextView
    private lateinit var tvSecond: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_starting_screen)

        supportActionBar?.hide()

        motionLayoutStartingScreen = findViewById(R.id.ml_starting_screen)
        motionLayoutStartingScreen.addTransitionListener(object: MotionLayout.TransitionListener {

            override fun onTransitionStarted(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int
            ) {

            }

            override fun onTransitionChange(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int,
                progress: Float
            ) {

            }

            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
                startActivity(Intent(this@StartingScreenActivity, IntroActivity::class.java))
                finish()
            }

            override fun onTransitionTrigger(
                motionLayout: MotionLayout?,
                triggerId: Int,
                positive: Boolean,
                progress: Float
            ) {

            }

        })
    }

}