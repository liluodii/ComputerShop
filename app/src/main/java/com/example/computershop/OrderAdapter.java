package com.example.computershop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.ViewHolder> {

    public LayoutInflater inflater;
    public Context context;

    public OrderAdapter(Context context) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public OrderAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = inflater.inflate(R.layout.cardvieworder, parent, false);
        return new OrderAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final OrderAdapter.ViewHolder holder, int position) {
        final Order order = OrderRepo.getInstance().getorder().get(position);

        holder.itemimage.setImageResource(order.getImage());
        holder.itemname.setText(order.getItemname());
        holder.orderid.setText("Order ID :"+order.getOrderid().toString());
        holder.itemprice.setText(order.getPrice());

        // String model,Display,memory,os,videocard,wireless,keyboard,mouse,harddrive;
    }
    @Override
    public int getItemCount() {
        return OrderRepo.getInstance().getorder().size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView itemimage;

        public TextView itemname,itemprice,orderid;


        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            itemname=itemView.findViewById(R.id.txtorderitemname);
           itemimage=itemView.findViewById(R.id.imgorder);
           itemprice=itemView.findViewById(R.id.txtorderitemprice);
           orderid=itemView.findViewById(R.id.txtorderid);


        }

    }
}