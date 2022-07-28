package com.dx.DXBusiness.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dx.DXBusiness.R
import com.dx.DXBusiness.databinding.FragmentHomeBinding
import com.dx.DXBusiness.ui.home.adapter.CustomAdapter

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        setRecyclerView(root)

        return root
    }

    private fun setRecyclerView(root: View){
        // getting the recyclerview by its id
        val recyclerview = root.findViewById<RecyclerView>(R.id.rv_home)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(requireContext())

        // ArrayList of class ItemsViewModel
        val data = ArrayList<String>()

        data.add("ORDERS")
        data.add("HOW IT WORKS")
        data.add("ABOUT US")
        data.add("CONTACT US")

        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data, requireContext())

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}