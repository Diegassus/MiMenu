package com.example.mimenu.ui.sumador;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PideValoresViewModel extends ViewModel {
    private MutableLiveData<Integer> resultadoMutable;
    // TODO: Implement the ViewModel
    public void sumar(String n1 , String n2){
        int nro1 = Integer.parseInt(n1);
        int nro2 = Integer.parseInt(n2);

        int resultado = nro1 + nro2 ;
        resultadoMutable.setValue(resultado);
    }

    public LiveData<Integer> getResultado(){
        if(resultadoMutable == null){
            resultadoMutable = new MutableLiveData<>();
        }
        return this.resultadoMutable ;
    }
}