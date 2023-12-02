package com.example.testtask1.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testtask1.databinding.FragmentListPaymentsBinding
import com.example.testtask1.view.adapters.PaymentAdapter
import com.example.testtask1.viewModel.AuthViewModel
import com.example.testtask1.viewModel.PaymentViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ListPaymentsFragment : Fragment() {
    private lateinit var binding: FragmentListPaymentsBinding
    private lateinit var adapter: PaymentAdapter
    private val viewModelPayment by viewModels<PaymentViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListPaymentsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = PaymentAdapter()
        viewModelPayment.getListPayments()
        viewModelPayment.currentPaymentState.observe(viewLifecycleOwner) {
            adapter.setPayments(it)
        }
        val manager = LinearLayoutManager(activity)
        binding.paymentRecyclerView.layoutManager = manager
        binding.paymentRecyclerView.adapter = adapter
    }

}