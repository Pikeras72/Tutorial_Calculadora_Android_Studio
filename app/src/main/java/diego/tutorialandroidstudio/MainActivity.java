package diego.tutorialandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText numero1, numero2;
    private TextView respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        respuesta = findViewById(R.id.respuesta);
    }

    public void sumar (View view){
        try{
            int respuestaNumero = Integer.parseInt(numero1.getText().toString())+Integer.parseInt(numero2.getText().toString());
            respuesta.setText(String.valueOf(respuestaNumero));
        }catch (Exception ex){
            Toast.makeText(this, "Números no válidos",Toast.LENGTH_SHORT).show();
        }
    }

    public void restar (View view){
        try{
            int respuestaNumero = Integer.parseInt(numero1.getText().toString())-Integer.parseInt(numero2.getText().toString());
            respuesta.setText(String.valueOf(respuestaNumero));
        }catch (Exception ex){
            Toast.makeText(this, "Números no válidos",Toast.LENGTH_SHORT).show();
        }
    }

    public void multiplicar (View view){
        try{
            int respuestaNumero = Integer.parseInt(numero1.getText().toString())*Integer.parseInt(numero2.getText().toString());
            respuesta.setText(String.valueOf(respuestaNumero));
        }catch (Exception ex){
            Toast.makeText(this, "Números no válidos",Toast.LENGTH_SHORT).show();
        }
    }

    public void dividir (View view){
        try{
            int respuestaNumero = Integer.parseInt(numero1.getText().toString())/Integer.parseInt(numero2.getText().toString());
            respuesta.setText(String.valueOf(respuestaNumero));
        }catch (Exception ex){
            Toast.makeText(this, "Números no válidos",Toast.LENGTH_SHORT).show();
        }
    }

    public void irAPoliticaDePrivacidad (View view){
        Intent i = new Intent(this, Politicas.class);
        startActivity(i);
    }
}