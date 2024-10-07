package com.example.volkov_trukhin32;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void NavigateTo(View view){
    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
    startActivity(intent);
        NOTIFICATIONS2();
    }
    public void NOTIFICATIONS2(){
        Toast.makeText(MainActivity.this, "О приложении", Toast.LENGTH_SHORT).show();
    }
    public void NavigateTo1(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(intent);
        NOTIFICATIONS3();
    }
    public void NOTIFICATIONS3(){
    Toast.makeText(MainActivity.this, "Информация", Toast.LENGTH_SHORT).show();
    }
}