package anna.kg_lb_converter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button convertKgtolb;
    Button convertLbtoKg;
    EditText inputToConvert;
    TextView convertionResult;
    Double strInputToConvert;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Kg-Lb Converter");

        convertKgtolb = (Button) findViewById(R.id.kgTolb);
        convertLbtoKg = (Button) findViewById(R.id.lbTokg);
        inputToConvert = (EditText) findViewById(R.id.editText);
        convertionResult = (TextView) findViewById(R.id.textView2);

    }


    public void convertKg (View v) {

        strInputToConvert = Double.parseDouble(inputToConvert.getText().toString()); //converting input into Double
        Double dblCnvertionResult = strInputToConvert / 0.45359237;
        convertionResult.setText(dblCnvertionResult.toString()+ " LB");

    }

    public  void convertLb(View v) {
        strInputToConvert = Double.parseDouble(inputToConvert.getText().toString()); //converting input into Double
        Double dblCnvertionResult = strInputToConvert * 0.45359237;
        convertionResult.setText(dblCnvertionResult.toString()+ " KG");

    }

}
