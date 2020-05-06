package com.example.computershop;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class AccessoriesAdapter extends RecyclerView.Adapter<AccessoriesAdapter.ViewHolder>{
    public LayoutInflater inflater;
    public Context context;
    public AccessoriesAdapter(Context context) {
        this.context=context;
        this.inflater=LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public AccessoriesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = inflater.inflate(R.layout.cardviewcomp,parent,false);
        return new AccessoriesAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AccessoriesAdapter.ViewHolder holder, int position) {
        final Accessories accessories=AccessoriesRepo.getInstance().getAccessories().get(position);

        holder.cimage.setImageResource(accessories.getAimage());
        holder.Crating.setText(accessories.getRating());
        holder.Cprice.setText(accessories.getPrice());
        holder.Cdescription.setText(accessories.getName());
        holder.cstar.setImageResource(accessories.getStar());
        // String model,Display,memory,os,videocard,wireless,keyboard,mouse,harddrive;


        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String description=holder.Cdescription.getText().toString();
                Intent intent=new Intent(context,AccessoriesDetail.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("aimage",accessories.getAimage());
                intent.putExtra("description",description);
                intent.putExtra("rating",accessories.getRating());
                intent.putExtra("price",accessories.getPrice());
                intent.putExtra("modelno",accessories.getModelno());
                intent.putExtra("conn",accessories.getConnectivity());
                intent.putExtra("compatibility",accessories.getCompability());
                intent.putExtra("color",accessories.getColor());
                intent.putExtra("star",accessories.getStar());
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return AccessoriesRepo.getInstance().getAccessories().size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView cimage,cstar;
        public CardView cardView;
        public TextView Cdescription,Cprice,Crating;


        public ViewHolder(@NonNull final View itemView) {
            super(itemView);

            cardView=itemView.findViewById(R.id.cardviewcomplist);
            cimage=itemView.findViewById(R.id.cimage);
            cstar=itemView.findViewById(R.id.imgstar);
            Cdescription=itemView.findViewById(R.id.txtcDescription);
            Crating=itemView.findViewById(R.id.txtrating);
            Cprice=itemView.findViewById(R.id.txtprice);


        }

    }
}
