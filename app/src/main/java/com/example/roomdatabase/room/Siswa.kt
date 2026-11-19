package com.example.roomdatabase.room

import

@Entity(tableName = "tblSiswa")
data class Siswa(
    @PrimaryKey(autoGenerete = true)
    val id : int = 0,
    val nama : String,
    val alamat : String,
    val telpon : String,
    )