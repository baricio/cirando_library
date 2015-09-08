package com.udacity.gradle.builditbigger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.CitationProvider;

public class FraseActivity extends AppCompatActivity {

    private TextView txtFrase;
    private CitationProvider citation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frase);

        txtFrase = (TextView)findViewById(R.id.txtFrase);

        this.callCitation();
    }

    private void callCitation(){
        txtFrase.setText(citation.getCitation());
    }


}
