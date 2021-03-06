package com.example.computershop;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class LaptopTypesAdapter extends RecyclerView.Adapter<LaptopTypesAdapter.ViewHolder> {
    public LayoutInflater inflater;
    public Context context;


    public LaptopTypesAdapter(Context context)
    {
        this.context=context;
        this.inflater=LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public LaptopTypesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = inflater.inflate(R.layout.cardview,parent,false);
        return new LaptopTypesAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final LaptopTypesAdapter.ViewHolder holder, final int position) {

        final types types=TypesRepo.getInstance().getCustomers().get(position);

        holder.image.setImageResource(types.getImage());


        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1=new Intent(context,LaptopList.class);
                intent1.putExtra("id",types.getImage());
                intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent1);

            }
        });

    }

    @Override
    public int getItemCount() {
        return TypesRepo.getInstance().getCustomers().size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView image;
        public CardView cardView;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);

            cardView=itemView.findViewById(R.id.cardview_id);
            image=itemView.findViewById(R.id.personimg);

        }

    }
}
