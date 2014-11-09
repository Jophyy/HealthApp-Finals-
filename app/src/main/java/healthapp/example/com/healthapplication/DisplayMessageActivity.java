package healthapp.example.com.healthapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import healthapp.example.com.healthapplication.R;

public class DisplayMessageActivity extends ActionBarActivity {



    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = (TextView) findViewById(R.id.diagMess);
        textView.setText(message);

        //final TextView diagnosis = ((TextView) findViewById(R.id.diagMess));
       // final Spinner group = (Spinner) findViewById(R.id.spinner);
       // String sickness = group.getSelectedItem().toString();
        //String sickness2 = group.getSelectedItem().toString();

       // if(sickness.equals("Normal Cough")) {
       //     diagnosis.setText("a");
       // }
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
