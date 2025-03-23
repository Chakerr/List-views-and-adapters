package unipiloto.edu.starbuzzapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetalleMascotaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_mascota);

        TextView nombre = findViewById(R.id.detalle_nombre);
        TextView descripcion = findViewById(R.id.detalle_descripcion);
        ImageView imagen = findViewById(R.id.detalle_imagen);

        // Obtener datos del intent
        String nombreMascota = getIntent().getStringExtra("nombre");
        String descripcionMascota = getIntent().getStringExtra("descripcion");
        int imagenMascota = getIntent().getIntExtra("imagen", R.drawable.ic_launcher_foreground);

        // Mostrar los datos en la pantalla
        nombre.setText(nombreMascota);
        descripcion.setText(descripcionMascota);
        imagen.setImageResource(imagenMascota);
    }
}