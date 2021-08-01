package com.virtualpartnurs.ui.index;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.virtualpartnurs.R;
import com.virtualpartnurs.common.ReadOnly;
import com.virtualpartnurs.common.ReadWrite;
import com.virtualpartnurs.ui.user.LoginActivity;

public class IndexFragment extends Fragment {

    private IndexViewModel indexViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        indexViewModel =
                ViewModelProviders.of(this).get(IndexViewModel.class);
        View root = inflater.inflate(R.layout.fragment_index, container, false);

        return root;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);

        // Add click image event
        ImageView imagee = (ImageView) getActivity().findViewById(R.id.boy_1);
        imagee.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                new AlertDialog.Builder(ReadWrite.getMainActivity())
                        .setTitle("Hi master!")
                        .setMessage(ReadOnly.getTip())
                        .setPositiveButton("ok", null)
                        .show();

            }
        });
    }

}