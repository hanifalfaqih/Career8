package id.allana.career8.ui.home.alumni

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import id.allana.career8.R
import id.allana.career8.databinding.ActivityHomeAlumniBinding

class HomeAlumniActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeAlumniBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeAlumniBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val navView: BottomNavigationView = binding.bottomNavViewAlumni
        val navController = findNavController(R.id.nav_host_fragment_alumni)
        navView.setupWithNavController(navController)
    }
}