package com.example.crudoperations;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView newproduct;
    TextView deleteproduct ;
    TextView addproduct ;
    TextView editproduct ;
    TextView viewproduct ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        addproduct = findViewById(R.id.addid) ;
        editproduct =  findViewById(R.id.editid);
        viewproduct = findViewById(R.id.viewid);
        deleteproduct =  findViewById(R.id.deleteid);

     addproduct.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View view) {
//               Toast.makeText(getApplicationContext(),"you can add product",Toast.LENGTH_LONG).show();
                 startActivity(new Intent(MainActivity.this, Addprod.class));
//
        } });



        editproduct.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,"you can edit product",Toast.LENGTH_LONG).show();
            } });
        viewproduct.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"you can view product",Toast.LENGTH_LONG).show();
            } });
        deleteproduct.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"you can delete product",Toast.LENGTH_LONG).show();
            } });







        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}