package id.allana.career8.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("lowongan_kerja")
data class LowonganKerjaEntity(
    @PrimaryKey
    val idLowonganKerja: Int,
    val judulLowongan: String,
    val tanggalLowongan: String,
    val lokasiKerja: String,
    val gajiKerja: String,
    val jenisKerja: String,
    val jenisKelamin: String,
    val rentangUmur: String,
    val kemampuanKerja: String,
    val perusahaan: String
)

@Entity("pelamar_kerja")
data class PelamarKerjaEntity(
    @PrimaryKey
    val idPelamarKerja: Int,
    val judulLowongan: String,
    val tanggalPelamar: String,
    val namaPelamar: String,
    val tahunLulus: String,
    val jurusanPelamar: String
)