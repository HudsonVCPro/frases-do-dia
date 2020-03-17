package br.com.curso.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view) {

        String[] frases = {
                "Frase 0",
                "Frase 1",
                "Frase 2",
                "Frase 3"
        };

        int n = new Random().nextInt(4);

        TextView texto = findViewById(R.id.txtFrases);
        texto.setText(frases[n]);
    }
}
