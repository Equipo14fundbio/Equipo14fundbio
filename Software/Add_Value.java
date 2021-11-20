package com.app.jaunfix;

import androidx.appcompat.app.AlertDialog;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Add_Value  extends DialogFragment {
    private TextView fecha,horav,result,re1,re2,re3,re4;
    private EditText valor,edad;
    private Button btnfecha,btnhora;
    private EditText obtVal;
    private  Button cal;
    Calendar actual = Calendar.getInstance();
    Calendar calendar = Calendar.getInstance();

    private int minutos,hora,dia,mes,year;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.activity_add__value, null);
        btnfecha =  view.findViewById(R.id.btnfecha);
        btnhora =  view.findViewById(R.id.btnhora);
        valor = view.findViewById(R.id.val);
        fecha = view.findViewById(R.id.fecha);
        horav = view.findViewById(R.id.hora);
        edad = view.findViewById(R.id.edadsta);
        cal = view.findViewById(R.id.cal);
        obtVal = view.findViewById(R.id.valorOb);
        result =view.findViewById(R.id.result);

        re1 = view.findViewById(R.id.replypaci);
        re2 = view.findViewById(R.id.replyedad);
        re3 = view.findViewById(R.id.replyfecha);
        re4 = view.findViewById(R.id.replyhora);

        re1.setText(getArguments().getString("valor"));
        re2.setText(getArguments().getString("edad"));
        re3.setText(getArguments().getString("fecha"));
        re4.setText(getArguments().getString("hora"));

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
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edadvalor = obtVal.getText().toString();
                int valor_int = Integer.parseInt(edadvalor);
                int result_value = (valor_int);

                if (result_value < 100){
                    result.setText("Normal");
                }
                else if (result_value<150){
                    result.setText("Bajo Riesgo" +
                            " Recomendación: Realizar una medición en las próximas 6-12 horas");
                }
                else if (result_value<200){
                    result.setText("Bajo Riesgo" +
                            " Recomendación: Requiere observación, se recomienda considerar el inicio de la fototerapia");
                }
                else if (result_value<300){
                    result.setText("Medio Riesgo" +
                            " Recomendación: Iniciar sesión de fototerapia. Primera medición de 4-6 horas del inicio, después iniciar multiples sesiones de fototerapia si hay un aumento mayor a 8.5µmol/L/hora o solo realizar medición cada 6-12 horas si los niveles descienden.");
                }
                else if (result_value<1000){
                    result.setText("Alto Riesgo" +
                            " Recomendación: se requiere iniciar exanguinotransfusión a menos que los valores comiencen a descender antes del inicio");
                }

                Resp_Activity detail = new Resp_Activity();
                Bundle args = new Bundle();
                args.putString("valor", re1.getText().toString());
                args.putString("edad", re2.getText().toString());
                args.putString("fecha", re3.getText().toString());
                args.putString("hora", re4.getText().toString());
                args.putString("estado", result.getText().toString());

                detail.setArguments(args);
                detail.show(((Activity) getActivity()).getFragmentManager(), "dialog");

            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(view);
        builder.setTitle("Agregar Valor");
        builder.setPositiveButton("Calcular", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                String edadvalor = obtVal.getText().toString();

                int valor_int = Integer.parseInt(edadvalor);
                int result_value = (valor_int);

                if (result_value < 150){
                    result.setText("Normal");
                }
                else if (result_value<200){
                    result.setText("Bajo Riesgo" +
                            " Recomendación: Realizar una medición en las próximas 6-12 horas");
                }
                else if (result_value<250){
                    result.setText("Bajo Riesgo" +
                            " Recomendación: Requiere observación, se recomienda considerar el inicio de la fototerapia");
                }
                else if (result_value<450){
                    result.setText("Medio Riesgo" +
                            " Recomendación: Iniciar sesión de fototerapia. Primera medición de 4-6 horas del inicio, después iniciar multiples sesiones de fototerapia si hay un aumento mayor a 8.5µmol/L/hora o solo realizar medición cada 6-12 horas si los niveles descienden.");
                }
                else if (result_value<1000){
                    result.setText("Alto Riesgo" +
                            " Recomendación: se requiere iniciar exanguinotransfusión a menos que los valores comiencen a descender antes del inicio");
                }

                Resp_Activity detail = new Resp_Activity();
                Bundle args = new Bundle();
                args.putString("valor", re1.getText().toString());
                args.putString("edad", re2.getText().toString());
                args.putString("fecha", re3.getText().toString());
                args.putString("hora", re4.getText().toString());
                args.putString("estado", result.getText().toString());
                args.putString("xvalor", obtVal.getText().toString());
                args.putString("xfecha", fecha.getText().toString());
                args.putString("xhora", horav.getText().toString());
                detail.setArguments(args);
                detail.show(((Activity) getActivity()).getFragmentManager(), "dialog");
            }
        }).setNegativeButton("", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        return builder.create();
    }
}
