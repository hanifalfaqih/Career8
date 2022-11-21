package id.allana.career8.ui.home.dudi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import id.allana.career8.R
import id.allana.career8.databinding.ActivityHomeDudiBinding

class HomeDudiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeDudiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeDudiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.bottomNavViewDudi
        val navController = findNavController(R.id.nav_host_fragment_dudi)
        navView.setupWithNavController(navController)

    }
}