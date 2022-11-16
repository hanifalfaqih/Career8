package id.allana.career8.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import id.allana.career8.R
import id.allana.career8.adapter.ListLowonganKerjaAdapter
import id.allana.career8.databinding.FragmentListLowonganKerjaBinding
import id.allana.career8.databinding.ItemLowonganKerjaBinding
import id.allana.career8.helper.MyApplication
import id.allana.career8.ui.Career8ViewModel
import id.allana.career8.ui.ViewModelFactory


class ListLowonganKerjaFragment : Fragment() {

    private lateinit var binding: FragmentListLowonganKerjaBinding
    private val viewModel: Career8ViewModel by viewModels {
        ViewModelFactory((context as MyApplication).repository)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentListLowonganKerjaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvLowonganKerja.layoutManager = LinearLayoutManager(context)
        getListLowonganKerja()
    }

    private fun getListLowonganKerja() {
        val adapter = ListLowonganKerjaAdapter()
        binding.rvLowonganKerja.adapter = adapter
        viewModel.getAllLowonganKerja().observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }
    }
}