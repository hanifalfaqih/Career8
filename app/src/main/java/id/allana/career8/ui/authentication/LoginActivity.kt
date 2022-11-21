package id.allana.career8.ui.authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.allana.career8.databinding.ActivityLoginBinding
import id.allana.career8.ui.home.alumni.HomeAlumniActivity
import id.allana.career8.ui.home.dudi.HomeDudiActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.btnToRegister.setOnClickListener {
            val intent = Intent(this, DataDiriActivity::class.java)
            startActivity(intent)
        }

        val email = binding.emailInput.text.toString()

        binding.btnLogin.setOnClickListener {
            if (email == "admin@admin.com") {
                val intent = Intent(this, HomeDudiActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                val intent = Intent(this, HomeAlumniActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}