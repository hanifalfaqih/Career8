package id.allana.career8.helper

import android.app.Application
import id.allana.career8.data.local.database.Career8Database
import id.allana.career8.repository.Career8Repository

class MyApplication: Application() {
    val database by lazy { Career8Database.getDatabase(this) }
    val repository by lazy { Career8Repository(database.career8Dao()) }
}