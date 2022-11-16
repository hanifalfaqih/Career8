package id.allana.career8.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import id.allana.career8.data.model.LowonganKerjaEntity
import id.allana.career8.data.model.PelamarKerjaEntity
import id.allana.career8.repository.Career8Repository
import kotlinx.coroutines.launch

class Career8ViewModel(private val repository: Career8Repository): ViewModel() {

    init {
        insertAllData()
    }

    private fun insertAllData() = viewModelScope.launch {
        repository.insertAllData()
    }

    fun getAllPelamarKerja(): LiveData<List<PelamarKerjaEntity>> = repository.getAllPelamarKerja()
    fun getAllLowonganKerja(): LiveData<List<LowonganKerjaEntity>> = repository.getAllLowonganKerja()
}

class ViewModelFactory(private val repository: Career8Repository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(Career8ViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return Career8ViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}