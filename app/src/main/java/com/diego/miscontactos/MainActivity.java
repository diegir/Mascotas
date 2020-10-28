package com.diego.miscontactos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<Contacto> contactos;
    private RecyclerView listaContactos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaContactos = (RecyclerView) findViewById( R.id.rvContactos );
        LinearLayoutManager llm = new LinearLayoutManager( this );
        llm.setOrientation( LinearLayoutManager.VERTICAL );
        listaContactos.setLayoutManager( llm );
        inicializarListaContactos();
        iniciarlizaAdaptador();

    }

    public void iniciarlizaAdaptador(){
        ContactoAdaptador adaptador = new ContactoAdaptador( contactos );
        listaContactos.setAdapter( adaptador );
    }


    public void inicializarListaContactos(){
        contactos = new ArrayList<Contacto>();
        contactos.add(new Contacto(R.mipmap.golden,"Yaya"));
        contactos.add(new Contacto(R.mipmap.pulgoso,"Jamie"));
        contactos.add(new Contacto(R.mipmap.mancha,"Lara"));
        contactos.add(new Contacto(R.mipmap.kawaii,"Torque"));
        contactos.add(new Contacto(R.mipmap.pastor,"Tini"));
    }

    public void irSegundaActividad(View v){
        Intent intent = new Intent(this,DetalleMascota.class);
        startActivity( intent );
    }


    public void irPrimeraActividad(View view) {
    }
}