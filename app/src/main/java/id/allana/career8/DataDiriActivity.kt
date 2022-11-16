package id.allana.career8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import id.allana.career8.home.HomeActivity

class DataDiriActivity : AppCompatActivity() {

    private lateinit var btnToHome: Button

    companion object {
        const val EMAIL = "email"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_diri)

        val email = intent.getStringExtra(EMAIL)

        btnToHome = findViewById(R.id.btn_save)
        btnToHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra(HomeActivity.EMAIL, email)
            startActivity(intent)
            finish()
        }
    }
}