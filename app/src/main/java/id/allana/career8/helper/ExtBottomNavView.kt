package id.allana.career8.helper

import com.google.android.material.bottomnavigation.BottomNavigationView

fun BottomNavigationView.removeItem(id: Int) {
    if (menu.findItem(id) != null)
        menu.removeItem(id)
}