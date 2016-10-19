package edu.tecii.android.practica5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Centigrados;
    TextView Resultado;
    String Res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void convetFar (View view) {
        Centigrados=(EditText)findViewById(R.id.edt1);
        Resultado=(TextView)findViewById(R.id.txt2);
        double Fare;
        double cen=Double.parseDouble(Centigrados.getText().toString());

        Fare= ((cen*1.8)+32);

        Res= Fare+ " Grados Farenheit";
        Resultado.setText(Res);

    }

    public void convetKelv (View view) {
        Centigrados=(EditText)findViewById(R.id.edt1);
        Resultado=(TextView)findViewById(R.id.txt2);
        double Kelv;
        double cen=Double.parseDouble(Centigrados.getText().toString());

        Kelv=(273+cen);
        Res=Kelv+ " Grados kelvin";
        Resultado.setText(Res);

    }

    public void convetRank (View view){
        Centigrados=(EditText)findViewById(R.id.edt1);
        Resultado=(TextView)findViewById(R.id.txt2);
        double Rank,Fare;
        double cen=Double.parseDouble(Centigrados.getText().toString());

        Fare=((cen*1.8)+32);
        Rank=(Fare+460);
        Res=Rank+ " Grados Ranking";
        Resultado.setText(Res);
    }
}
