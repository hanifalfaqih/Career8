package id.allana.career8.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import id.allana.career8.data.model.LowonganKerjaEntity
import id.allana.career8.databinding.ItemLowonganKerjaBinding

class ListLowonganKerjaAdapter :
    ListAdapter<LowonganKerjaEntity, ListLowonganKerjaAdapter.WordViewHolder>(WordsComparator()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val binding = ItemLowonganKerjaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return WordViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class WordViewHolder(private val binding: ItemLowonganKerjaBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: LowonganKerjaEntity) {
            binding.tvJudulLowonganKerja.text = data.judulLowongan
            binding.tvTanggalLowonganKerja.text = data.tanggalLowongan
            binding.tvLokasiLowonganKerja.text = data.lokasiKerja
            binding.tvPerusahaanLowonganKerja.text = data.perusahaan
            binding.tvRentangGaji.text = data.gajiKerja
            binding.tvTipePekerjaan.text = data.jenisKerja

            binding.detailButton.setOnClickListener {

            }
        }
    }

    class WordsComparator : DiffUtil.ItemCallback<LowonganKerjaEntity>() {
        override fun areItemsTheSame(oldItem: LowonganKerjaEntity, newItem: LowonganKerjaEntity): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: LowonganKerjaEntity, newItem: LowonganKerjaEntity): Boolean {
            return oldItem.idLowonganKerja == newItem.idLowonganKerja
        }
    }
}