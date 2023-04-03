package com.example.mimenu.ui.sumador;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mimenu.R;
import com.example.mimenu.databinding.FragmentResultadoBinding;

public class ResultadoFragment extends Fragment {

    private ResultadoViewModel mViewModel;
    private FragmentResultadoBinding binding;

    public static ResultadoFragment newInstance() {
        return new ResultadoFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(ResultadoViewModel.class);
        binding = FragmentResultadoBinding.inflate(inflater,container,false);
        View root = binding.getRoot();

        Bundle recuperado = getArguments();
        ;
        binding.textView4.setText(recuperado.getInt("resultado", -1) + "");

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ResultadoViewModel.class);
        // TODO: Use the ViewModel
    }

}