package com.example.result;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final   EditText subject1 = (EditText) findViewById( R.id.editsubject1 );
     final    EditText subject2 = (EditText) findViewById( R.id.editsubject2 );
     final    EditText subject3 = (EditText) findViewById( R.id.editsubject3 );
     final    EditText subject4 = (EditText) findViewById( R.id.editsubject4 );
     final    EditText subject5 = (EditText) findViewById( R.id.editsubject5 );
     final TextView results = (TextView) findViewById( R.id.showresult );
     final TextView per = (TextView) findViewById( R.id.showper );
     final TextView grade = (TextView)findViewById( R.id.grade );
     final TextView grade1 = (TextView)findViewById( R.id.grade1 );
        Button reult = (Button) findViewById( R.id.btnresult );

        reult.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double sub1 = Float.parseFloat( subject1.getText().toString() );
                double sub2 = Float.parseFloat( subject2.getText().toString() );
                double sub3 = Float.parseFloat( subject3.getText().toString() );
                double sub4 = Float.parseFloat( subject4.getText().toString() );
                double sub5 = Float.parseFloat( subject5.getText().toString() );

                double result = (sub1 + sub2 + sub3 + sub4 + sub5);
                results.setText( new DecimalFormat("##.##").format( result ) );

                per.setText( new DecimalFormat("##.##").format( result/5 ) );

                String subj1 = subject1.getText().toString();
                int subje1 =Integer.parseInt(subj1);

                String subj2 = subject1.getText().toString();
                int subje2 =Integer.parseInt(subj2);

                String subj3 = subject1.getText().toString();
                int subje3 =Integer.parseInt(subj3);

                String subj4 = subject1.getText().toString();
                int subje4 =Integer.parseInt(subj4);

                String subj5 = subject1.getText().toString();
                int subje5 =Integer.parseInt(subj5);


                if (subje1 < 40 && subje1 >= 0)
                {
                    grade1.setText( "Fail" );
                }
                if (subje2 < 40 && subje2 >= 0)
                {
                    grade1.setText( "Fail" );
                }
                if (subje3 < 40 && subje3 >= 0)
                {
                    grade1.setText( "Fail" );
                }
                if (subje4 < 40 && subje4 >= 0)
                {
                    grade1.setText( "Fail" );
                }
                if (subje5 < 40 && subje5 >= 0)
                {
                    grade1.setText( "Fail" );
                }
                String value= per.getText().toString();
                int finalValue=Integer.parseInt(value);
                if (finalValue >= 90 && finalValue <=100 ){

                    grade.setText( "A+ grade" );
                    Toast.makeText(MainActivity.this,"A+ grade", Toast.LENGTH_SHORT).show();
                }
                if (finalValue >= 80 && finalValue < 90 ){
                    grade.setText( "A grade" );
                    Toast.makeText(MainActivity.this,"A grade", Toast.LENGTH_SHORT).show();
                }
                if (finalValue >= 70 && finalValue < 80 ){
                    grade.setText( "B+ grade" );
                    Toast.makeText(MainActivity.this,"B+ grade", Toast.LENGTH_SHORT).show();
                }
                if (finalValue >= 60 && finalValue < 70 ){
                    grade.setText( "B grade" );
                    Toast.makeText(MainActivity.this,"B grade", Toast.LENGTH_SHORT).show();
                }
                if (finalValue >= 50 && finalValue < 60 ){
                    grade.setText( "C+ grade" );
                    Toast.makeText(MainActivity.this,"C+ grade", Toast.LENGTH_SHORT).show();
                }
                if (finalValue >= 40 && finalValue < 50 ){

                    grade.setText( "C grade" );
                    Toast.makeText(MainActivity.this,"C grade", Toast.LENGTH_SHORT).show();
                }
                if (finalValue <= 40 && finalValue >= 0 ){

                    grade.setText( "Fail" );
                    Toast.makeText(MainActivity.this,"Fail", Toast.LENGTH_SHORT).show();
                }
            }
        } );

        }

}
