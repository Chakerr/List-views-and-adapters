package unipiloto.edu.starbuzzapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.StrictMode;


public class TopLevelActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .build());

        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .build());

        setContentView(R.layout.activity_top_level);

        setContentView(R.layout.activity_top_level);

        ListView listViewCategorias = findViewById(R.id.listViewCategorias);
        String[] categorias = {"Mascotas", "Servicios", "Tiendas"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, categorias);
        listViewCategorias.setAdapter(adapter);

        listViewCategorias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                try {
                    Intent intent = null;
                    if (position == 0) {
                        intent = new Intent(TopLevelActivity.this, MascotaCategoryActivity.class);
                    } else if (position == 1) {
                        intent = new Intent(TopLevelActivity.this, ServiciosCategoryActivity.class);
                    } else if (position == 2) {
                        intent = new Intent(TopLevelActivity.this, TiendasCategoryActivity.class);
                    }
                    if (intent != null) {
                        startActivity(intent);
                    }
                } catch (Exception e) {
                    e.printStackTrace(); // Esto imprimirá el error en Logcat
                }
            }
        });
    }
}