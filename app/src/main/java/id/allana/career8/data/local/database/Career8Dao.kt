package id.allana.career8.data.local.database

import androidx.lifecycle.LiveData
import androidx.room.*
import id.allana.career8.data.model.LowonganKerjaEntity
import id.allana.career8.data.model.PelamarKerjaEntity

@Dao
interface Career8Dao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertLowonganKerja(lowonganKerja: List<LowonganKerjaEntity>)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertPelamarKerja(pelamarKerja: List<PelamarKerjaEntity>)

    @Query("SELECT * FROM lowongan_kerja")
    fun getListLowonganKerja(): LiveData<List<LowonganKerjaEntity>>

    @Query("SELECT * FROM pelamar_kerja")
    fun getListPelamarKerja(): LiveData<List<PelamarKerjaEntity>>
}