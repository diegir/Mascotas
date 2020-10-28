package com.diego.miscontactos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class DetalleMascota extends AppCompatActivity {

    ArrayList<Contacto> contactos;
    private RecyclerView listaContactos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_detalle_contacto );

        listaContactos = (RecyclerView) findViewById( R.id.rv2Contactos );
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
    public void irPrimeraActividad(View v){
        Intent intent = new Intent(DetalleMascota.this,MainActivity.class);
        startActivity( intent );
    }

}