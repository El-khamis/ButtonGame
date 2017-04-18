package com.example.sadouioui.buttongame;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Second_activity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setTitle("Winner's Palace");


        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        final String EXTRA_RESULT = " Who won ?";
        Button PlayAgain = (Button) findViewById(R.id.PlayAgain);

        // To modify the text depends on who won
        Intent intent = getIntent();
        TextView score = (TextView) findViewById(R.id.score);
        score.setText(intent.getStringExtra(EXTRA_RESULT));
        // Back to the game with PlayAgain button

        PlayAgain.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(Second_activity.this, MainActivity.class);
                    startActivity(intent);
            }
        });

    }
}