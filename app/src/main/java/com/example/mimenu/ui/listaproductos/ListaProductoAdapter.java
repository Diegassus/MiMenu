package com.example.mimenu.ui.listaproductos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.mimenu.R;
import com.example.mimenu.models.Producto;

import java.util.List;

public class ListaProductoAdapter extends RecyclerView.Adapter<ListaProductoAdapter.ViewHolder> {

    private Context context ;
    private List<Producto> productos;
    private LayoutInflater li;

    public ListaProductoAdapter(Context context, List<Producto> lista , LayoutInflater inflaeter){
        this.context = context;
        this.productos = lista;
        this.li = inflaeter;
    }

    @NonNull
    @Override // prepara caja
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = li.inflate(R.layout.item_producto,parent,false);
        return new ViewHolder(root);
    }

    @Override // llena la caja (se ejecuta x cada item de la lista en el display)
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //holder.fotoProducto.setImageResource(productos.get(position).getFoto());
        holder.precio.setText(productos.get(position).getPrecio()+"");
        holder.descripcion.setText(productos.get(position).getDescripcion());
        Glide.with(context).load(productos.get(position).getFoto()).diskCacheStrategy(DiskCacheStrategy.ALL).into(holder.fotoProducto);
    }

    @Override
    public int getItemCount() {
        return productos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView fotoProducto;
        TextView descripcion, precio;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fotoProducto= itemView.findViewById(R.id.ivFoto);
            descripcion = itemView.findViewById(R.id.tvDescripcion);
            precio = itemView.findViewById(R.id.tvPrecio);
        }
    }

}
