package me.sonia_hu.cubesimulator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int mesos;
    int attempts;
    String equipment;
    int equipmentLevel;
    PotentialClass genericPotential;
    Spinner dropdown;
    ArrayAdapter<String> adapter;
    SeekBar seekBar;
    TextView seekBarValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Potential.initialize(); // initializes all potential values
        mesos = 0;
        attempts = 0;
        equipmentLevel = 0;
        equipment = "Weapon";

        genericPotential = new PotentialClass();

        dropdown = (Spinner)findViewById(R.id.spinner1);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, genericPotential.getEquipNames());
        dropdown.setAdapter(adapter);

        seekBar = (SeekBar)findViewById(R.id.seekEqLvl);
        seekBarValue = (TextView)findViewById(R.id.EqLvlText);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                equipmentLevel = progress;
                seekBarValue.setText(String.valueOf(equipmentLevel));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });
    }


    public void updateDisplay(){
        display(mesos + " mil",R.id.mesosText);
        display("" + attempts, R.id.attemptsText);
    }
    /* reRoll on click event: generates new values for lines 1 2 and 3 */
    public void reRoll(View view) {
        display(Potential.generate(1,equipmentLevel,equipment),R.id.line1);
        display(Potential.generate(2,equipmentLevel,equipment),R.id.line2);
        display(Potential.generate(3,equipmentLevel,equipment),R.id.line3);
        mesos += 12;
        attempts += 1;
        updateDisplay();
    }

    public void resetMesosValue(View view) {
        mesos = 0;
        updateDisplay();
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(String text, int textID) {
        TextView selectedText = (TextView) findViewById(textID);
        selectedText.setText(text);
        equipment = dropdown.getSelectedItem().toString();
    }
}