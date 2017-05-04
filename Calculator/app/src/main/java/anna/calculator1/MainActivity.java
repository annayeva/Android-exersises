package anna.calculator1;

import java.text.DecimalFormat;
import android.icu.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Double total;
    public Double Number1 = 0.0;
    public Double Number2 = 0.0;
    public String currentSign = "nothing";
    public String inputToString;
    public String strNumber = "0";
    public String pressedBtn;
    public String pressedSign;
    public TextView numberDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberDisplay = (TextView) findViewById(R.id.outText2);
    }

    public void onButtonClick (View v)
    {
        Button thisButton = (Button) v;
        pressedBtn = thisButton.getText().toString();
        inputToString = numberDisplay.getText().toString();

        if ((pressedBtn.equals(".") &&  inputToString.contains(".")) || (pressedBtn.equals("0") &&  inputToString.equals("0")) )
        {

        }

        else
        {
            if (pressedBtn.equals(".") &&  inputToString.equals(""))
            {
                numberDisplay.setText("0.");
                strNumber = "0";
            }

            else if (inputToString.equals("0") && !pressedBtn.equals("0") )
            {
                numberDisplay.setText(pressedBtn);
                strNumber = pressedBtn;

            }
            else
            {
                strNumber = numberDisplay.getText() + pressedBtn;
                numberDisplay.setText(strNumber);
            }

                if (currentSign.equals("nothing"))
                {
                    Number1 = Double.parseDouble(strNumber);
                }
                else
                {
                    Number2 = Double.parseDouble(strNumber);
                }
        }
    }


    public void onSignClick(View v)
    {
        Button thisButton = (Button) v;
        pressedSign = thisButton.getText().toString();
        currentSign = pressedSign;
        strNumber = "0";
        numberDisplay.setText("");
        numberDisplay.setHint(pressedSign);

    }

    public void updateResult (View v)
    {
        if (currentSign.equals("nothing"))
        {

        }
        else {

            if (currentSign.equals("+"))
            {
                total = Number1 + Number2;
            }

            if (currentSign.equals("-"))
            {
                total = Number1 - Number2;
            }

            if (currentSign.equals("/"))
            {
                total = Number1 / Number2;
            }

            if (currentSign.equals("*"))
            {
                total = Number1 * Number2;
            }

            DecimalFormat nf = new DecimalFormat("#.####");
            numberDisplay.setText(nf.format(total));
            Number1 = total;
        }
    }

    public void clear (View v)
    {
        numberDisplay.setText("");
        numberDisplay.setHint("0");
        Number1 = 0.0;
        Number2 = 0.0;
        strNumber = "";
        currentSign = "nothing";
    }
}
