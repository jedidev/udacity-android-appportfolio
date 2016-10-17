package tristanheal.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mApp1Button;
    private Button mApp2Button;
    private Button mApp3Button;
    private Button mApp4Button;
    private Button mApp5Button;
    private Button mApp6Button;

    private android.view.View.OnClickListener mClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mClickListener = new android.view.View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Button mButton = (Button)v;
                CharSequence mButtonText = mButton.getText();
                Toast.makeText(MainActivity.this, getText(R.string.toast_prompt).toString() + mButtonText.toString(), Toast.LENGTH_SHORT).show();
            }
        };

        mApp1Button = (Button)findViewById(R.id.app1_button);
        mApp2Button = (Button)findViewById(R.id.app2_button);
        mApp3Button = (Button)findViewById(R.id.app3_button);
        mApp4Button = (Button)findViewById(R.id.app4_button);
        mApp5Button = (Button)findViewById(R.id.app5_button);
        mApp6Button = (Button)findViewById(R.id.app6_button);

        mApp1Button.setOnClickListener(mClickListener);
        mApp2Button.setOnClickListener(mClickListener);
        mApp3Button.setOnClickListener(mClickListener);
        mApp4Button.setOnClickListener(mClickListener);
        mApp5Button.setOnClickListener(mClickListener);
        mApp6Button.setOnClickListener(mClickListener);

    }
}
