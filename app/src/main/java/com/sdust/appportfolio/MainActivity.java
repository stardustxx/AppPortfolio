package com.sdust.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

//    Button[] btns = new Button[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

//        btns[0] = (Button) findViewById(R.id.btnP1);
//        btns[1] = (Button) findViewById(R.id.btnP2);
//        btns[2] = (Button) findViewById(R.id.btnP3);
//
//        for (int i = 0; i < btns.length; i++){
//            btns[i].setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    displayToast("Project not done");
//                }
//            });
//        }

        return true;
    }

    public void displayAction(View view){
        switch (view.getId()){
            case R.id.btnP1:
                displayToast("Project 1");
                break;
            case R.id.btnP2:
                displayToast("Project 2");
                break;
            case R.id.btnP3:
                displayToast("Project 3");
                break;
        }
    }

    public void displayToast(String project){
        Toast.makeText(MainActivity.this, project, Toast.LENGTH_SHORT).show();
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
