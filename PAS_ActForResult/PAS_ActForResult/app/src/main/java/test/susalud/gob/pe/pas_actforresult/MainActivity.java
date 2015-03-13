package test.susalud.gob.pe.pas_actforresult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
    private static final int CODE_REQUEST=99;
    Button btnMed1, btnMed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
setResult(CODE_REQUEST);
        btnMed1 = (Button) findViewById(R.id.buttonActivityMed1);
        btnMed2 = (Button) findViewById(R.id.buttonActivityMed2);

//        btnMed1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i= new Intent(MainActivity.this, ActivityMed1.class);
//                startActivity(i);
//            }
//        });
//

        btnMed1.setOnClickListener(new EnviaraOtraClaseForResult(MainActivity.this, ActivityMed1.class,CODE_REQUEST));
        btnMed2.setOnClickListener(new EnviaraOtraClaseForResult(MainActivity.this, ActivityMed2.class,CODE_REQUEST));




    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//        if (resultCode!=CODE_REQUEST){
//            finish();
//        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
