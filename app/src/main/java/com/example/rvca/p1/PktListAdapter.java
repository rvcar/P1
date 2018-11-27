package com.example.rvca.p1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

class PktListAdapter extends RecyclerView.Adapter<PktListAdapter.ViewHolder> {

    List<Polycarbonate> pkt_list;
    Sotoviy s;

    public PktListAdapter(List<Polycarbonate> pkt_list) {
        this.pkt_list = pkt_list;
    }

    @Override
    public PktListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PktListAdapter.ViewHolder holder, int position) {

        s = (Sotoviy) pkt_list.get(position);

        holder.plength.setText(String.valueOf((s.getPlength())));
        holder.pdepth.setText(String.valueOf((s.getPdepth())));
    }

    @Override
    public int getItemCount() {

        return pkt_list.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView plength;

        public TextView pdepth;


        public ViewHolder(View itemView) {
            super(itemView);

            plength = itemView.findViewById(R.id.tv);

            pdepth = itemView.findViewById(R.id.tv2);
        }


    }
}
