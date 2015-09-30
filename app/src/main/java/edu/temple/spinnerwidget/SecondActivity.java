package edu.temple.spinnerwidget;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String receiveIntent = getIntent().getExtras().getString("chosenColor");
        RelativeLayout backColor = (RelativeLayout) findViewById(R.id.backColor);
        if (receiveIntent.equalsIgnoreCase("RED")) {
            backColor.setBackgroundColor(Color.RED);
        } else if (receiveIntent.equalsIgnoreCase("BLUE")) {
            backColor.setBackgroundColor(Color.BLUE);
        } else if (receiveIntent.equalsIgnoreCase("YELLOW")) {
            backColor.setBackgroundColor(Color.YELLOW);
        } else if (receiveIntent.equalsIgnoreCase("GREEN")) {
            backColor.setBackgroundColor(Color.GREEN);
        } else if (receiveIntent.equalsIgnoreCase("NO COLOR")) {
            backColor.setBackgroundColor(Color.TRANSPARENT);
        }

        Button btnMain = (Button) findViewById(R.id.btnMain);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goBack = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(goBack);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
