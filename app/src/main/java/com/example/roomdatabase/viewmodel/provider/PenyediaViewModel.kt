package com.example.roomdatabase.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.roomdatabase.AplikasiSiswa
import com.example.roomdatabase.viewmodel.DetailViewModel
import com.example.roomdatabase.viewmodel.EditViewModel
import com.example.roomdatabase.viewmodel.EntryViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {

        initializer {
            _root_ide_package_.com.example.roomdatabase.viewmodel.HomeViewModel(aplikasiSiswa().container.repositoriSiswa)
        }

        initializer {
            _root_ide_package_.com.example.roomdatabase.viewmodel.EntryViewModel(aplikasiSiswa().container.repositoriSiswa)
        }

        initializer {
            EntryViewModel(aplikasiSiswa().container.repositoriSiswa)
        }

        initializer {
            DetailViewModel(this.createSavedStateHandle(),
                aplikasiSiswa().container.repositoriSiswa)
        }

        initializer {
            EditViewModel(this.createSavedStateHandle(),
                aplikasiSiswa().container.repositoriSiswa)
        }
    }
}

/**
 * Fungsi ekstensi query untuk objek [Application] dan mengembalikan sebuah instance dari
 * [AplikasiSiswa].
 */
fun CreationExtras.aplikasiSiswa(): AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)