package unipiloto.edu.starbuzzapp;

import android.os.Bundle;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DrinkActivity extends AppCompatActivity {
    public static final String EXTRA_DRINKID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        // Obtener el ID de la bebida seleccionada
        int drinkId = getIntent().getIntExtra(EXTRA_DRINKID, 0);
        Drink drink = Drink.drinks[drinkId];

        // Actualizar la interfaz con los datos de la bebida
        TextView name = findViewById(R.id.drink_name);
        name.setText(drink.getName());

        TextView description = findViewById(R.id.drink_description);
        description.setText(drink.getDescription());

        ImageView image = findViewById(R.id.drink_image);
        image.setImageResource(drink.getImageResourceId());
    }
}