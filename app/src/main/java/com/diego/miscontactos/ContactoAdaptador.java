package com.diego.miscontactos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactoAdaptador extends RecyclerView.Adapter<ContactoAdaptador.ContactoViewHolder> {
    ArrayList<Contacto> contactos;

    public ContactoAdaptador(ArrayList<Contacto> contactos){
        this.contactos = contactos;
    }


    //Inflar el layout y lo pasara al viewholder para el obtenga los views
    @NonNull
    @Override
    public ContactoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from( parent.getContext() ).inflate( R.layout.cardview_contacto, parent, false );

        return new ContactoViewHolder( v );
    }

    //asocia cada elemento de la lista con cada view
    @Override
    public void onBindViewHolder(@NonNull ContactoViewHolder contactoViewHolder, int position) {
        Contacto contacto = contactos.get( position );
        contactoViewHolder.imgFoto.setImageResource( contacto.getFoto() );
        contactoViewHolder.tvNombreCV.setText( contacto.getNombre() );
    }

    @Override
    public int getItemCount() { //Cantidad de elementos que contiene mi lista
        return contactos.size();
    }

    public static class ContactoViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFoto;
        private TextView tvNombreCV;

        public ContactoViewHolder(@NonNull View itemView) {
            super( itemView );
            imgFoto      = (ImageView) itemView.findViewById( R.id.imgFoto );
            tvNombreCV   = (TextView) itemView.findViewById( R.id.tvNombreCV );
        }
    }
}
