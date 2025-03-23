package unipiloto.edu.starbuzzapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetalleServicioActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_servicio);

        TextView nombre = findViewById(R.id.detalle_nombre);
        TextView descripcion = findViewById(R.id.detalle_descripcion);
        ImageView imagen = findViewById(R.id.detalle_imagen);

        // Obtener datos del intent
        String nombreServicio = getIntent().getStringExtra("nombre");
        String descripcionServicio = getIntent().getStringExtra("descripcion");
        int imagenServicio = getIntent().getIntExtra("imagen", R.drawable.ic_launcher_foreground);

        // Mostrar los datos en la pantalla de detalle
        nombre.setText(nombreServicio);
        descripcion.setText(descripcionServicio);
        imagen.setImageResource(imagenServicio);
    }
}