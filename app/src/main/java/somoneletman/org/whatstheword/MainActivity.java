package somoneletman.org.whatstheword;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mdailyDevo;
    private Button mspecificDevo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mdailyDevo = (Button)findViewById(R.id.dailyDevo);
        mspecificDevo = (Button)findViewById(R.id.specificDevo);

        mdailyDevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDailyDevo();
            }
        });

        mspecificDevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSpecificDevo();
            }
        });

    }

    private void goToDailyDevo(){
        Intent intent = new Intent(this, DailyDevo.class);
        startActivity(intent);
    }

    private void goToSpecificDevo(){
        Intent intent = new Intent(this, SpecificDevo.class);
        startActivity(intent);
    }
}
