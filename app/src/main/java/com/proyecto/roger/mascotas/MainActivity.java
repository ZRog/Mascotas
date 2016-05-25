package com.proyecto.roger.mascotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Toolbar miActionBar;
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    ImageButton ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        ib = (ImageButton) findViewById(R.id.estrellita);
        ib.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,MascotasFavoritas.class);
                startActivity(i);
            }
        });


        listaMascotas = (RecyclerView) findViewById(R.id.miRV);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarListaContactos();
        inicializarAdaptador();
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaContactos(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.gato,"GATO1",R.mipmap.ic_bone,R.mipmap.ic_rating,0));
        mascotas.add(new Mascota(R.drawable.gato,"GATO2",R.mipmap.ic_bone,R.mipmap.ic_rating,1));
        mascotas.add(new Mascota(R.drawable.gato,"GATO3",R.mipmap.ic_bone,R.mipmap.ic_rating,2));
        mascotas.add(new Mascota(R.drawable.gato,"GATO4",R.mipmap.ic_bone,R.mipmap.ic_rating,3));
        mascotas.add(new Mascota(R.drawable.gato,"GATO5",R.mipmap.ic_bone,R.mipmap.ic_rating,4));
        mascotas.add(new Mascota(R.drawable.gato,"GATO6",R.mipmap.ic_bone,R.mipmap.ic_rating,5));
        mascotas.add(new Mascota(R.drawable.gato,"GATO7",R.mipmap.ic_bone,R.mipmap.ic_rating,6));
        mascotas.add(new Mascota(R.drawable.gato,"GATO8",R.mipmap.ic_bone,R.mipmap.ic_rating,7));
    }
}
