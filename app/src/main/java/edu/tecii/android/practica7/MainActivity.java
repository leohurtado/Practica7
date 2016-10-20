package edu.tecii.android.practica7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtCo, txtCa, txtH, txtP, txtA;
    Button btncal;
    double Co, Ca, H, P, A;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtA = (EditText)findViewById(R.id.txtA);
        txtCa = (EditText)findViewById(R.id.txtCa);
        txtCo = (EditText)findViewById(R.id.txtCo);
        txtH = (EditText)findViewById(R.id.txtH);
        txtP = (EditText)findViewById(R.id.txtP);
        btncal = (Button)findViewById(R.id.btncalc);
    }
    public void calcular (View v){
        Co = Double.parseDouble(txtCo.getText().toString());
        Ca = Double.parseDouble(txtCa.getText().toString());
        H = Math.sqrt((Math.pow(Ca,2) + Math.pow(Co,2)));
        P = Ca + Co + H;
        A = (Ca * Co) / 2;
        txtH.setText(H+"");
        txtP.setText(P+"");
        txtA.setText(A+"");
    }
}
