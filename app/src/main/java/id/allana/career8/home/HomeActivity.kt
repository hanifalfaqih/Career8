package id.allana.career8.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import id.allana.career8.R
import id.allana.career8.databinding.ActivityHomeBinding
import id.allana.career8.helper.removeItem

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    companion object {
        const val EMAIL = "email"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.bottomNavView
        val navController = findNavController(R.id.nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.navigation_lowongan_kerja, R.id.navigation_alumni, R.id.navigation_pelamar_kerja, R.id.navigation_profile_alumni, R.id.navigation_lamaran_kerja
        ))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        val email = intent.getStringExtra(EMAIL)

        if (email == "admin@admin.com") {
            navView.removeItem(R.id.menu_lamaran_kerja)
            navView.removeItem(R.id.menu_profile_alumni)
        } else {
            navView.removeItem(R.id.menu_alumni)
            navView.removeItem(R.id.menu_pelamar_kerja)
        }
    }
}