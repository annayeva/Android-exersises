package anna.burger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton whiteBread;
    RadioButton darkBread;
    RadioButton beef;
    RadioButton chicken;
    RadioButton vegg;

    CheckBox cheeseTop;
    CheckBox tomatoTop;
    CheckBox onionsTop;
    CheckBox mayoTop;

    TextView orderFinalText;
    String finalOrder= "You ordered: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        whiteBread = (RadioButton) findViewById(R.id.radioBtnBreadWhite);
        darkBread = (RadioButton) findViewById(R.id.radioBtnBreadDark);
        beef = (RadioButton) findViewById(R.id.radioBtnBeef);
        chicken = (RadioButton) findViewById(R.id.radioBtnChicken);
        vegg = (RadioButton) findViewById(R.id.radioBtnVeg);

        cheeseTop = (CheckBox) findViewById(R.id.checkBoxCheese);
        tomatoTop = (CheckBox) findViewById(R.id.checkBoxTomato);
        onionsTop = (CheckBox) findViewById(R.id.checkBoxOnions);
        mayoTop = (CheckBox) findViewById(R.id.checkBoxMayo);

        orderFinalText = (TextView) findViewById(R.id.finalOrderTextView);


    }


        public void onClickOrdering (View v)
        {
            if (whiteBread.isChecked())
            {
                finalOrder = finalOrder+ "white bread ";
            }

            else if (darkBread.isChecked())
            {
                finalOrder = finalOrder + "dark bread ";
            }
            if (beef.isChecked())
            {
                finalOrder = finalOrder + "with beef";
            }
            else if (chicken.isChecked())
            {
                finalOrder = finalOrder + "with chicken";
            }
            else if (vegg.isChecked())
            {
                finalOrder = finalOrder + "with veggies";
            }

            if (cheeseTop.isChecked())
            {
                finalOrder = finalOrder + ", cheese";
            }

            if (tomatoTop.isChecked())
            {
                finalOrder = finalOrder + ", tomato";
            }

            if (onionsTop.isChecked())
            {
                finalOrder = finalOrder + ", onions";
            }

            if (mayoTop.isChecked())
            {
                finalOrder = finalOrder + ", mayo";
            }

            orderFinalText.setText(finalOrder+".");
            finalOrder="You ordered: ";
        }








}
