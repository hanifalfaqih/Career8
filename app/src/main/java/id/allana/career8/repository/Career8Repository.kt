package id.allana.career8.repository

import androidx.lifecycle.LiveData
import id.allana.career8.data.local.database.Career8Dao
import id.allana.career8.data.model.LowonganKerjaEntity
import id.allana.career8.data.model.PelamarKerjaEntity
import id.allana.career8.helper.DummyDataSource

class Career8Repository(private val career8Dao: Career8Dao) {
    fun getAllLowonganKerja(): LiveData<List<LowonganKerjaEntity>> = career8Dao.getListLowonganKerja()

    fun getAllPelamarKerja(): LiveData<List<PelamarKerjaEntity>> = career8Dao.getListPelamarKerja()

    suspend fun insertAllData() {
        career8Dao.insertLowonganKerja(DummyDataSource.listLowonganKerja())
        career8Dao.insertPelamarKerja(DummyDataSource.listPelamarKerja())
    }

}