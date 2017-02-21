package somoneletman.org.whatstheword;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DailyDevo extends AppCompatActivity {

    private DailyVerse mDailyDevo = new DailyVerse();

    private TextView mdbibleVerse;
    private Button manotherDaily;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_devo);


        mdbibleVerse = (TextView) findViewById(R.id.dbibleVerse);
        manotherDaily =(Button) findViewById(R.id.anotherDaily);

        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String verse = mDailyDevo.getVerse();

                mdbibleVerse.setText(verse);
            }

        };
        manotherDaily.setOnClickListener(listener);
    }
}
