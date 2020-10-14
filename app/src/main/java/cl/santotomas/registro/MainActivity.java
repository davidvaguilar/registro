package cl.santotomas.registro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import cl.santotomas.registro.modelo.Empleado;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity", "Empezo a correr la app");

        final EditText nombreEdit = (EditText) findViewById(R.id.nombre_empleado);
        final EditText apellidoEdit = (EditText) findViewById(R.id.apellido_empleado);
        Button registrar = (Button)findViewById(R.id.registro_boton);

        registrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);

                Empleado empleado = new Empleado();
            }
        });
    }



}