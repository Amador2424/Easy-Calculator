package com.example.easy_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText affichage;
    private boolean addition, soustraction,multiplication,division;
    private float val1,val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        affichage = findViewById(R.id.zone_calcul);

        affichage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getString(R.string.Calcul).equals(affichage.getText().toString())){
                    affichage.setText("");
                    affichage.setShowSoftInputOnFocus(false);
                }

            }
        });

    }
    private void Supp_zoneCalcul(){
        if(getString(R.string.Calcul).equals(affichage.getText().toString())){
            affichage.setText("");
            affichage.setShowSoftInputOnFocus(false);
        }

}
    public void ZeroBtn(View view)
    {
        Supp_zoneCalcul();
        affichage.setText(affichage.getText() + "0");
    }
    public void OneBtn(View view){
        Supp_zoneCalcul();
        affichage.setText(affichage.getText() + "1");
    }
    public void TwooBtn(View view){
        Supp_zoneCalcul();
        affichage.setText(affichage.getText() + "2");
    }
    public void ThreeBtn(View view){
        Supp_zoneCalcul();
        affichage.setText(affichage.getText() + "3");
    }
    public void FourBtn(View view){
        Supp_zoneCalcul();
        affichage.setText(affichage.getText() + "4");
    }
    public void FiveBtn(View view){
        Supp_zoneCalcul();
        affichage.setText(affichage.getText() + "5");
    }
    public void SixBtn(View view){
        Supp_zoneCalcul();
        affichage.setText(affichage.getText() + "6");
    }
    public void SevenBtn(View view){
        Supp_zoneCalcul();
        affichage.setText(affichage.getText() + "7");
    }
    public void HeightBtn(View view){
        Supp_zoneCalcul();
        affichage.setText(affichage.getText() + "8");
    }
    public void NineBtn(View view){
        Supp_zoneCalcul();
        affichage.setText(affichage.getText() + "9");
    }
    public void MultiplicationBtn(View view){
        if (affichage == null) {
            affichage.setText("");
        } else {
            val1 = Float.parseFloat(affichage.getText() + "");
            multiplication = true;
            affichage.setText(null);
        }
    }

    public void DivisionBtn(View view){
        if (affichage == null) {
            affichage.setText("");
        } else {
            val1 = Float.parseFloat(affichage.getText() + "");
            division = true;
            affichage.setText(null);
        }
    }
    public void MoinBtn(View view){
        if (affichage == null) {
            affichage.setText("");
        } else {
            val1 = Float.parseFloat(affichage.getText() + "");
            soustraction = true;
            affichage.setText(null);
        }
    }

    public void AddBtn(View view){
        if (affichage == null) {
            affichage.setText("");
        } else {
            val1 = Float.parseFloat(affichage.getText() + "");
            addition = true;
            affichage.setText(null);
        }
    }
    public void EqualBtn(View view){
        val2 = Float.parseFloat(affichage.getText() + "");
        if (addition == true) {
            affichage.setText(val1 + val2 + "");
            addition = false;
        }
        if (soustraction == true) {
            affichage.setText(val1 - val2 + "");
            soustraction = false;
        }
        if (multiplication == true) {
            affichage.setText(val1 * val2 + "");
            multiplication = false;
        }
        if (division == true) {
            affichage.setText(val1 / val2 + "");
            division = false;
        }
    }
    public void PlusBtn(View view){
        if (affichage == null) {
            affichage.setText("");
        } else {
            val1 = Float.parseFloat(affichage.getText() + "");
            addition = true;
            affichage.setText(null);
        }
    }

    public void Clear (View view){

        affichage.setText("Enter a value");
    }
}
