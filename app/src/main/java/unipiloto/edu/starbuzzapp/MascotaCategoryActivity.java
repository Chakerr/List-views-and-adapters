package unipiloto.edu.starbuzzapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MascotaCategoryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascota_category);

        ListView listViewMascotas = findViewById(R.id.listViewMascotas);
        ArrayList<String> listaMascotas = new ArrayList<>();

        listaMascotas.add("Perro Labrador");
        listaMascotas.add("Gato Siamés");
        listaMascotas.add("Pastor Alemán");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaMascotas);
        listViewMascotas.setAdapter(adapter);

        listViewMascotas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MascotaCategoryActivity.this, DetalleMascotaActivity.class);

                // Enviar datos según la posición
                if (position == 0) {
                    intent.putExtra("nombre", "Perro Labrador");
                    intent.putExtra("descripcion", "Perro amigable y enérgico.");
                    intent.putExtra("imagen", R.drawable.perro1);
                } else if (position == 1) {
                    intent.putExtra("nombre", "Gato Siamés");
                    intent.putExtra("descripcion", "Gato curioso y vocal.");
                    intent.putExtra("imagen", R.drawable.gato1);
                } else if (position == 2) {
                    intent.putExtra("nombre", "Pastor Alemán");
                    intent.putExtra("descripcion", "Perro inteligente y leal.");
                    intent.putExtra("imagen", R.drawable.perro2);
                }

                startActivity(intent);
            }
        });
    }
}
