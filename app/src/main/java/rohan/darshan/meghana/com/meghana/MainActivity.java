package rohan.darshan.meghana.com.meghana;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.ms.square.android.expandabletextview.ExpandableTextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     Toolbar   toolbar = (Toolbar) findViewById(R.id.toolbar);

        if (toolbar != null) {
            setSupportActionBar(toolbar);

            ActionBar actionBar = getSupportActionBar();
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.setDisplayShowTitleEnabled(true);
            actionBar.setDisplayUseLogoEnabled(false);
            actionBar.setHomeButtonEnabled(true);
            actionBar.setTitle("ಪೆಸ್ಟಿಸೈಡ್ ಯೂಸ್ ಪರ್ಯಾಯಗಳ");
        }
//        getSupportActionBar().setTitle("ಪೆಸ್ಟಿಸೈಡ್ ಯೂಸ್ ಪರ್ಯಾಯಗಳು");


//        TelephonyManager tMgr = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
//        String mPhoneNumber = tMgr.getLine1Number();
//        TextView tv = (TextView) findViewById(R.id.tv);
//        tv.setText("qwerty"+mPhoneNumber);
        ((TextView) findViewById(R.id.sample1).findViewById(R.id.title)).setText("ಜೈವಿಕ ನಿಯಂತ್ರಣಗಳು");
        ((TextView) findViewById(R.id.sample2).findViewById(R.id.title)).setText("ರಿಪ್ರೊಡಕ್ಟಿವ್ ನಿಯಂತ್ರಣಗಳು");
        ((TextView) findViewById(R.id.sample3).findViewById(R.id.title)).setText("ಫೆರೊಮನಸ್");
        ((TextView) findViewById(R.id.sample4).findViewById(R.id.title)).setText("ಮೂಲೆಗುಂಪು");
        ExpandableTextView expTv1 = (ExpandableTextView) findViewById(R.id.sample1).findViewById(R.id.expand_text_view);
        //  Biological controls
        expTv1.setText("ಜೈವಿಕ ನಿಯಂತ್ರಣಗಳು ನೈಸರ್ಗಿಕವಾಗಿ ಕೀಟ ನಿಯಂತ್ರಿಸಲು ರೋಗ ಜೀವಿಗಳು ಪರಾವಲಂಬಿಗಳು ಅಥವಾ ಪರಭಕ್ಷಕ ಸಂಭವಿಸುವ ಬಳಸುತ್ತವೆ. ವಿದೇಶೀ ಜಾತಿಗಳ ತಮ್ಮ ಸ್ವಾಭಾವಿಕ ಪರಭಕ್ಷಕ ತಮ್ಮ ಸ್ಥಳೀಯ ಭೂಮಿ ತೆಗೆದುಕೊಂಡು ಕೀಟ ಕೊಲ್ಲಲು ಅನ್ವಯಿಸಬಹುದು ಏಕೆಂದರೆ ಸಮಸ್ಯೆ ಆಗಬಹುದು ವಿಶೇಷವಾಗಿ ಪರಿಣಾಮಕಾರಿಯಾಗಿದೆ. ಜೈವಿಕ ನಿಯಂತ್ರಣಗಳು ಕೀಟಗಳು ಅಲ್ಲ, ಆದರೆ ಕೀಟಗಳನ್ನು ಕೊಲ್ಲಲು ಕೆಲಸ ಬ್ಯಾಕ್ಟೀರಿಯಾ ಮಾಡಬಹುದು.");
        ExpandableTextView expTv2 = (ExpandableTextView) findViewById(R.id.sample2).findViewById(R.id.expand_text_view);
        //  Reproductive control
        expTv2.setText("ರಿಪ್ರೊಡಕ್ಟಿವ್ ನಿಯಂತ್ರಣಗಳು ಅದರ ಕೆಲವೊಂದು ಸದಸ್ಯರು ಕ್ರಿಮಿನಾಶಕಕ್ಕೆ ಮೂಲಕ ಕೀಟ ಜನಸಂಖ್ಯೆ ಕಡಿಮೆ. ಅನೇಕ ಸಂದರ್ಭಗಳಲ್ಲಿ ಬರಡಾದ ಪುರುಷ ತಂತ್ರ ಯಾಕೆಂದರೆ ಹೆಣ್ಣು ಒಮ್ಮೆ ಮಾತ್ರ ಮಿಲನ ಸಂದರ್ಭದಲ್ಲಿ ಗಂಡು ಅನೇಕ ಬಾರಿ ಮಿಲನ ಅನೇಕ ಕೀಟ ಪ್ರಭೇದಗಳು ವಿಕಿರಣ ಅಥವಾ ರಾಸಾಯನಿಕಗಳನ್ನು ಗಂಡು ಇದು sterilizes, ಬಳಸಲಾಗುತ್ತದೆ. ಈ ನಿರಂತರವಾಗಿ ನಡೆಸಿತು ಮಾಡಬೇಕು ಅಥವಾ ಬೇರೆ ಜಾತಿಯ ತ್ವರಿತವಾಗಿ ಮರಳು.");
        ExpandableTextView expTv3 = (ExpandableTextView) findViewById(R.id.sample3).findViewById(R.id.expand_text_view);
        //  Pheromones
        expTv3.setText("ಫೆರೊಮನಸ್ ಸಾಮಾನ್ಯವಾಗಿ ಮೈಥುನಕ್ಕೆ ವ್ಯಕ್ತಿಗಳು ಆಕರ್ಷಿಸಲು ಬಳಸಲಾಗುತ್ತದೆ ಜಾತಿಯ ಇತರ ಸದಸ್ಯರು ಪ್ರತಿಕ್ರಿಯೆ ಉತ್ತೇಜಿಸಲು ಪ್ರಾಣಿಗಳು ನಿರ್ಮಾಣದ ನೈಸರ್ಗಿಕ ಪದಾರ್ಥಗಳಾಗಿವೆ. ಒಂದು ಜಾತಿಯ ನಿರ್ದಿಷ್ಟ ಫೆರೋಮೋನ್ ರಚನೆ ಕರೆಯಲಾಗುತ್ತದೆ ಮತ್ತು ಬಲೆಗಳು ಕೀಟಗಳ ಆಮಿಷ ಬಳಸಲಾಗುತ್ತದೆ, ಅಥವಾ ತಾವು ಸಂಗಾತಿಯ ಪತ್ತೆ ಸಾಧ್ಯವಿಲ್ಲ ಆದ್ದರಿಂದ ಕೀಟಗಳ ಗೊಂದಲ ಗಾಳಿಯಲ್ಲಿ ಸಿಂಪಡಿಸಬಹುದಾಗಿದೆ ಒಮ್ಮೆ ಫೆರೊಮನಸ್ ಮಾಡಬಹುದು. ಹಾರ್ಮೋನುಗಳು ತಮ್ಮ ಬೆಳವಣಿಗೆ ನಿಯಂತ್ರಿಸುವ ಕೀಟಗಳ ನಿರ್ಮಾಣದ ರಾಸಾಯನಿಕಗಳು. ಅವರು ಕೃತಕವಾಗಿ ಮತ್ತು ಪ್ರಸ್ತುತ ಒಂದು ಕೀಟ ಪ್ರಗತಿಗೆ ತಪ್ಪು ಸಮಯದಲ್ಲಿ ಮಾಡಬಹುದು, ಅವರು ಅಸಹಜವಾಗಿ ಬೆಳೆಯಲು ಅಥವಾ ಸಾಯುವ ಕಾರಣವಾಗಬಹುದು.");
        ExpandableTextView expTv4 = (ExpandableTextView) findViewById(R.id.sample4).findViewById(R.id.expand_text_view);
