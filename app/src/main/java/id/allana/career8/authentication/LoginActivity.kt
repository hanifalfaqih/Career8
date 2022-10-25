package id.allana.career8.authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import id.allana.career8.DataDiriActivity
import id.allana.career8.R

class LoginActivity : AppCompatActivity() {

    private lateinit var toRegisterBtn: Button
    private lateinit var login: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()

        toRegisterBtn = findViewById(R.id.to_register_button)
        toRegisterBtn.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }

        login = findViewById(R.id.login_button)
        login.setOnClickListener {
            val intent = Intent(this, DataDiriActivity::class.java)
            startActivity(intent)
        }
    }
}