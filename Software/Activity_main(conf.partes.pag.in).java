<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:orientation="vertical"
    android:background="#FFFFFF">


  <ImageView
      android:layout_marginTop="35dp"
      android:layout_gravity="center"
      android:layout_width="300dp"
      android:layout_height="300dp"
      android:src="@mipmap/logo"/>

    <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/listaPacientes"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:scrollbarSize="30dp" />


</LinearLayout>
