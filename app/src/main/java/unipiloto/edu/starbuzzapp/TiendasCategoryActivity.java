package unipiloto.edu.starbuzzapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class TiendasCategoryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiendas_category);

        ListView listViewTiendas = findViewById(R.id.listViewTiendas);
        ArrayList<String> listaTiendas = new ArrayList<>();

        listaTiendas.add("Tienda de Mascotas A");
        listaTiendas.add("Tienda de Mascotas B");
        listaTiendas.add("Tienda de Mascotas C");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaTiendas);
        listViewTiendas.setAdapter(adapter);

        listViewTiendas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(TiendasCategoryActivity.this, DetalleTiendaActivity.class);

                if (position == 0) {
                    intent.putExtra("nombre", "Tienda de Mascotas A");
                    intent.putExtra("descripcion", "Esta tienda vende productos premium para mascotas.");
                    intent.putExtra("imagen", R.drawable.tienda_a);
                } else if (position == 1) {
                    intent.putExtra("nombre", "Tienda de Mascotas B");
                    intent.putExtra("descripcion", "Ofrecemos comida y juguetes para mascotas.");
                    intent.putExtra("imagen", R.drawable.tienda_b);
                } else if (position == 2) {
                    intent.putExtra("nombre", "Tienda de Mascotas C");
                    intent.putExtra("descripcion", "Venta de ropa y accesorios para mascotas.");
                    intent.putExtra("imagen", R.drawable.tienda_c);
                }

                startActivity(intent);
            }
        });
    }
}