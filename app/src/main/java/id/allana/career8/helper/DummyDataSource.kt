package id.allana.career8.helper

import id.allana.career8.data.model.LowonganKerjaEntity
import id.allana.career8.data.model.PelamarKerjaEntity

object DummyDataSource {

    fun listLowonganKerja(): List<LowonganKerjaEntity> {
        return listOf(
            LowonganKerjaEntity(1, "Android Developer", "25 Desember 2022", "Semarang", "10jt - 15jt", "Fulltime", "", "18 - 35 tahun", "MVVM, Clean Architecture, Android Jetpack, Compose, Kotlin", "Google Inc"),
            LowonganKerjaEntity(2, "iOS Developer", "25 Desember 2022", "Semarang", "10jt - 15jt", "Magang", "", "18 - 35 tahun", "Swift, Objective C, Clean Architecture", "Apple Inc"),
            LowonganKerjaEntity(3, "Frontend Developer", "25 Desember 2022", "Semarang", "10jt - 15jt", "Kontrak", "", "18 - 35 tahun", "Javascript, HTML, CSS, Bootstrap", "Samsan Tech"),
            LowonganKerjaEntity(4, "Backend Developer", "25 Desember 2022", "Semarang", "10jt - 15jt", "Part time", "", "18 - 35 tahun", "MySQL, Docker, Kubernetes, PHP", "Serba Bisa Corp.")
        )
    }

    fun listPelamarKerja(): List<PelamarKerjaEntity> {
        return listOf(
            PelamarKerjaEntity(1, "Android Developer", "25 Desember 2022", "Maulana Hanif Al-Faqih Rojichan", "2024", "Pengembangan Perangkat Lunak dan Gim"),
            PelamarKerjaEntity(2, "Chief Technology Officer", "25 Desember 2022", "Maulana Hanif Al-Faqih Rojichan", "2024", "Pengembangan Perangkat Lunak dan Gim"),
            PelamarKerjaEntity(3, "Chief Executive Officer", "25 Desember 2022", "Maulana Hanif Al-Faqih Rojichan", "2024", "Pengembangan Perangkat Lunak dan Gim")
        )
    }

}