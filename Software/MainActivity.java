package com.app.jaunfix;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private Retrofit retrofit;
    private Retrointerface retrointerface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.NuevoUsuario).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleNuevoUsuarioDialog();
            }
        });

    }
    private void handleNuevoUsuarioDialog(){
        View view = getLayoutInflater().inflate(R.layout.nuevousuario_dialog, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(view).show();

        Button nuevousuarioBtn = view.findViewById(R.id.NuevoUsuario);
        final EditText nameEdit = view.findViewById(R.id.nameEdit);
        EditText edadEdit = view.findViewById(R.id.edadgestEdit);
        EditText fechaEdit = view.findViewById(R.id.fechanacEdit);
        EditText horaEdit = view.findViewById(R.id.horaEdit);

        nuevousuarioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HashMap<String,String> map = new HashMap<>();

                map.put("name", nameEdit.getText().toString());
                map.put("edadgest", edadEdit.getText().toString());
                map.put("fechanac", fechaEdit.getText().toString());
                map.put("hora", horaEdit.getText().toString());

                Call<Void> call = Retrointerface.executeNuevousuario(map);
                call.enqueue(new Callback<Void>() {
                    @Override
                    public void onResponse(Call<Void> call, Response<Void> response) {
                        if (response.code()==200) {
                            Toast.makeText(MainActivity.this, "Se registró correctamente", Toast.LENGTH_LONG).show();
                        }else if (response.code() == 400){
                            Toast.makeText(MainActivity.this,"Ya existe un paciente registrado con esos datos",Toast.LENGTH_LONG).show();
                        }

                    }

                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {
                        Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
    }
}
