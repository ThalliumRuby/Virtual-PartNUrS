package com.virtualpartnurs.ui.dashboard;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.virtualpartnurs.R;
import com.virtualpartnurs.common.ReadWrite;
import com.virtualpartnurs.entity.Remind;
import com.virtualpartnurs.ui.user.LoginActivity;

import java.util.List;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
        showRemind();
    }

    @SuppressLint({"SetTextI18n", "ResourceType"})
    void showRemind(){
        LinearLayout relativeLayout= (LinearLayout)getActivity().findViewById(R.id.remind_context);
        List<Remind> list = ReadWrite.getReminds();
        int n=1000;
        relativeLayout.removeAllViews();
        for(Remind remind : list){

            TextView a = new TextView(ReadWrite.getMainActivity());
            a.setText(remind.getName()+"  "+remind.getDate());
            a.setId(n++);//设置这个View 的id

            relativeLayout.addView(a);
        }

    }
}