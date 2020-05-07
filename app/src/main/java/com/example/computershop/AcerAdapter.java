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

public class AcerAdapter extends RecyclerView.Adapter<AcerAdapter.ViewHolder>{

    public LayoutInflater inflater;
    public Context context;
    public AcerAdapter(Context context) {
        this.context=context;
        this.inflater=LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public AcerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = inflater.inflate(R.layout.cardviewcomp,parent,false);
        return new AcerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AcerAdapter.ViewHolder holder, int position) {
        final ComputerTypeData computerTypeData=DesktopRepo.getInstance().getAcerData().get(position);

        holder.cimage.setImageResource(computerTypeData.getCimage());
        holder.Crating.setText(computerTypeData.getRating());
        holder.Cprice.setText(computerTypeData.getPrice());
        holder.Cdescription.setText(computerTypeData.getCname());
        holder.cstar.setImageResource(computerTypeData.getStar());
        // String model,Display,memory,os,videocard,wireless,keyboard,mouse,harddrive;


        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String description=holder.Cdescription.getText().toString();
                Intent intent=new Intent(context,ComputerDetail.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("description",description);
                intent.putExtra("rating",computerTypeData.getRating());
                intent.putExtra("price",computerTypeData.getPrice());
                intent.putExtra("model",computerTypeData.getModel());
                intent.putExtra("display",computerTypeData.getDisplay());
                intent.putExtra("memory",computerTypeData.getMemory());
                intent.putExtra("os",computerTypeData.getOs());
                intent.putExtra("videocard",computerTypeData.getVideocard());
                intent.putExtra("wireless",computerTypeData.getWireless());
                intent.putExtra("keyboard",computerTypeData.getKeyboard());
                intent.putExtra("mouse",computerTypeData.getMouse());
                intent.putExtra("harddrive",computerTypeData.getHarddrive());
                intent.putExtra("cImage",computerTypeData.getCimage());
                intent.putExtra("cstar",computerTypeData.getStar());

                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return DesktopRepo.getInstance().getAcerData().size();
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