//          Quarantine
        expTv4.setText("ಮೂಲೆಗುಂಪು ಕೀಟಗಳ ಹೊಂದಿರುತ್ತವೆ ಎಂದು ವಿಲಕ್ಷಣ ಸಸ್ಯ ಮತ್ತು ಪ್ರಾಣಿಗಳ ಆಮದು ನಿರ್ಬಂಧವನ್ನು ಹೊಂದಿದೆ. ಪ್ರದೇಶವನ್ನು ವಿಲಕ್ಷಣ ಕೀಟಗಳ ಒಳಗೊಂಡಿದೆ ಎಂಬುದಾಗಿ ಭಾವಿಸಲಾಗುತ್ತದೆ ವೇಳೆ, ಪ್ರದೇಶವು ಸಂಪರ್ಕ ನಿಷೇಧಿತಗೊಂಡಿದೆ ಪ್ರದೇಶದಲ್ಲಿ ಬೆಳೆ ನಾಶ ಅಗತ್ಯ ಸಾಮಾನ್ಯವಾಗಿ ಕೆಟ್ಟ ಮಾಲ್ವೇರ್ ಇದೆ. ಮೂಲೆಗುಂಪು ವಿಫಲವಾದಾಗ ಚದರ ಕಿಲೋಮೀಟರ್ 100 ಕೀಟ ಕೊಂದು ವಿಲಕ್ಷಣ ಕೀಟ ಒಂದು ಪ್ರಮುಖ ಜನತೆಯನ್ನು ನಿಲ್ಲಿಸಲು ಸಿಂಪಡಿಸಬಹುದಾಗಿದೆ ಮಾಡಬೇಕು.");

    }


}
