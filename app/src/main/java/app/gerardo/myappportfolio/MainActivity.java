package app.gerardo.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an OnClickListener, this listener has all the options to display
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "This button will launch my ";
                Toast t = Toast.makeText(MainActivity.this, "" , Toast.LENGTH_LONG);
                switch (v.getId()){
                    case R.id.button_spotify:
                        t.setText(message + "Spotify Streamer");
                        break;
                    case R.id.button_scores:
                        t.setText(message + "Football Scores App");
                        break;
                    case R.id.button_library:
                        t.setText(message + "Library App");
                        break;
                    case R.id.button_bigger:
                        t.setText(message + "Build It Bigger App");
                        break;
                    case R.id.button_xyz:
                        t.setText(message + "XYZ Reader");
                        break;
                    case R.id.button_capstone:
                        t.setText(message + " own app Capstone");
                        break;
                    default:
                        break;
                }
                t.show();
            }
        };// end OnClickListener


        // Declare buttons
        Button spotify = (Button) findViewById(R.id.button_spotify);
        spotify.setOnClickListener(listener);
        Button scores = (Button) findViewById(R.id.button_scores);
        scores.setOnClickListener(listener);
        Button library = (Button) findViewById(R.id.button_library);
        library.setOnClickListener(listener);
        Button bigger = (Button) findViewById(R.id.button_bigger);
        bigger.setOnClickListener(listener);
        Button xyz = (Button) findViewById(R.id.button_xyz);
        xyz.setOnClickListener(listener);
        Button capstone = (Button) findViewById(R.id.button_capstone);
        capstone.setOnClickListener(listener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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