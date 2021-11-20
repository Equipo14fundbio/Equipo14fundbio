package com.app.jaunfix;

import androidx.appcompat.app.AlertDialog;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class Resp_Activity extends DialogFragment {
    private Context context;
    private TextView user,edad,fecha,hora,result,xvalor,xfecha,xhora;
    private EditText obtVal;
    private  Button cal;
    FloatingActionButton fb;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.activity_resp, null);

        xvalor = view.findViewById(R.id.xvalor);
        xfecha = view.findViewById(R.id.xfecha);
        xhora = view.findViewById(R.id.xhora);
        fb = view.findViewById(R.id.add);
        user = view.findViewById(R.id.val1);
        edad = view.findViewById(R.id.val2);
        fecha = view.findViewById(R.id.val3);
        hora = view.findViewById(R.id.val4);
        result =view.findViewById(R.id.result);

        user.setText(getArguments().getString("valor"));
        edad.setText(getArguments().getString("edad"));
        fecha.setText(getArguments().getString("fecha"));
        hora.setText(getArguments().getString("hora"));
        result.setText(getArguments().getString("estado"));
        xvalor.setText(getArguments().getString("xvalor"));
        xfecha.setText(getArguments().getString("xfecha"));
        xhora.setText(getArguments().getString("xhora"));


        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Add_Value detail = new Add_Value();
                Bundle args = new Bundle();
                args.putString("valor", user.getText().toString());
                args.putString("edad", edad.getText().toString());
                args.putString("fecha", fecha.getText().toString());
                args.putString("hora", hora.getText().toString());
                detail.setArguments(args);
                detail.show(((Activity) getActivity()).getFragmentManager(), "dialog");
            }
        });



        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(view);
        builder.setTitle("JaunFix Consulta");
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent o = new Intent(getActivity(),MainActivity.class);
                startActivity(o);

            }
        }).setNegativeButton("", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        return builder.create();
    }
}
