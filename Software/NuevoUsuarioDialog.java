<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#94068181"
    android:orientation="vertical">

    <TextView
        android:id="@+id/Ingresar_Datos"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_constraintBottom_toBottomOf="parent"
        android:layout_constraintEnd_toEndOf="parent"
        android:text="Ingresar Datos:"
        android:textColor="#020101"
        android:textSize="25sp" />

    <EditText
        android:id="@+id/nameEdit"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="8dp"
        android:hint="Ingresar nombre del paciente" />

    <EditText
        android:id="@+id/edadgestEdit"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="8dp"
        android:hint="Ingrese la edad gestacional en semanas"
        android:inputType="number" />

    <EditText
        android:id="@+id/fechanacEdit"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="8dp"
        android:hint="Ingrese la fecha de nacimiento"
        android:inputType="date" />

    <EditText
        android:id="@+id/horaEdit"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="8dp"
        android:hint="Ingrese la hora del nacimiento" />

    <Button
        android:id="@+id/registrar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="16dp"
        android:background="#B10505"
        android:text="Registrar Nuevo Paciente" />


</LinearLayout>
