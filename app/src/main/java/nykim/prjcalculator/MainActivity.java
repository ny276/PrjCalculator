package nykim.prjcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btPlus, btMinus, btMultiply, btDivide, btClear;
    EditText etNum1, etNum2, etResult;
    String strNum1, strNum2, strResult;
    int num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btPlus = findViewById(R.id.btPlus);
        btPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNum1 = findViewById(R.id.etNum1);
                etNum2 = findViewById(R.id.etNum2);
                etResult = findViewById(R.id.etResult);

                strNum1 = etNum1.getText().toString();
                strNum2 = etNum2.getText().toString();

                num1 = Integer.parseInt(strNum1);
                num2 = Integer.parseInt(strNum2);

                result = num1 + num2;
                strResult = result + "";
                etResult.setText(strResult);
            }
        });

        btMinus = findViewById(R.id.btMinus);
        btMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNum1 = findViewById(R.id.etNum1);
                etNum2 = findViewById(R.id.etNum2);
                etResult = findViewById(R.id.etResult);

                strNum1 = etNum1.getText().toString();
                strNum2 = etNum2.getText().toString();

                num1 = Integer.parseInt(strNum1);
                num2 = Integer.parseInt(strNum2);

                result = num1 - num2;
                strResult = result + "";
                etResult.setText(strResult);
            }
        });

        btMultiply = findViewById(R.id.btMultiply);
        btMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNum1 = findViewById(R.id.etNum1);
                etNum2 = findViewById(R.id.etNum2);
                etResult = findViewById(R.id.etResult);

                strNum1 = etNum1.getText().toString();
                strNum2 = etNum2.getText().toString();

                num1 = Integer.parseInt(strNum1);
                num2 = Integer.parseInt(strNum2);

                result = num1 * num2;
                strResult = result + "";
                etResult.setText(strResult);
            }
        });

        btDivide = findViewById(R.id.btDivide);
        btDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNum1 = findViewById(R.id.etNum1);
                etNum2 = findViewById(R.id.etNum2);
                etResult = findViewById(R.id.etResult);

                strNum1 = etNum1.getText().toString();
                strNum2 = etNum2.getText().toString();

                num1 = Integer.parseInt(strNum1);
                num2 = Integer.parseInt(strNum2);

                result = num1 / num2;
                strResult = result + "";
                etResult.setText(strResult);
            }
        });

        btClear = findViewById(R.id.btClear);
        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNum1.setText("");
                etNum2.setText("");
                etResult.setText("");
            }
        });
    }
}
