package com.example.baseproyect.di

import com.example.baseproyect.ui.fragments.MapFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MapFragmentViewModel() }
}