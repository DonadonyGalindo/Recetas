package com.example.donadonydonaji.recetas;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by donadonydonaji on 04/09/2017.
 */

public class Adaptador extends ArrayAdapter<String> {


    private final Activity context;
    private final String[] itemname;
    private final Integer[] integers;

    public Adaptador(Activity context, String[] itemname, Integer[] integers) {
        super(context, R.layout.fila_lista, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.integers=integers;
    }

    public View getView(int posicion, View view, ViewGroup parent){


        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.fila_lista,null,true);

        TextView txtNombre = (TextView) rowView.findViewById(R.id.Nombre);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.foto);




        txtNombre.setText(itemname[posicion]);

        imageView.setImageResource(integers[posicion]);

        return rowView;
    }


}
