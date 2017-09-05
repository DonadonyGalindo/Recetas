package com.example.donadonydonaji.recetas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  ListView.OnItemClickListener {
    private String[] Nombres={
            "Ensalada de garbanzos con gulas al ajillo",
            "Mejillones con salsa de tomate picante",
            "Sandwich Pizza de Jamón York y Queso",
            "Chow mein de cebolla y zanahoria",
            "Albóndigas de patata rellenas de queso",
            "Fajitas de pollo picante",
            "Pollo agridulce",
            "Alitas de pollo a la mostaza"
    };
    private Integer[] Foto= {
            R.drawable.recipe_1631,
            R.drawable.recipe_1630,
            R.drawable.recipe_1627,
            R.drawable.recipe_1628,
            R.drawable.recipe_1146,
            R.drawable.recipe_1622,
            R.drawable.recipe_956,
            R.drawable.recipe_250
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Adaptador adapter=new Adaptador(this,Nombres,Foto);
        ListView lista=(ListView)findViewById(R.id.Lista);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position) {

                    case 0:{

                        Intent i = new Intent(getApplicationContext(), recceta1.class);
                        startActivity(i);
                        break;}

                    case 1:{

                        Intent i = new Intent(getApplicationContext(), recceta2.class);
                        startActivity(i);
                        break;}
                }
    }
}
