package com.example.mimenu.ui.sumador;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mimenu.R;
import com.example.mimenu.databinding.FragmentPideValoresBinding;

public class PideValoresFragment extends Fragment {

    private PideValoresViewModel mViewModel;
    private FragmentPideValoresBinding binding;

    public static PideValoresFragment newInstance() {
        return new PideValoresFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(PideValoresViewModel.class);
        binding = FragmentPideValoresBinding.inflate(inflater,container,false);
        View root = binding.getRoot();

        mViewModel.getResultado().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                Bundle bundle = new Bundle();
                bundle.putInt("resultado",integer);
                NavOptions op= new NavOptions.Builder()
                        .setLaunchSingleTop(true)
                        .setPopUpTo(R.id.nav_pideValores,true)
                        .build();
                Navigation.findNavController(getActivity(),R.id.nav_host_fragment_content_main).navigate(R.id.resultadoFragment,bundle,op);
            }
        });

        binding.btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewModel.sumar(binding.etNum1.getText().toString(),binding.etNum2.getText().toString());
            }
        });

        return root;
    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // TODO: Use the ViewModel
    }

}