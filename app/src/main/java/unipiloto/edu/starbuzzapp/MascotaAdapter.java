package unipiloto.edu.starbuzzapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class MascotaAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Mascota> mascotas;

    public MascotaAdapter(Context context, ArrayList<Mascota> mascotas) {
        this.context = context;
        this.mascotas = mascotas;
    }

    @Override
    public int getCount() {
        return mascotas.size();
    }

    @Override
    public Object getItem(int position) {
        return mascotas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item_mascota, parent, false);
        }

        Mascota mascota = mascotas.get(position);

        ImageView imageView = convertView.findViewById(R.id.mascota_imagen);
        TextView nombreTextView = convertView.findViewById(R.id.mascota_nombre);
        TextView descripcionTextView = convertView.findViewById(R.id.mascota_descripcion);

        imageView.setImageResource(mascota.getImagenId());
        nombreTextView.setText(mascota.getNombre());
        descripcionTextView.setText(mascota.getDescripcion());

        return convertView;
    }
}