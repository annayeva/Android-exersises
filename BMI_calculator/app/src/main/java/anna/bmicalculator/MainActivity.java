package anna.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText fieldHeight;
    EditText fieldWeight;
    EditText fieldAge;
    RadioButton male;
    RadioButton female;
    TextView resultView;
    Double bmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fieldHeight = (EditText) findViewById(R.id.fieldHeight);
        fieldWeight = (EditText) findViewById(R.id.fieldWeight);
        fieldAge = (EditText) findViewById(R.id.fieldAge);
        female = (RadioButton) findViewById(R.id.rFemale);
        male = (RadioButton) findViewById(R.id.rMale);
        resultView = (TextView) findViewById(R.id.resultView);
        male.isChecked();

    }

    public void gender(View v) {

        //strInputToConvert = Double.parseDouble(inputToConvert.getText().toString());

        Double height = Double.parseDouble(fieldHeight.getText().toString());
        Integer weight = Integer.parseInt(fieldWeight.getText().toString());
        Integer age = Integer.parseInt(fieldAge.getText().toString());
        bmi = weight / ((height * height)/10000);


        if (female.isChecked()) {
        femaleBMI(bmi);
        }

        if (male.isChecked()) {
        maleBMI(bmi);
        }

    }

    public void femaleBMI (Double bmi){

        String bmiRound = String.format("%.2f", bmi);

        if (bmi < 19){

            resultView.setText("underweight"+"("+bmiRound+")");

        }

        if(bmi >= 19 && bmi <= 24){

            resultView.setText("normal weight"+"("+bmiRound+")");

        }

        if (bmi >24 && bmi <=30){

            resultView.setText("extra weight"+"("+bmiRound+")");

        }

        if(bmi>30 && bmi <=40){
            resultView.setText("overweight"+"("+bmiRound+")");
        }

        if(bmi>40){
            resultView.setText("obiese"+"("+bmiRound+")");
        }


    }
    public void maleBMI (Double bmi) {
        String bmiRound = String.format("%.2f", bmi);

        if (bmi < 20){

            resultView.setText("underweight"+"("+bmiRound+")");

        }

        if(bmi >= 20 && bmi <= 25){

            resultView.setText("normal weight"+"("+bmiRound+")");

        }

        if (bmi >25 && bmi <=30){

            resultView.setText("extra weight"+"("+bmiRound+")");

        }

        if(bmi>30 && bmi <=40){
            resultView.setText("overweight"+"("+bmiRound+")");
        }

        if(bmi>40){
            resultView.setText("obiese"+"("+bmiRound+")");
        }



    }





}
