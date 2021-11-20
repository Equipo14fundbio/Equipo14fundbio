package com.app.jaunfix.adaptadores;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import com.app.jaunfix.R;
import com.app.jaunfix.Resp_Activity;
import com.app.jaunfix.datamodels.Value;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class ValueAdapter  extends RecyclerView.Adapter<ValueAdapter.ViewHolder> {

    private ArrayList<Value> relationsList;
    private Context context;
    public ValueAdapter(ArrayList<Value> relationsList,Context context) {
        this.relationsList = relationsList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.val_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Value relation = relationsList.get(position);
        holder.valorId.append(relation.getValorId());
        holder.fechaId.append(relation.getFechaId());
        holder.horaId.append(relation.getHoraId());
        holder.edadId.append(relation.getEdadId());
    }

    @Override
    public int getItemCount() {
        return relationsList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView valorId, fechaId,horaId,edadId;
        private ImageView delete;
        private DatabaseReference mDatabaseRef;

        ViewHolder(View itemView) {
            super(itemView);
            mDatabaseRef = FirebaseDatabase.getInstance().getReference();
            valorId = (TextView) itemView.findViewById(R.id.valueID);
            edadId = itemView.findViewById(R.id.edadID);
            fechaId= (TextView) itemView.findViewById(R.id.fechaID);
            horaId = itemView.findViewById(R.id.horaID);
            delete =  itemView.findViewById(R.id.btnDelete);
            delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(context);
                    dialog.setTitle("advertencia");
                    dialog.setMessage("¿Estás seguro de eliminar tus datos?");
                    dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            mDatabaseRef.child("valor").child(valorId.getText().toString()).removeValue();
                            Toast.makeText(context, "paso", Toast.LENGTH_SHORT).show();
                            notifyDataSetChanged();
                        }
                    });
                    dialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    Dialog d = dialog.create();
                    d.show();
                }
            });
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Resp_Activity detail = new Resp_Activity();
                    Bundle args = new Bundle();
                    args.putString("valor", valorId.getText().toString());
                    args.putString("edad", edadId.getText().toString());
                    args.putString("fecha", fechaId.getText().toString());
                    args.putString("hora", horaId.getText().toString());
                    detail.setArguments(args);
                    detail.show(((Activity) context).getFragmentManager(), "dialog");
                }
            });
        }
    }
}
