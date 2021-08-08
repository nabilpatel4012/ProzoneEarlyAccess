package com.example.prozone;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class Upload extends AppCompatActivity implements Window.Callback {
    Button uploadbtn;
    TextView choose;

    StorageReference storageReference;
    DatabaseReference databaseReference;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        uploadbtn = findViewById(R.id.upload_btn);
        choose = findViewById(R.id.choose);

        uploadbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/folders/1Eo3489ll6B1hzAa_7l_ubyADYdDsjftQ?usp=sharing");
            }
        });

//        storageReference = FirebaseStorage.getInstance().getReference();
//        databaseReference = FirebaseDatabase.getInstance().getReference("uploadPDF");



//        choose.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                selectPDF();
//            }
//        });
    }
//    private void selectPDF() {
//        Intent intent = new Intent();
//        intent.setType(("application/pdf"));
//        intent.setAction(intent.ACTION_GET_CONTENT);
//        startActivityForResult(Intent.createChooser(intent,"PDF FILE SELECT"),12);
//
//    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        if(requestCode == 12 && resultCode == RESULT_OK && data.getData() != null){
//            uploadbtn.setEnabled(true);
//            choose.setText(data.getDataString().substring(data.getDataString().lastIndexOf("/" + 1)));
//
//            uploadbtn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    uploadPDFFileFirebase(data.getData());
//                }
//            });
//        }
//    }

//    private void uploadPDFFileFirebase(Uri data) {
//
//        final ProgressDialog progressDialog = new ProgressDialog(this);
//        ProgressDialog.setTitle("File is Loading...");
//        progressDialog.show();
//
//        StorageReference reference = storageReference.child("upload" + System.currentTimeMillis() + ".pdf");
//        reference.putBytes(data).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
//            @Override
//            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
//
//            }
//        });
//    }
        private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}