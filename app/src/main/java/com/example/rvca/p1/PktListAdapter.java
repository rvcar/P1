package com.example.rvca.p1;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class PktListAdapter extends RecyclerView.Adapter<PktListAdapter.ViewHolder> {


    List<Polycarbonate> pkt_list;
    Sotoviy s;
    Context ctx;

    public PktListAdapter(List<Polycarbonate> pkt_list, Context c) {
        this.pkt_list = pkt_list;
        ctx = c;
    }

    @Override
    public PktListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new ViewHolder(view, ctx, pkt_list);
    }

    @Override
    public void onBindViewHolder(@NonNull PktListAdapter.ViewHolder holder, int position) {

        s = (Sotoviy) pkt_list.get(position);

        holder.title.setText(s.getTitle());
        holder.plength.setText(String.valueOf((s.getPlength())));
        holder.pdepth.setText(String.valueOf((s.getPdepth())));
    }

    @Override
    public int getItemCount() {

        return pkt_list.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView title, plength, pdepth;
        ImageView iv;


        List<Polycarbonate> p = new ArrayList<Polycarbonate>();
        Context c;


        public ViewHolder(View itemView, Context context, List<Polycarbonate> polycarbonates) {
            super(itemView);
            c = context;
            p = polycarbonates;
            itemView.setOnClickListener(this);


            iv = itemView.findViewById(R.id.plogo);

            title = itemView.findViewById(R.id.tv);

            plength = itemView.findViewById(R.id.textView4);

            pdepth = itemView.findViewById(R.id.textView5);
        }

        @Override
        public void onClick(View v) {
            int pos = getAdapterPosition();
            Sotoviy s = (Sotoviy) pkt_list.get(pos);
            Intent intent = new Intent(c, OrderActivity.class);
            intent.putExtra("length", s.getPlength());
            c.startActivity(intent);

        }
    }
}
