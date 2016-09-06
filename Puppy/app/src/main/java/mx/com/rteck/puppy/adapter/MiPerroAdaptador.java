package mx.com.rteck.puppy.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import mx.com.rteck.puppy.R;
import mx.com.rteck.puppy.pojo.MiPerro;

/**
 * Created by Gerardo Monreal J on 23/08/2016.
 */

public class MiPerroAdaptador  extends RecyclerView.Adapter<MiPerroAdaptador.MiPerroViewHolder>{
    public MiPerroAdaptador(ArrayList<MiPerro> miPerros, Activity activity) {
        this.miPerros = miPerros;
        this.activity = activity;
    }

    ArrayList<MiPerro>miPerros;
    Activity activity;

    @Override
    public MiPerroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_miperro,parent,false);
        return new MiPerroViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MiPerroViewHolder holder, int position) {
        final MiPerro miperro=miPerros.get(position);
        holder.img.setImageResource(miperro.getFoto());
        holder.likes.setText(miperro.Likes());
    }

    @Override
    public int getItemCount() {
        return miPerros.size();
    }

    public static class MiPerroViewHolder extends RecyclerView.ViewHolder{

        private ImageView img;
        private TextView likes;

        public MiPerroViewHolder(View itemView) {
            super(itemView);
            img     =   (ImageView) itemView.findViewById(R.id.imgMiPerro);
            likes   =   (TextView)  itemView.findViewById(R.id.tvLikesMP);
        }
    }
}
