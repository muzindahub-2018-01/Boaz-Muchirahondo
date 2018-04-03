package e.lenovo.BoazMuchirahondoProject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class zimfacts extends AppCompatActivity {
    TextView factbox;
    facts factfolder = new facts();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zimfacts);
        factbox = (TextView) findViewById(R.id.FactTextbox);
    }
    public void genFact(View view )
    {
        factbox.setText(factfolder.nextFact());

    }
}
