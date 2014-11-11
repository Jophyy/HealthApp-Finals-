package healthapp.example.com.healthapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MainActivity extends ActionBarActivity {

    public final static String EXTRA_MESSAGE = "healthapp.example.com.healthapplication.MESSAGE";
    private CharSequence input;

    public void displayAbout(View view) {
        Intent intent = new Intent(this,DisplayAbout.class);
        String message =
                "The Health Diagnostic Application is an application that gives diagnostics and recommendations on some common and basic " +
                "sickness like cough, fever, colds etc. It's main purpose is to help people who can't afford basic check up for health issues.\n\n Though it is still advisable that you consult your doctor for approriate diagnosis(for serious illnesses) " +
                "The diagnostics and recommendations are based on the research and experience(within the Philippines) conducted by the creator of this app. Also, the research was conducted generally, meaning illnesses were researched based on their common symptoms." +
                "\n\nPlease take note that this app is still in developing or beta mode, it can still produce error on some cases." +
                "Also, the medicines provided on the each diagnosis are based on the most popular brands used on various sickness " +
                "which are commonly found on advertisements, we remind you to take prescriptions with care. \n\nIf symptoms persists, " +
                "please consult your doctor.\n\n";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void displayHelp(View view) {
        Intent intent = new Intent(this,DisplayHelp.class);
        String message =
                "Guidelines for using this app: \n\n" +
                "> Please make sure that you've chosen a major symptom or sickness, else there will be no diagnosis to be prompted\n\n" +
                "> For the secondary symptoms, make sure that you use all capital letters separated by comma(,) per symptom(s).\n\n" +
                "> If you are to input a single illness/symptom(only) from the list, make sure that you leave the secondary symptom field blank, else it will display an error page.\n\n" +
                "> In rare cases, this app will output an error message if there is a tie between the symptoms entered, so please make sure to input as many symptoms as possible to be specific.\n\n" +
                "> You can look in our database page for the list of serious illnesses and their symptoms to be typed specifically.";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void displayNews(View view) {
        Intent intent = new Intent(this,DisplayNews.class);
        String message = "\n" +
                "Flu - Fever, Cough, Sore throat, Colds, Runny nose, Headache, Chills, Fatigue, Vommiting, Diahrrea\n\n" +
                "Diahrrea - Abdominal pain, Boody stools, Tarry Stools, Watery stools, Fever, Dehydration\n\n" +
                "Anemia - Fatigue, Pale skin, Weakness, Low enrgey, Breath shortness, Chest pain, Frequent infections, Headache, Diziness, Lightheadedness\n\n" +
                "Dengue - Headache, Eye pain, Nausea, Vommiting, Swollen glands, Body pain, Muscle Pain, Joint pain, Rash, Abdominal pain, Bleeding gums, Vommitting blood, Rapid breathing, Fatigue\n\n" +
                "Hepatitis A - Fatigue, Nausea, Vommiting, Abdominal pain, Loss of appetite, Fever, Dark Urine, Joint pain, Yellowing of Skin, Yellowing of eyes, Clay colored waste\n\n" +
                "Pneumonia - Cough, Coughing blood, Fever, Shaking chills, Breath shortness, Chest pain, Headache, Sweating, Loss of appetite, Confusion\n\n" +
                "" +
                "Want to request for an illness to be added ont this app? You can e-mail the developer on: @email.com";

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }


    public void sendMessage(View view) {
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        final Spinner group = (Spinner)findViewById(R.id.spinner);
        final EditText field = (EditText)findViewById(R.id.sick2);
        //final Spinner group2 = (Spinner)findViewById(R.id.spinner2);
        String sickness = group.getSelectedItem().toString();
        String sickness2 = field.getText().toString();


        if(sickness.equals("Wet Cough") && sickness2.equals("")) {
            String message =  "Diagnosis:\n\n" +
                    "The sysmptom(s)/sickness you've chosen is wet cough. Wet cough is a common symptom of respiratory infection, allergies, and heart conditions. The medical term for a wet cough is productive cough." +
                    "It  advisable that you take the following medicines:\n\n" +
                    "> Solmux(Carbocisteine) - Oral Dose of 6 to 8 hours. 1 capsule for 12 years old & above, 1 tsp for 11 years old & below."
                    + "\n\n" +
                    "Recomendations:\n\n" +
                    " > Don't drink cold water.\n > Avoid eating sweet/sugary foods.\n > Avoid sweating/too much work\n > Drink  lots " +
                    " of water! \n> Avoid being exposed the rain. \n\nIf symptoms persist, consult your doctor.\n\n" +
                    "Sources:\n" +
                    "http://www.healthgrades.com/symptoms/wet-cough\n" +
                    "http://www.thefilipinodoctor.com/\n";
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent); }
        else if(sickness.equals("Dry Cough") && sickness2.equals("")) {
            String message = "\nDiagnosis:\n\n" +
                    "The sysmptom(s)/sickness you've chosen is dry cough." + "A dry cough is a type of cough which does not produce any mucus or phlegm." +
                    "It is advisable that you take the following medicines: \n\n" +
                    "> Solmux(Carbocisteine) - Oral Dose of 6 to 8 hours. 1 capsule for 12 years old & above, 1 tsp for 11 years old & below.\n" +
                    "> Cefuroxime(Anti-biotic) - 1 tablet twice a day(advisable for adults only) \n\n" +
                    "Recommendations:\n\n " +
                    "> Don't drink cold water.\n" +
                    "> Avoid eating sweet/sugary foods.\n" +
                    "> Avoid sweating/too much work\n" +
                    "> Avoid being exposed to the rain\n" +
                    "> Drink lots of waters!\n\n" +

                    "If symptoms persist, consult your doctor.\n\n" +
                    "Sources:\n" +
                    "http://www.avogel.co.uk/health/immune-system/cough/dry/\n" +
                    "http://www.drugs.com/dosage/cefuroxime.html\n" ;
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }
        else if(sickness.equals("Headache") && sickness2.equals("")) {
            String message = "\nDiagnosis:\n\n" +
                    "The symptom(s)/sickness you've chosen is headache." + "The most common cause of headache is stress, or prolonged " +
                    "stress. For usual headaches, it is advisable that you take the following medicine(s): \n\n" +
                    "> Biogesic - Tab: Adult & pedia >12 yrs old: 1 tab every 4-6 hrs PRN. 250 mg/5 mL Susp: Adult & pedia > 12 yrs old: 2 tsp, " +
                    "7-12 yrs old: 1-1½ tsp, 3-6 yrs old: ½-1 tsp, 1-2 yrs: ½ tsp. 120 mg/5 mL. Susp: Adult & pedia > 12 yrs old: 3-4 tsp, " +
                    "7-12 yrs old: 2-3 tsp, 3-6 yrs old: 1-2 tsp, 1-2 yrs old: 1 tsp. 100 mg/mL. Drops: 1-2 yrs old: 1-1.2 mL, 7-11 mos old: " +
                    "1 mL, 4-6 mos old: 0.6-1 mL, birth-3 mos old: 0.3-0.6 mL.\n\n" +
                    "Recommendations:\n\n" +
                    "> Drink lots of water\n" +
                    "> Avoid stressful work \n" +
                    "> Avoid using gadgets(most likely bright screens causes headache)\n" +
                    "> Take a nap or sleep" +
                    "\n\n If symptoms persist, consult your doctor.\n\n" +
                    "Sources:\n" +
                    "http://www.mayoclinic.org/symptoms/headache/basics/causes/sym-20050800\n" +
                    "http://www.thefilipinodoctor.com/search-drug-details.php\n";


            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }

        else if(sickness.equals("Colds") && sickness2.equals("")) {
            String message = "\nDiagnosis:\n\n" +
                    "The symptom(s)/sickness you've chosen is colds." + "The common cold is medically referred to as a viral upper respiratory tract infection. Symptoms of the common cold may include cough, sore throat, nasal congestion, runny nose, and sneezing." +
                    "It is advisable that you take the following medicines: \n\n" +
                    "> Neozep Forte - Oral Dosage for every 6 hours for 12 years old above \n\n" +
                    "Recommendations:\n\n" +
                    "> Avoid sweating/too much work\n" +
                    "> Drink Lots of Waters\n" +
                    "> Avoid being exposed to the rain.\n\n" +
                    "" +
                    "If symptoms persists, consult your doctor.\n\n" +
                    "Sources:\n" +
                    "http://www.nhs.uk/Conditions/Cold-common/Pages/Symptoms.aspx\n" +
                    "http://www.thefilipinodoctor.com/\n";

            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }

        else if(sickness.equals("Body Pain(General)") && sickness2.equals("")) {
            String message = "Diagnosis:\n\n" +
                    "The symptom(s)/sickness you've chosen is Body pain(in general). It's causes" +
                    " include ligament or muscle strains or sprains, muscle spasms, or arthritic or swollen joints. It is advisable that you" +
                    "take the following medicine(s):\n\n" +
                    "> Mefenamic Acid - (Note: It is advisable that you read the warnings if you've decided to take this medicine as" +
                    "it may cause allergy and conflict within your body system). For dosage, please consult your doctor..\n\n" +
                    "Recommendations:\n\n" +
                    "> Avoid poor posture\n" +
                    "> Avoid excessive lifting/excercises.\n" +
                    "> Avoid sudden movements such as twisting." +
                    "> Rest when needed !\n\n" +
                    "If sysmptoms persists consult your doctor.\n\n" +
                    "Sources:\n" +
                    "https://www.excedrin.com/info-center/body-pain/types-and-causes-of-body-pain.shtml\n" +
                    "http://www.thefilipinodoctor.com/search-drug-details.php\n";

            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }

        else if(sickness.equals("Constipation") && sickness2.equals("")) {
            String message = "Diagnosis: \n\n" +
                    "The symptom(s)/sickness you've chosen is constipation. It's common causes include inadequate water intake, inadequate fiber  " +
                    "in diet, inadequate excercise or mobility, eating large amounts of dairy products and stress. It is advisable that" +
                    "you take the following medicine(s):\n\n" +
                    "> Dulcolax - 1 to 3 tablets a day(for Adults). 1 tablet a day(for children).\n\n" +
                    "Recommendations:\n\n" +
                    "> Drink lots of water!\n" +
                    "> Eat foods that are rich in fiber such as whole weat bread, cereals(corn flakes), fruits(apples, oranges etc.)" +
                    "beans, spaghetti(whole weat) etc.\n" +
                    "> Excercise regularly\n" +
                    "> Don't ignore when you have the urge to have a bowel movement.\n\n" +
                    "If symptoms persist, consult your doctor.\n\n" +
                    "Sources:\n" +
                    "https://www.excedrin.com/info-center/body-pain/types-and-causes-of-body-pain.shtml\n" +
                    "http://www.patient.co.uk/\n" +
                    "http://www.todaysdietitian.com/newarchives/063008p28.shtml\n" +
                    "http://www.wikihow.com/Avoid-Constipation\n" +
                    "http://www.empr.com/dulcolax/drug/1370/\n";

            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }

        else if(sickness.equals("Fever(above 37C)") && sickness2.equals("")) {
               String message = "Diagnosis:\n\nThe symptom(s)/sickness you've chosen is fever. It's causes is a part of the brain called the hypothalamus controls body temperature " +
                       "hich usually varies throughout the day from the normal temperature of 37 C. In response to an infection, illness, or " +
                       "some other cause, the hypothalamus may reset the body to a higher temperature. It's sysmptoms include feeling " +
                       "unwell, hot and sweaty, shivering and sever headache. It is advisable that you take the following medicines:\n\n" +
                       "> Paracetamol(Biogesic) - 1 tablet every 4 to 6 hours.(for Adult).Tab: Adult & pedia >12 yrs old: 1 tab every 4-6 hrs PRN. 250 mg/5 mL Susp: Adult & pedia > 12 yrs old." +
                       "2 tsp, 7-12 yrs old: 1-1½ tsp, 3-6 yrs old: ½-1 tsp, 1-2 yrs: ½ tsp. 120 mg/5 mL. Susp: Adult & pedia > 12 yrs old: 3-4 tsp, 7-12 yrs old: 2-3 tsp," +
                       "3-6 yrs old: 1-2 tsp, 1-2 yrs old: 1 tsp. 100 mg/mL. Drops: 1-2 yrs old: 1-1.2 mL, 7-11 mos old: 1 mL, 4-6 mos old:" +
                       " 0.6-1 mL, birth-3 mos old: 0.3-0.6 mL.\n\n" +
                       "Recommendations:\n\n" +
                       "> Rest!\n" +
                       "> Avoid work or any physical activity, make sure you get sufficient rest.\n" +
                       "> Drink your medicines timely.\n" +
                       "> Eat healthy foods such as fruits and vegetables.\n" +
                       "> Drink lots of water.\n\n" +
                       "" +
                       "If symptoms persist, consult your doctor.\n\n" +
                       "Sources:\n" +
                       "http://www.mayoclinic.org/diseases-conditions/fever/basics/symptoms/con-20019229\n" +
                       "http://www.thefilipinodoctor.com";
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }

        else if(sickness.equals("Stomach Ache") && sickness2.equals("")) {
                 String message = "Diagnosis:\n\nThe symptom(s)/sickness you've chosen is stomach ache. There are a lot of causes for this which includes " +
                         "indigestion, constipation(you can look for the cure for this), ulcers, appendicitis etc. and it could" +
                         "possibly be diarrhea. We'll only specify medication for ulcer & having watery stools. It is advisable " +
                         "that you take the following medicines: \n\n" +
                         "> Kremil -S - (For hyperacidity associated with peptic ulcer, gastritis, esophagitis, and dyspepsia) " +
                         "1-2 tablets, 1 hr after each meal & at bedtime. Or as prescribed by a doctor.\n" +
                         "> Diatabs - (For stomach ache & having water stools/Acute Diarrhea) 2 cap followed by 1 cap after each loose bowel movement. Do not use for  > " +
                         "2 days.\n\n" +
                         "Recommendations:\n\n" +
                         "> Excercise or take a walk to release gas in your stomach\n" +
                         "> Most of the foods produce gas, foods high in fiber can produce gas, make sure to manage eating foods that" +
                         " are rich in fiber.\n" +
                         "> Make sure you eat in time to avoid ulcer or abdominal pain.\n" +
                         "> To prevent gas, chew your food thoroughly and don't bolt down your food.\n" +
                         "> Don't eat too much! Your stomach has its limits also!\n" +
                         "> Drink your medicines in time.\n" +
                         "> In case of diarrhea, drink water to prevent dehydration.\n" +
                         "> Regulate your intake of fiber.\n\n" +
                         "If sysmptoms persist, consult your doctor.\n\n" +
                         "Sources:\n" +
                         "http://www.thefilipinodoctor.com/\n" +
                         "http://patients.gi.org/topics/diarrhea-acute-and-chronic/\n" +
                         "http://www.webmd.com/pain-management/guide/abdominal-pain-causes-treatments\n" +
                         "http://www.wikihow.com/Stop-Daily-Stomach-Aches-(for-Teens)\n"
                         ;
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }

        else if(sickness.equals("Fatigue/Low Energy") && sickness2.equals("")) {
            String message = "Diagnosis:\n\nThe symptom(s)/sickness you've chosen is Fatigue or having low energy. There are many causes of fatigue" +
                    " in different criteria, for lifestyle factors, it may be due to lack of sleep, excessive physical activities," +
                    " alchohol abuse and many more, for physchological factors, most causes are stress and anxiety. For medical factors" +
                    " for basic concerns, it may be due to anemia. Mostly it is advisable that you go and get a check up from doctor if" +
                    "you have anemia. It is advisable that you take the following medicines for some conditions:\n\n" +
                    "> Enervon(Vitamin B's and C) - at most 1 tablet a day(for adults and teenagers).\n" +
                    "> Appebon(Iron & Vitamin B's) - 1 capsule per day after eating(for adults and teenagers).\n\n" +
                    "" +
                    "Recommendations:\n\n" +
                    "> Make sure to get a check up first if it's related to anemia or thyroid problems.\n" +
                    "> Make sure to get enough rest and sleep.\n" +
                    "> Avoid excessive physical activities\n" +
                    "> Eat foods that are rich in iron(beef, chicken,broccoli etc.)\n" +
                    "> Make sure to take supplements that promote iron and vitamin B's." +
                    "" +
                    "If symptoms persists, consult your doctor.\n\n" +
                    "Sources:\n" +
                    "http://www.mayoclinic.org/symptoms/fatigue/basics/causes/sym-20050894\n" +
                    "http://supplements.knoji.com/appebon-with-iron-capsule/\n" +
                    "http://www.webmd.com/diet/iron-rich-foods\n" +
                    "http://www.unilab.com.ph/consumers/products/enervon-tablet/\n";

            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }

        else if(sickness.equals("Fever(above 37C)") && fluMatch(sickness2)>dengueMatch(sickness2)) {
            String message="Diagnosis:\n\n" +
                    "Based from your input, if you're having Fever as your major symptom and also have at least one of the following " +
                    "which matches at least one with your input (Cough, Runny Nose, Headaches, Chills, Fatigue and Vomitting), then you" +
                    " might be having a Flu. It is advisable that you take the following medicines:\n\n" +
                    "> Bioflu - Tab- Adult & childn > 12 yrs: 1 tab. Susp- Adult & childn > 12 yrs: 15 mL. 7-12 yrs: 10 mL. 2-6 yrs: 5 mL. To be taken every 6 hrs. Or as directed." +
                    "\n\n" +
                    "Recommendations:\n\n" +
                    "> Rest!\n" +
                    "> Avoid work or any physical activity, make sure you get sufficient rest.\n" +
                    "> Drink your medicines timely\n" +
                    "> Eat healthy foods such as fruits and vegetables.\n" +
                    "> Drink lots of water.\n" +
                    "> Avoid being exposed to the rain\n" +
                    "> Eat healthy foods such as fruits and vegetables\n" +
                    "> It is advisable that you consult your doctor for any other possible diagnosis.\n\n" +
                    "If symptoms persists, consult your doctor.\n\n" +
                    "Sources:\n" +
                    "http://www.flu.gov/symptoms-treatment/symptoms/\n" +
                    "http://www.thefilipinodoctor.com/\n";
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }

        else if(sickness.equals("Stomach Ache") && diarrheaMatch(sickness2)>hepatitisMatch(sickness2)) {
             String message="Diagnosis:\n\n" +
                     "Based from your input, if you're having Stomach Ache as your major symptom and also have at least one of the following " +
                     "which matches at least one of your input (Abdominal Pain, Bloody stools, Tarry stools, Fever and Dehydration) " +
                     "then you might be having a Diarrhea. It is mostly advisable that you consult your doctor for such serious illness. " +
                     "The advisable medicine to take for the following symptoms are as follows: \n\n" +
                     "> Diatabs - (For stomach ache & having water stools/Acute Diarrhea) 2 cap followed by 1 cap after each loose bowel movement. " +
                     "Do not use for > 2 days.\n" +
                     "> Paracetamol(Biogesic) - (for Fever) 1 tablet every 4 to 6 hours.(for Adult).Tab: Adult & pedia >12 yrs old: 1 tab every 4-6 hrs PRN. 250 mg/5 mL Susp: Adult & pedia > 12 yrs old.\n" +
                     "2 tsp, 7-12 yrs old: 1-1½ tsp, 3-6 yrs old: ½-1 tsp, 1-2 yrs: ½ tsp. 120 mg/5 mL. Susp: Adult & pedia > 12 yrs old: 3-4 tsp, 7-12 yrs old: 2-3 tsp,\n" +
                     "3-6 yrs old: 1-2 tsp, 1-2 yrs old: 1 tsp. 100 mg/mL. Drops: 1-2 yrs old: 1-1.2 mL, 7-11 mos old: 1 mL, 4-6 mos old:\n" +
                     "0.6-1 mL, birth-3 mos old: 0.3-0.6 mL.\n" +
                     "> Consult your doctor for other medicines\n\n" +
                     "" +
                     "Recommendations:\n\n" +
                     "> Rest!\n" +
                     "> Avoid work or any physical activity, make sure you get sufficient rest.\n" +
                     "> Drink your medicines timely.\n" +
                     "> Eat healthy foods such as fruits and vegetables.\n" +
                     "> Drink lots of water.\n" +
                     "> Make sure you eat in time to avoid ulcer or abdominal pain.\n" +
                     "> Drink your medicines in time.\n" +
                     "> Drink lots water to prevent dehydration.\n" +
                     "> Don't resist when you feel the urge to go to the bowl\n" +
                     "> Monitor your stools(observe if there is blood) and have a check up to the doctor if needed.\n\n" +
                     "" +
                     "If symptoms persists, consult your doctor.\n\n" +
                     "Sources:\n" +
                     "http://www.webmd.com/digestive-disorders/diarrhea-10/symptoms-serious\n" +
                     "http://www.thefilipinodoctor.com/\n" +
                     "http://patients.gi.org/topics/diarrhea-acute-and-chronic/\n" +
                     "http://www.webmd.com/pain-management/guide/abdominal-pain-causes-treatments\n" +
                     "http://www.wikihow.com/Stop-Daily-Stomach-Aches-(for-Teens)\n";

            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }

        else if((sickness.equals("Headache")||sickness.equals("Fatigue/Low Energy")) && anemiaMatch(sickness2)>0) {
             String message="Diagnosis:\n\n" +
                     "Based from your input, if you're having Headache or Fatigue/Low Energy as your main symptom, and also have at least " +
                     "one of the following which matches at least one of your input (Pale skin, Weakness, Breath Shortness, Chest pain " +
                     "Frequent infections, Headache, Diziness or Lightheadedness), then you might be having an anemia. The most common " +
                     "cause of anemia is the lack of iron or having iron deficiency. It is advisable that you take the following medicines/" +
                     "supplements:\n\n" +
                     "> Ferrous Sulfate - (For Adults): 300 to 325 mg of regular-release ferrous sulfate orally once a day. " +
                     "(Premature neonates): 2 to 4 mg elemental iron/kg/day divided every 12 to 24 hours (maximum daily dose = 15 mg). " +
                     "(Infants and children less than 12 years): 1 to 2 mg elemental iron/kg/day (maximum 15 mg) in 1 to 2 divided doses. " +
                     "(11 to 18 years): 12 mg elemental iron\n" +
                     "> Biogesic(Optional - for headache) - Tab: Adult & pedia >12 yrs old: 1 tab every 4-6 hrs PRN. 250 mg/5 mL Susp: Adult & pedia > 12 yrs old: 2 tsp, \n" +
                     "7-12 yrs old: 1-1½ tsp, 3-6 yrs old: ½-1 tsp, 1-2 yrs: ½ tsp. 120 mg/5 mL. Susp: Adult & pedia > 12 yrs old: 3-4 tsp,\n" +
                     "7-12 yrs old: 2-3 tsp, 3-6 yrs old: 1-2 tsp, 1-2 yrs old: 1 tsp. 100 mg/mL. Drops: 1-2 yrs old: 1-1.2 mL, 7-11 mos old: \n" +
                     "1 mL, 4-6 mos old: 0.6-1 mL, birth-3 mos old: 0.3-0.6 mL.\n" +
                     "> Appebon(Supplement - Iron & Vitamin B's) - 1 capsule per day after eating(for adults and teenagers). \n" +
                     "> Enervon(Supplement - Vitamin B's and C for enhanced energy) - at most 1 tablet a day(for adults and teenagers).\n\n" +
                     "" +
                     "Recommendations:\n\n" +
                     "> Drink lots of water.\n" +
                     "> Avoid stressful work/physical activities.\n" +
                     "> Make sure to get enough rest and sleep everyday.\n" +
                     "> Eat foods that are rich in iron(beef, chicken,broccoli etc.).\n" +
                     "> Make sure to take supplements that promote iron and vitamin B's as suggested above.\n" +
                     "> Eat healthy foods such as fruits and vegetables.\n" +
                     "> Consult your doctor for further treatment.\n\n" +
                     "" +
                     "If symptoms persist, consult your doctor.\n\n" +
                     "Sources:\n" +
                     "http://www.mayoclinic.org/diseases-conditions/iron-deficiency-anemia/basics/symptoms/con-20019327\n" +
                     "http://www.mayoclinic.org/diseases-conditions/anemia/basics/causes/con-20026209\n" +
                     "http://www.drugs.com/dosage/ferrous-sulfate.html\n" +
                     "http://supplements.knoji.com/appebon-with-iron-capsule/\n" +
                     "http://www.webmd.com/diet/iron-rich-foods\n" +
                     "http://www.unilab.com.ph/consumers/products/enervon-tablet/\n" +
                     "http://www.thefilipinodoctor.com";

            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }

        else if(sickness.equals("Fever(above 37C)") && (dengueMatch(sickness2)>fluMatch(sickness2))) {
            String message = "Diagnosis:\n\n" +
                    "Based from your input, if you're having Fever(temperature of above 37C) as your main symptom, and also at least " +
                    "one of the following which matches at least one of your input(Headache, Eye pain, Nauesea, Vomitting, Swollen Glands, " +
                    "Joint, Bone or Muscle Pains and Rash), then you might be having a serious disease called Denguge. Dengue causes flu-like symptoms and lasts for 2-7 days. " +
                    "Dengue fever usually occurs after an incubation period of 4-10 days after the bite of the infected mosquito. Be aware the severe" +
                    " dengue would manifest in the following symptoms(Severe abdominal pain, Persistent Vomitting, Bleeding Gums, " +
                    "Vomitting blood, Rapid breathing and Fatigue or restlesness). It is advisable that you send the person experiencing " +
                    "the symptoms consulted to the doctor as soon as possible to be diagnosed and treated.\n\n" +
                    "" +
                    "Recommendations:\n\n" +
                    "> Have plenty amount of rest or sleep.\n" +
                    "> Drink plenty of water or fluids to avoid dehydration.\n" +
                    "> Take the medications prescribed by the doctor as soon as possible.\n\n" +
                    "Sources:\n" +
                    "http://www.who.int/denguecontrol/faq/en/index2.html\n" +
                    "http://www.internations.org/philippines-expats/guide/living-in-the-philippines-15358/the-philippines-healthcare-and-diseases-2\n" +
                    "http://www.betterhealth.vic.gov.au/bhcv2/bhcarticles.nsf/pages/Dengue_fever\n";
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }

        else if(sickness.equals("Stomach Ache") && (hepatitisMatch(sickness2)>diarrheaMatch(sickness2))) {
             String message = "Diagnosis:\n\n" +
                     "Based from your input, if you're having stomach ache as your prrimary symptom, and also have at least one of the following" +
                     " which matches at least one of your input(Fatigue, Nausea or Vomitting, Abdominal pain, Clay colored waste, " +
                     "Loss of appetite, Low-grade fever, Dark urine, Joint pain and Yellowing of skin or eyes), then you might be having" +
                     " a sickness called Hepatitis A. It is viral disease that interferes with the functioning of the liver; spread through consumption " +
                     "of food or water contaminated with fecal matter, principally in areas of poor sanitation; victims exhibit fever, jaundice, and " +
                     "diarrhea; 15% of victims will experience prolonged symptoms over 6-9 months. It is advisable that you get a " +
                     "check up from your doctor for possible medications and vaccinations as soon as possible.\n\n" +
                     "Recommendations:\n\n" +
                     "> Be aware of the food you're eating and the water you're drinking, whether you're eating on your home or outside.(Check to see if the" +
                     "y're cooked well, cooked from a place with good sanitation and the likes)\n" +
                     "> You can have vaccination to avoid Hepatitis A & B.\n" +
                     "> Keep your hands clean! (Especially when you're about to eat)\n" +
                     "> Make sure to take the prescriptions assigned by the doctor as soon as possible.\n\n" +
                     "Sources:\n" +
                     "http://www.indexmundi.com/philippines/major_infectious_diseases.html\n" +
                     "http://www.mayoclinic.org/diseases-conditions/hepatitis-a/basics/symptoms/con-20022163\n" +
                     "http://www.webmd.com/hepatitis/features/viral-hepatitis-8-self-defense-tips-for-travelers?page=3\n";
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }

        else if((sickness.equals("Wet Cough")||sickness.equals("Dry Cough")) && pneumoniaMatch(sickness2)>0) {
            String message = "Diagnosis:\n\n" +
                    "Based from your input, if you're having Wet Cough or Dry Cough as your primary symptom, and also have at least one of the following " +
                    "which matches at least one of your input (Coughing Blood, Fever, Shaking Chills, Shortness of breath, Chest pain, Headache, Sweating, " +
                    "Loss of appetite and Confusion), then you might be having a sickness called Pneumonia. Pneumonia usually starts when you breathe the germs into your lungs. " +
                    "You may be more likely to get the disease after having a cold or the flu. These illnesses make it hard for your lungs to " +
                    "fight infection, so it is easier to get pneumonia. Having a long-term, or chronic, disease like asthma, heart disease, " +
                    "cancer, or diabetes also makes you more likely to get pneumonia. It is advisable that you go to the doctor to be verified. " +
                    "Since Pneumonia is a serious illness, we can only provide recommendations about the disease.\n\n" +
                    "Recommendations:\n\n" +
                    "> Drink plenty of fluids to help loosen secretions and bring up phlegm.\n" +
                    "> Get lots of rest and/or sleep.\n" +
                    "> Do not take cough medicines without first talking to your doctor. Cough medicines may make it harder for " +
                    "your body to cough up the extra sputum.\n" +
                    "> Control your fever with aspirin, nonsteroidal anti-inflammatory drugs (NSAIDs, such as ibuprofen or naproxen), or " +
                    "acetaminophen. DO NOT give aspirin to children.\n" +
                    "> Stay at home! Make sure you avoid excessive work than will make you sweaty. Avoid being exposed to the rain as well.\n" +
                    "> It is also advisable that you get checked for tubercolosis, as it has the same symptoms. The symptoms for tubercolosis " +
                    "include: Bad cough that lasts 3 weeks or longer, Pain in the chest, Coughing up blood or " +
                    "sputum (phlegm from deep inside the lungs), Weakness or fatigue, Weight loss, No appetite, Chills, Fever, " +
                    "Sweating at night.\n\n" +
                    "Sources:\n" +
                    "http://www.allaboutdiabetes.net/top-10-diseases-in-the-philippines/\n" +
                    "http://www.lung.org/lung-disease/pneumonia/symptoms-diagnosis-and.html\n" +
                    "http://www.webmd.com/lung/tc/pneumonia-topic-overview\n" +
                    "http://www.mayoclinic.org/diseases-conditions/tuberculosis/basics/symptoms/con-20021761\n";
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

    public boolean match(String symp2) {

        Pattern p = Pattern.compile("(mouse|cat|dog|wolf|bear|human)");
        Matcher m = p.matcher(symp2);

        List<String> animals = new ArrayList<String>();
        while (m.find()) {
            animals.add(m.group());
        }

        if(animals.isEmpty()) {
            return false;
        }
        else {
            return true;
        }

    }

    public int fluMatch(String symp2) {

        Pattern p = Pattern.compile("(FEVER|COUGH|SORE THROAT|COLDS|RUNNY NOSE|HEADACHE|CHILLS|FATIGUE|VOMITTING|DIARRHEA)");
        Matcher m = p.matcher(symp2);
        int ctr=0;

        List<String> symps = new ArrayList<String>();
        while (m.find()) {
            symps.add(m.group());
            ++ctr;
        }

        return ctr;
        //if(symps.isEmpty()) {
        //    return false;
        //}
        //else {
         //   return true;
        //}

    }

    public int diarrheaMatch(String symp2) {

        Pattern p = Pattern.compile("(ABDOMINAL PAIN|BLOODY STOOLS|TARRY STOOLS|WATERY STOOLS|FEVER|DEHYDRATION)");
        Matcher m = p.matcher(symp2);
        int ctr=0;

        List<String> symps = new ArrayList<String>();
        while (m.find()) {
            symps.add(m.group());
            ++ctr;
        }
        return ctr;
        //if(symps.isEmpty()) {
        //    return false;
        //}
        //else {
        //    return true;
        //}

    }

    public int anemiaMatch(String symp2) {

        Pattern p = Pattern.compile("(FATIGUE|PALE SKIN|WEAKNESS|LOW ENERGY|BREATH SHORTNESS|CHEST PAIN|FREQUENT INFECTIONS|HEADACHE|DIZINESS|LIGHTHEADEDNESS)");
        Matcher m = p.matcher(symp2);
        int ctr=0;

        List<String> symps = new ArrayList<String>();
        while (m.find()) {
            symps.add(m.group());
            ++ctr;
        }
        return ctr;
       // if(symps.isEmpty()) {
        //    return false;
       // }
       // else {
        //    return true;
        //}
     }

    public int dengueMatch(String symp2) {

        Pattern p = Pattern.compile("(HEADACHE|EYE PAIN|NAUSEA|VOMITTING|SWOLLEN GLANDS|BODY PAIN|MUSCLE PAIN|JOINT PAIN|RASH" +
                "|ABDOMINAL PAIN|BLEEDING GUMS|VOMITTING BLOOD|RAPID BREATHING|FATIGUE)");
        Matcher m = p.matcher(symp2);
        int ctr=0;

        List<String> symps = new ArrayList<String>();
        while (m.find()) {
            symps.add(m.group());
            ++ctr;
        }
        return ctr;
       // if(symps.isEmpty()) {
       //     return false;
       // }
       // else {
      //      return true;
      //  }
    }

    public int hepatitisMatch(String symp2) {

        Pattern p = Pattern.compile("(FATIGUE|NAUSEA|VOMITTING|ABDOMINAL PAIN|LOSS OF APPETITE|FEVER|DARK URINE|JOINT PAIN|YELLOWING OF SKIN|" +
                "YELLOWING OF EYES|CLAY COLORED WASTE)");
        Matcher m = p.matcher(symp2);
        int ctr=0;

        List<String> symps = new ArrayList<String>();
        while (m.find()) {
            symps.add(m.group());
            ++ctr;
        }
        return ctr;
       // if(symps.isEmpty()) {
       //     return false;
       // }
       // else {
       //     return true;
       // }
    }

    public int pneumoniaMatch(String symp2) {

        Pattern p = Pattern.compile("(COUGH|COUGHING BLOOD|FEVER|SHAKING CHILLS|BREATH SHORTNESS|CHEST PAIN|HEADACHE|SWEATING|LOSS OF APPETITE" +
                "|CONFUSION)");
        Matcher m = p.matcher(symp2);
        int ctr=0;

        List<String> symps = new ArrayList<String>();
        while (m.find()) {
            symps.add(m.group());
            ++ctr;
        }
        return ctr;
        // if(symps.isEmpty()) {
        //     return false;
        // }
        // else {
        //     return true;
        // }
    }


}
