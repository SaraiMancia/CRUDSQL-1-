package com.fjar.app_crudsqlite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorArticulos<AdaptorArticulos> extends RecyclerView.Adapter<AdaptadorArticulos.ArticulosViewHolder>{
    //Propiedad de la clase AdaptadorArticulos.
    private Context mCtx;
    private List<Dto> articulosList;
    //Añadimos un contructor a partir de las propiedades definidas en esta clase
    public AdaptadorArticulos(Context mCtx, List<Dto> articulosList) {
        this.mCtx = mCtx;
        this.articulosList = articulosList;
    }

    @Override
    public ArticulosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_recyclerview, null);
        return new ArticulosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ArticulosViewHolder holder, int position) {

        Dto dto = articulosList.get(position);
        holder.textViewCodigo1.setText(String.valueOf(dto.getCodigo()));
        holder.textViewDescripcion1.setText(dto.getDescripcion());
        holder.textViewPrecio1.setText(String.valueOf(dto.getPrecio()));
        holder.textViewId2.setText(String.valueOf(dto.getIdCategoria()));
        holder.textViewOtro.setText(String.valueOf("Registro #:" + (position+1)) + "/" +
                getItemCount());
    }
    @Override
    public int getItemCount() {
        return articulosList.size();
    }
    public static class ArticulosViewHolder extends RecyclerView.ViewHolder {
        TextView textViewCodigo1, textViewDescripcion1, textViewPrecio1, textViewId2, textViewOtro;

        public ArticulosViewHolder(View itemView) {
            super(itemView);
            textViewCodigo1 = itemView.findViewById(R.id.textViewCodigo1);
            textViewDescripcion1 = itemView.findViewById(R.id.textViewDescripcion1);
            textViewPrecio1= itemView.findViewById(R.id.textViewPrecio1);
            textViewId2=itemView.findViewById(R.id.textViewId2);
            textViewOtro = itemView.findViewById(R.id.textViewOtro);
            //imageView = itemView.findViewById(R.id.imageView);
        }
    }
    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}




