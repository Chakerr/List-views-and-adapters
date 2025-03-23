package unipiloto.edu.starbuzzapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetalleTiendaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_tienda);

        TextView nombre = findViewById(R.id.detalle_nombre);
        TextView descripcion = findViewById(R.id.detalle_descripcion);
        ImageView imagen = findViewById(R.id.detalle_imagen);

        // Obtener los datos enviados
        String nombreTienda = getIntent().getStringExtra("nombre");
        String descripcionTienda = getIntent().getStringExtra("descripcion");
        int imagenTienda = getIntent().getIntExtra("imagen", -1);

        // Mostrar los datos en la vista
        nombre.setText(nombreTienda);
        descripcion.setText(descripcionTienda);
        imagen.setImageResource(imagenTienda);
    }
}