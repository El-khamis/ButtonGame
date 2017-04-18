package com.example.sadouioui.buttongame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
    Button b1, b2;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Battleground");

        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        final String EXTRA_RESULT = " Who won ?";
        final TextView txtView = (TextView) findViewById(R.id.textView);
        final TextView txtView1 = (TextView) findViewById(R.id.textView1);


        b1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    i++;
                    String j = Integer.toString(i);
                    txtView.setText(j);
                    txtView1.setText(j);
                    if( Integer.parseInt(txtView.getText().toString()  )    ==10 ) {
                        Intent intent = new Intent(MainActivity.this, Second_activity.class);
                        intent.putExtra(EXTRA_RESULT, "Player 1 won !");
                        startActivity(intent);
                    }
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    i--;
                    String j = Integer.toString(i);
                    txtView.setText(j);
                    txtView1.setText(j);

                    if( Integer.parseInt(txtView.getText().toString()  )    ==-10 ) {
                        Intent intent = new Intent(MainActivity.this, Second_activity.class);
                        intent.putExtra(EXTRA_RESULT, "Player 2 won !");
                        startActivity(intent);
                    }

                }
            });

    }
}
