package reyhan.com.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import reyhan.com.adapter.RVExperienceAdapter
import reyhan.com.data.PortofolioData
import reyhan.com.portfolioapp.databinding.FragmentExperienceBinding


private const val GITHUB_LINK = "https://Reyhan05.com"

class ExperienceFragment : Fragment() {
    private var _binding: FragmentExperienceBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExperienceBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapterExperince = RVExperienceAdapter()

        adapterExperince.onItemClicked = { experience ->
            findNavController().navigate(
                ExperienceFragmentDirections.actionExperienceFragmentToExperienceDetailFragment(
                    experience
                )
            )
        }

        adapterExperince.setData(PortofolioData.listDataExperience)
        with(binding.rvExperience) {
            layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
            setHasFixedSize(true)
            adapter = adapterExperince
        }

    }
}