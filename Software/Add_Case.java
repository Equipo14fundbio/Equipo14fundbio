package com.app.jaunfix;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.app.jaunfix.datamodels.Value;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Add_Case extends DialogFragment {

    private DatabaseReference rf = FirebaseDatabase.getInstance().getReference();
    private EditText valor,edad;
    private TextView fecha,horav;
    private Button btnfecha,btnhora;
    private Context context;

    Calendar actual = Calendar.getInstance();
    Calendar calendar = Calendar.getInstance();
    private String valorId,fechaId,horaId,edadId;

    private int minutos,hora,dia,mes,year;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.activity_add__case, null);
        btnfecha =  view.findViewById(R.id.btnfecha);
        btnhora =  view.findViewById(R.id.btnhora);
        valor = view.findViewById(R.id.val);
        fecha = view.findViewById(R.id.fecha);
        horav = view.findViewById(R.id.hora);
        edad = view.findViewById(R.id.edadsta);

        btnfecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                year = actual.get(Calendar.YEAR);
                mes = actual.get(Calendar.MONTH);
                dia = actual.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int y, int m, int d) {
                        calendar.set(Calendar.DAY_OF_MONTH,d);
                        calendar.set(Calendar.MONTH,m);
                        calendar.set(Calendar.YEAR,y);

                        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                        String strDate = format.format(calendar.getTime());
                        fecha.setText(strDate);


                    }
                },year,mes,dia);
                datePickerDialog.show();

            }
        });
        btnhora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hora = actual.get(Calendar.HOUR_OF_DAY);
                minutos = actual.get(Calendar.MINUTE);

                TimePickerDialog timePickerDialog = new TimePickerDialog(view.getContext(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int h, int m) {
                        calendar.set(Calendar.HOUR_OF_DAY,h);
                        calendar.set(Calendar.MINUTE,m);

                        horav.setText(String.format("%02d:%02d",h,m));

                    }
                },hora,minutos,true);
                timePickerDialog.show();
            }
        });

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(view);
        builder.setTitle("JaunFix");
        builder.setPositiveButton("Agregar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                valorId =valor.getText().toString();
                fechaId = fecha.getText().toString();
                horaId = horav.getText().toString();
                edadId = edad.getText().toString();

                if (!valorId.equals("")&& !fechaId.equals("") && !horaId.equals("")) {

                    rf.child("valor").child(valorId).setValue(new Value(valorId,fechaId,horaId,edadId));
                    Toast.makeText(getActivity(), "Agreado!", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getActivity(), "por favor llena todos los espacios.", Toast.LENGTH_LONG).show();
                }


            }
        }).setNegativeButton("", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        return builder.create();


    }
}
