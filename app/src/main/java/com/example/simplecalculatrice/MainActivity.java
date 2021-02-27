package com.example.simplecalculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mOperandOneEditText;
    private EditText mOperandTwoEditText;

    private TextView mResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mResultTextView = findViewById(R.id.operation_result_text_view);
        mOperandOneEditText = findViewById(R.id.operand_one_edit_text);
        mOperandTwoEditText = findViewById(R.id.operand_two_edit_text);
        Button button = (Button) findViewById(R.id.add_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                add();
            }
        });
    }

    /*public void onAdd(View view){
        double operandOne;
        double operandTwo;

        operandOne = Double.valueOf(mOperandOneEditText.getText().toString());
        operandTwo = Double.valueOf(mOperandTwoEditText.getText().toString());

        mResultTextView.setText(String.valueOf(operandOne + operandTwo));
    }*/

    private void add(){
        double operandOne;
        double operandTwo;

        operandOne = Double.valueOf(mOperandOneEditText.getText().toString());
        operandTwo = Double.valueOf(mOperandTwoEditText.getText().toString());

        mResultTextView.setText(String.valueOf(operandOne + operandTwo));
    }

}