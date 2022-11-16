package id.allana.career8.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import id.allana.career8.data.model.LowonganKerjaEntity
import id.allana.career8.data.model.PelamarKerjaEntity

@Database(entities = [LowonganKerjaEntity::class, PelamarKerjaEntity::class], version = 1, exportSchema = false)
abstract class Career8Database: RoomDatabase() {

    abstract fun career8Dao(): Career8Dao

    companion object {
        @Volatile
        private var INSTANCE: Career8Database? = null

        @JvmStatic
        fun getDatabase(context: Context): Career8Database {
            if (INSTANCE == null) {
                synchronized(Career8Database::class.java) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                    Career8Database::class.java, "career8_database")
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCE as Career8Database
        }
    }

}