package com.example.insorma;

import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.insorma.modelSet.Furniture;

import java.util.Vector;

public class FurnitureAdapter extends RecyclerView.Adapter<FurnitureAdapter.ViewHolder> {

    private Vector<Furniture> furnitures = new Vector<>();
    private ItemClickListener nItemListener;

    public FurnitureAdapter(Vector<Furniture> furnitures, ItemClickListener itemClickListener){
        this.furnitures = furnitures;
        this.nItemListener = itemClickListener;
    }

    @NonNull
    @Override
    public FurnitureAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_furniture, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FurnitureAdapter.ViewHolder holder, int position) {
        holder.cover.setImageResource(furnitures.get(position).getCover());
        holder.title.setText(furnitures.get(position).getTitle());
        holder.rating.setText(furnitures.get(position).getRating());
        holder.price.setText(furnitures.get(position).getPrice());

        holder.itemView.setOnClickListener(view -> {
            nItemListener.onItemClick(furnitures.get(position));
        });

    }

    @Override
    public int getItemCount() {
        return furnitures.size();
    }

    public interface ItemClickListener{
        void onItemClick(Furniture furniture);
    }



    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView cover;
        TextView title, rating, price;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cover = itemView.findViewById(R.id.imageView);
            title = itemView.findViewById(R.id.itemTittle);
            rating = itemView.findViewById(R.id.itemRating);
            price = itemView.findViewById(R.id.itemPrice);
        }
    }
}
