package org.softcatala.corrector;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        String steps = getResources().getString(R.string.install_steps);
        TextView textView = findViewById(R.id.textViewSteps);
        textView.setText(steps);

        String limitations = getResources().getString(R.string.app_limitations);
        textView = findViewById(R.id.textViewLimitations);
        textView.setText(limitations);

        Button okButton = findViewById(R.id.buttonClose);
        String text = getResources().getString(R.string.button_close);
        okButton.setText(text);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$LanguageAndInputSettingsActivity"));
                startActivity(intent);
            }
        });
    }
}
