package com.samplemasterdialog;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Dialog sampleDialog;
    String nameStr;
    String descriptionStr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sampleDialog = new Dialog(MainActivity.this);
        sampleDialog.setContentView(R.layout.custom_show_dialog);
    }


    public void showDialog(View view) {
        final EditText name=sampleDialog.findViewById(R.id.edit_name);
        final EditText description=sampleDialog.findViewById(R.id.edit_description);
        Button save=sampleDialog.findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameStr=name.getText().toString();
                descriptionStr=description.getText().toString();
                Toast.makeText(getApplicationContext(),"Name  "+nameStr+"description  "+descriptionStr,Toast.LENGTH_SHORT).show();
                //use to close the dialog
               // sampleDialog.dismiss();
            }
        });
        sampleDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        sampleDialog.show();

    }
}
