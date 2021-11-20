package com.app.jaunfix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.app.jaunfix.adaptadores.ListaContactosAdapter;
import com.app.jaunfix.adaptadores.ValueAdapter;
import com.app.jaunfix.datamodels.Value;
import com.app.jaunfix.db.DbContactos;
import com.app.jaunfix.db.DbHelper;
import com.app.jaunfix.entidades.Contactos;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference rf = FirebaseDatabase.getInstance().getReference().child("valor");
    private RecyclerView recyclerView;
    private ArrayList<Value> arrayList = new ArrayList<>();
    RecyclerView listaContactos;
    ArrayList<Contactos> listaArrayContactos;
    ListaContactosAdapter adapter;
    FloatingActionButton fb;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.listaPacientes);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        upload();


    }
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.menu_nuevo:
                nuevoRegistro();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
    private void nuevoRegistro(){
        Add_Case detail = new Add_Case();
        Bundle args = new Bundle();
        detail.setArguments(args);
        detail.show(((Activity)MainActivity.this).getFragmentManager(), "dialog");
    }
    public void upload() {
        rf.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                arrayList.clear();
                for (DataSnapshot ds : dataSnapshot.getChildren()) {
                    Value relation = ds.getValue(Value.class);
                    arrayList.add(relation);
                }

                recyclerView.setAdapter(new ValueAdapter(arrayList,MainActivity.this));

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

}
