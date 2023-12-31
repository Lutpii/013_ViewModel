package com.example.form5

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.form5.Data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update


class CobaViewModel: ViewModel(){
    var namaUsr : String by mutableStateOf("")
        private set
    var noTlp : String by mutableStateOf("")
        private set
    var AlamatUsr : String by mutableStateOf("")
        private set
    var EmailUsr : String by mutableStateOf("")
        private set
    var jenisKl : String by mutableStateOf("")
        private set
    var status : String by mutableStateOf("")
        private set


    private val _uiState = MutableStateFlow(DataForm())
    val uiState : StateFlow<DataForm> = _uiState.asStateFlow()

    fun BacaData(nm:String,tlp:String, jk:String, ema:String,alm:String,stat:String){
        namaUsr=nm;
        noTlp=tlp;
        AlamatUsr=alm;
        EmailUsr=ema;
        jenisKl=jk;
        status=stat;
    }
    fun setJenisK(pilihJK:String) {
        _uiState.update { currentState -> currentState.copy(sex = pilihJK) }
    }
    fun setStat(pilihJK:String) {
        _uiState.update { currentState -> currentState.copy(stat = pilihJK) }
    }
}
