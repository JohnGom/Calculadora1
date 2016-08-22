package pp.gomez.com.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button pasar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.CalRelative);

        pasar=(Button)findViewById(R.id.btnp);

        pasar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){

                Intent siguiente = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(siguiente);

            }

        });



    }
}
