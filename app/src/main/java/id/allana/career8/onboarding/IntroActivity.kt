package id.allana.career8.onboarding

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.github.appintro.AppIntro2
import com.github.appintro.AppIntroCustomLayoutFragment
import id.allana.career8.LoginActivity
import id.allana.career8.R

class IntroActivity: AppIntro2() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        isSkipButtonEnabled = false

        setIndicatorColor(
            selectedIndicatorColor = ContextCompat.getColor(this, R.color.blue),
            unselectedIndicatorColor = ContextCompat.getColor(this, R.color.black)
        )

        addSlide(AppIntroCustomLayoutFragment.newInstance(R.layout.layout_onboarding_1))
        addSlide(AppIntroCustomLayoutFragment.newInstance(R.layout.layout_onboarding_2))
        addSlide(AppIntroCustomLayoutFragment.newInstance(R.layout.layout_onboarding_3))


    }

    override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
//        val intent = Intent(this, LoginActivity::class.java)
//        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
//        startActivity(intent)
//        finish()
        Toast.makeText(this, "OnDone Pressed", Toast.LENGTH_LONG).show()
    }

    private fun isFirstAppOpen() {

    }
}