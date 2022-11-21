package id.allana.career8.ui.home.alumni

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import id.allana.career8.adapter.ListLowonganKerjaAdapter
import id.allana.career8.databinding.FragmentListLowonganKerjaAlumniBinding
import id.allana.career8.helper.DummyDataSource


class ListLowonganKerjaAlumniFragment : Fragment() {

    private lateinit var binding: FragmentListLowonganKerjaAlumniBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentListLowonganKerjaAlumniBinding.inflate(inflater, container,false)
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
        adapter.submitList(DummyDataSource.listLowonganKerja())
    }
}