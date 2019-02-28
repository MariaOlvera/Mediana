package com.example.maria.mediana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    

int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List <Integer> numero = new ArrayList<Integer>();
        numero.add(3);
        numero.add(2);
        numero.add(4);
        numero.add(1);
        numero.add(5);


        int n= 0;

        for (int i = 0 ; i<numero.size(); i++){
            n +=


              Integer.parseInt(numero.get(i).toString());

           total = n/numero.size();

            System.out.println( "El promedio es " + total);
        }



    }
}
