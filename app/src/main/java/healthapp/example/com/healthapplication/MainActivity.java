package healthapp.example.com.healthapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    public final static String EXTRA_MESSAGE = "healthapp.example.com.healthapplication.MESSAGE";

    public void displayAbout(View view) {
        Intent intent = new Intent(this,DisplayAbout.class);
        String message = "About the Basic Health Diagnostic Application: \n\n" +
                "The Health Diagnostic Application is an application that gives diagnostics and recommendations on some common and basic " +
                "sickness like cough, fever, colds etc. It's main purpose is to help people who can't afford basic check up for health issues. " +
                "The diagnostics and recommendations are based on the research and experience(within the Philippines) conducted by the creator of this app. " +
                "Please take note that this app is still in developing or beta mode, it can still produce error on some cases." +
                "Also, the medicines provided on the each diagnosis are based on the most popular brands used on various sickness " +
                "which are commonly found on advertisements, we remind you to take prescriptions with care. If symptoms persists, " +
                "please consult your doctor.";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void displayHelp(View view) {
        Intent intent = new Intent(this,DisplayHelp.class);
        String message = "Need Help? \n\n" +
                "Guidelines for using this app: \n" +
                "> Please make sure that you've chosen a major symptom or sickness, else there will be no diagnosis to be prompted\n\n" +
                "> For the secondary symptoms, make sure that you use all capital letters separated by only one space per sysmptom(s).\n";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void displayNews(View view) {
        Intent intent = new Intent(this,DisplayNews.class);
        String message = "Recent Health Related News\n\n" +
                "News here\n" +
                "News here\n" +
                "News here\n" +
                "News here\n";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void diagnose(View view) {
        final TextView result = (TextView)findViewById(R.id.txtResult);
        final Spinner group = (Spinner)findViewById(R.id.spinner);
       // final Spinner group2 = (Spinner)findViewById(R.id.spinner2);
        String sickness = group.getSelectedItem().toString();
     //   String sickness2 = group.getSelectedItem().toString();


        if(sickness.equals("Normal Cough")) {

            result.setText("You have a cough");
       }

        else {
            result.setText("sdfsdfs" + sickness + "a");
       }
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        final Spinner group = (Spinner)findViewById(R.id.spinner);
        //final Spinner group2 = (Spinner)findViewById(R.id.spinner2);
        String sickness = group.getSelectedItem().toString();
        String sickness2 = group.getSelectedItem().toString();
        if(sickness.equals("Normal Cough")) {
        String message = "\nDiagnosis:\n\n" +
                "You have a " + group.getSelectedItem().toString() + ".\nMeaning the phlegm you have is normal or wet. For now, your " +
                "cough is considered normal. It is advisable that you take the following medicines: \n\n" +
                "> Solmux(Carbocisteine) - Oral Dose of 6 to 8 hours. 1 capsule for 12 years old & above, 1 tsp for 11 years old & below."
                 + "\n\n" +
                 "Recomendations:\n\n" +
                        " > Don't drink cold water.\n > Avoid eating sweet/sugary foods.\n > Avoid sweating/too much work\n > Drink  lots " +
                " of water! \n> Avoid being exposed the rain. \n\nIf Symptoms persist, consult your doctor.";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent); }
        else if(sickness.equals("Dry Cough")) {
            String message = "\nDiagnosis:\n\n" +
                    "You have a " + group.getSelectedItem().toString() + ".\nThe phlehm you have is dry and hard to excrete through " +
                    "coughing, this type of cough is hard to cure. It is advisable that you take the following medicines: \n\n" +
                    "> Solmux(Carbocisteine) - Oral Dose of 6 to 8 hours. 1 capsule for 12 years old & above, 1 tsp for 11 years old & below.\n" +
                    "> Cefuroxime(Anti-biotic) - 1 tablet twice a day(advisable for adults only) \n\n" +
                    "Recommendations:\n\n " +
                    "> Don't drink cold water.\n" +
                    "> Avoid eating sweet/sugary foods.\n" +
                    "> Avoid sweating/too much work\n" +
                    "> Avoid being exposed to the rain\n" +
                    "> Drink lots of waters!\n\n" +

                    "If Symptoms persist, consult your doctor." ;

            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }
        else if(sickness.equals("Headache")) {
            String message = "\nDiagnosis:\n\n" +
                    "You have a " + group.getSelectedItem().toString() + ".\nThe most common cause of headache is stress, or prolonged " +
                    "stress. For usual headaches, it is advisable that you take the following medicine(s): \n\n" +
                    "> Biogesic - 1 tablet(for adults) whenever the headache occurs. It is advisable to take only 1 tablet.\n\n" +
                    "Recommendations:\n\n" +
                    "> Drink lots of water\n" +
                    ">Avoid stressful work \n > Avoid using gadgets(most likely bright screens causes headache)\n > Take a nap or sleep " +
                    "\n\n If symptoms persist, consult your doctor.";


            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }

        else if(sickness.equals("Colds")) {
            String message = "\nDiagnosis:\n\n" +
                    "You have a " + group.getSelectedItem().toString() + ".\nYo'ure having colds which is affecting your nose, " +
                    "which is manifested by either runny nose ot sneezing. It is advisable that you take the following medicines: \n\n" +
                    "> Neozep Forte - Oral Dosage for every 6 hours for 12 years old above \n\n" +
                    "Recommendations:\n\n" +
                    "> Avoid sweating/too much work\n" +
                    "> Drink Lots of Waters\n" +
                    "> Avoid being exposed to the rain.\n\n" +
                    "" +
                    "If symptoms persists, consult your doctor.";

            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }
        else {
            String message="No sickness or symptoms detected, please make sure that you:\n\n" +
                    "> Inputted at least 1 major symptom\n\n" +
                    "> It might have been that the symptoms you entered doesn't match with the ones with our database, please make sure " +
                    "that they're entered in all capital letters and separated by spaces. Also, we remind you again that we only provide " +
                    "diagnosis and recommendations for basic/common sickness.\n\n" +
                    "Need more help? Please visit the help page.";
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
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
