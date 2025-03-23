package unipiloto.edu.starbuzzapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class ServiciosCategoryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios_category);

        ListView listViewServicios = findViewById(R.id.listViewServicios);
        ArrayList<String> listaServicios = new ArrayList<>();

        listaServicios.add("Veterinarias");
        listaServicios.add("Paseadores");
        listaServicios.add("Guarderías");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaServicios);
        listViewServicios.setAdapter(adapter);

        listViewServicios.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ServiciosCategoryActivity.this, DetalleServicioActivity.class);

                // Enviar datos según la posición
                if (position == 0) {
                    intent.putExtra("nombre", "Veterinarias");
                    intent.putExtra("descripcion", "Servicios médicos para mascotas.");
                    intent.putExtra("imagen", R.drawable.veterinaria);
                } else if (position == 1) {
                    intent.putExtra("nombre", "Paseadores");
                    intent.putExtra("descripcion", "Personas que sacan a pasear tu mascota.");
                    intent.putExtra("imagen", R.drawable.paseadores);
                } else if (position == 2) {
                    intent.putExtra("nombre", "Guarderías");
                    intent.putExtra("descripcion", "Lugares seguros para dejar a tu mascota.");
                    intent.putExtra("imagen", R.drawable.guarderia);
                }

                startActivity(intent);
            }
        });
    }
}