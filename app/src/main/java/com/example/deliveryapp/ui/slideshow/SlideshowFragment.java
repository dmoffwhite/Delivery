package com.example.deliveryapp.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


import com.example.deliveryapp.DiscountActivity;
import com.example.deliveryapp.IdiomActivity;
import com.example.deliveryapp.RateActivity;
import com.example.deliveryapp.TerminosActivity;
import com.example.deliveryapp.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {

    private Button btnTerminos, btnIdioma, btnCalificacion, btnDescuentos;
private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        btnTerminos = binding.btnTerminos;
        btnTerminos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TerminosActivity.class);
                startActivity(intent);
            }
        });

        btnIdioma = binding.btnIdioma;
        btnIdioma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), IdiomActivity.class);
                startActivity(intent);
            }
        });

        btnCalificacion = binding.btnCalificacion;
        btnCalificacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), RateActivity.class);
                startActivity(intent);
            }
        });

        btnDescuentos = binding.btnDescuentos;
        btnDescuentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DiscountActivity.class);
                startActivity(intent);
            }
        });

        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}