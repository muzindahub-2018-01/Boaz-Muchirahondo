package e.lenovo.BoazMuchirahondoProject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText  Name ;
    private EditText Password ;
    private Button login ;
    private int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Name = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        login = (Button) findViewById(R.id.btnlogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString() , Password.getText().toString() );

            }
        });


    }
    private  void validate (String Name ,String Password ){
        if ((Name.equals("B.Muchirahondo")) && (Password.equals("ChunkyBear5000")) ){
            Intent intent = new Intent(MainActivity.this ,  zimfacts.class);
            startActivity(intent);


        }else {
            counter--;
            if (counter==0){
                login.setEnabled(false);
            }
        }
    }
}
