package com.virtualpartnurs.ui.user;

import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import com.virtualpartnurs.R;
import com.virtualpartnurs.common.ReadOnly;
import com.virtualpartnurs.common.ReadWrite;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View v){
        EditText a = (EditText)findViewById(R.id.username);
        EditText b = (EditText)findViewById(R.id.password);
        String username = a.getText().toString();
        String password = b.getText().toString();
        if("".equals(username)){
            new AlertDialog.Builder(this)
                    .setTitle("error!")
                    .setMessage("The account is not empty")
                    .setPositiveButton("ok", null)
                    .show();
        }else if(username.equals(password)){
            ReadWrite.setUsername(username);
            finish();
        }else{
            new AlertDialog.Builder(this)
                    .setTitle("error!")
                    .setMessage("The account passwords must be the same")
                    .setPositiveButton("ok", null)
                    .show();
        }

    }

}
