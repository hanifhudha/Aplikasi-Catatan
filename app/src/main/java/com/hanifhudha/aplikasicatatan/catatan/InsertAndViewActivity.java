package com.hanifhudha.aplikasicatatan.catatan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hanifhudha.aplikasicatatan.R;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class InsertAndViewActivity extends AppCompatActivity implements View.OnClickListener {

    public static final int REQUEST_CODE_STORAGE = 100;
    int eventID = 0;
    EditText editFileName, editContent;
    Button btnSimpan;
    boolean isEdittable = false;
    String fileName = "";
    String tempCatatan = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_and_view_catatan);

        editFileName = findViewById(R.id.edtFileName);
        editContent = findViewById(R.id.edt_notes);
        btnSimpan = findViewById(R.id.btn_submit);

        btnSimpan.setOnClickListener(this);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            fileName = extras.getString("filename");
            editFileName.setText(fileName);
            setTitle("Ubah Catatan");
//            String judul = extras.getString(GlobalVariable.CATATAN_HARIAN);
//            setTitle(judul);
        } else {
            setTitle("Tambah Catatan");
        }
        eventID = 1;
        if (Build.VERSION.SDK_INT >= 23){
//            if (periksaIzinPenyimpanan()){
//                bacaFile();
//            } else {
//                bacaFile();
//            }
        }
    }

//    public void actionSumbitNote(View view) {
//        //aksi setelah submit
//        //melakukan koneksi internet
//        //penyimpanan file
//    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_submit:
                eventID = 2;
                if (!tempCatatan.equals(editContent.getText().toString())){
                    if(Build.VERSION.SDK_INT >= 23){
//                        if (periksaIzinPenyimpanan()){
//                        tampilkanDialogKonfirmasiPenyimpanan();
//                        }
//                    }else {
//                        tampilkanDialogKonfirmasiPenyimpanan();
                    }
                }
                break;
        }
    }

//    public boolean periksaIzinPenyimpanan(){
//        if (Build.VERSION.SDK_INT >= 23){
//            if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED){
//                return true;
//            } else {
//                ActivityCompat.requestPermissions(this, new String[] {
//                        Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_CODE_STORAGE);
//                return false;
//            }
//        } else {
//            return false;
//        }
//    }

//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        switch (requestCode){
//            case REQUEST_CODE_STORAGE:
//                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                    if (eventID == 1) {
//                        bacaFile();
//                    } else {
//                        tampilkanDialogKonfirmasiPenyimpanan();
//                    }
//                }
//                break;
//        }
//    }

//    void bacaFile(){
//        String path = Environment.getExternalStorageDirectory().toString() + "";
//        File file = new File(path, editFileName.getText().toString());
//        if (file.exists()){
//            StringBuilder text = new StringBuilder();
//            try {
//                BufferedReader br = new BufferedReader(new FileReader(file));
//                String line = br.readLine();
//                while (line != null) {
//                    text.append(line);
//                    line = br.readLine();
//                }
//                br.close();
//            } catch (IOException exception) {
//                System.out.println("Error" + exception.getMessage());
//            }
//            tempCatatan = text.toString();
//            editContent.setText(text.toString());
//        }
//    }

//    void buatDanUbah(){
//        String state = Environment.getExternalStorageState();
//        if (!Environment.MEDIA_MOUNTED.equals(state)){
//            return;
//        }
//        String path = Environment.getExternalStorageDirectory().toString() + "";
//        File parent = new File(path);
//        if (parent.exists()){
//            File file = new File(path, editFileName.getText().toString());
//            FileOutputStream outputStream = null;
//            try {
//                file.createNewFile();
//                outputStream = new FileOutputStream(file);
//                OutputStreamWriter streamWriter = new OutputStreamWriter(outputStream);
//                streamWriter.append(editContent.getText());
//                streamWriter.flush();
//                streamWriter.close();
//                outputStream.flush();
//                outputStream.close();
//            } catch (Exception exception){
//                exception.printStackTrace();
//            }
//        } else {
//            parent.mkdir();
//            File file = new File(path, editFileName.getText().toString());
//            FileOutputStream outputStream = null;
//            try {
//                file.createNewFile();
//                outputStream = new FileOutputStream(file, false);
//                outputStream.write(editContent.getText().toString().getBytes());
//                outputStream.flush();
//                outputStream.close();
//            } catch (Exception exception){
//                exception.printStackTrace();
//            }
//        }
//        onBackPressed();
//    }

//    void tampilkanDialogKonfirmasiPenyimpanan(){
//        new AlertDialog.Builder(this)
//                .setTitle("Simpan Catatan")
//                .setMessage("Apakah anda yakin ingin menyimpan catatan ini?")
//                .setIcon(android.R.drawable.ic_dialog_alert)
//                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
//
//                    public void onClick(DialogInterface dialog, int whichButton) {
//                        buatDanUbah();
//                    }
//                })
//                .setNegativeButton(android.R.string.no, null).show();
//    }

//    @Override
//    public void onBackPressed(){
//        if (!tempCatatan.equals(editContent.getText().toString())){
//            tampilkanDialogKonfirmasiPenyimpanan();
//        }
//        super.onBackPressed();
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (item.getItemId() == android.R.id.home){
//            onBackPressed();
//        }
//        return  super.onOptionsItemSelected(item);
//    }
}