package com.boskopi.tokobuku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_add_book)
public class AddBookActivity extends AppCompatActivity {

    @ViewById
    EditText etBookName;

    @ViewById
    EditText etBookCount;

    @ViewById
    EditText etSupplier;

    @ViewById
    DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @OptionsItem
    void homeSelected(){

    }

    @Click
    void btnSave(){
        if (etBookName.getText().length() == 0 || etBookCount.getText().length() == 0 || etSupplier.getText().length() == 0){
            Toast.makeText(getApplicationContext(), "Silahkan lengkapi data buku !", Toast.LENGTH_LONG).show();
        }else{
            //simpan data buku
            this.finish();
        }
    }

}
