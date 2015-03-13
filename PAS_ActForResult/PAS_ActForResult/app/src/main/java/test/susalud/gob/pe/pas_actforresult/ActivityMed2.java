package test.susalud.gob.pe.pas_actforresult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class ActivityMed2 extends Activity {

    private static final int CODE_REQUEST=12;
    Button btnMed2Sub1, btnMed2Sub2,btnMed2Sub3,btnMed2Sub4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_med2);

        btnMed2Sub1=(Button)findViewById(R.id.buttonActivityMed2Sub1);
        btnMed2Sub2=(Button)findViewById(R.id.buttonActivityMed2Sub2);
        btnMed2Sub3=(Button)findViewById(R.id.buttonActivityMed2Sub3);
        btnMed2Sub4=(Button)findViewById(R.id.buttonActivityMed2Sub4);

//        btnMed2Sub1.setOnClickListener(new EnviaraOtraClase(ActivityMed2.this, ActivityMed2Sub1.class));
//        btnMed2Sub2.setOnClickListener(new EnviaraOtraClase(ActivityMed2.this, ActivityMed2Sub2.class));
//        btnMed2Sub3.setOnClickListener(new EnviaraOtraClase(ActivityMed2.this, ActivityMed2Sub3.class));
//        btnMed2Sub4.setOnClickListener(new EnviaraOtraClase(ActivityMed2.this, ActivityMed2Sub4.class));

        setResult(CODE_REQUEST);
        btnMed2Sub1.setOnClickListener(new EnviaraOtraClaseForResult(ActivityMed2.this, ActivityMed2Sub1.class,CODE_REQUEST));
        btnMed2Sub2.setOnClickListener(new EnviaraOtraClaseForResult(ActivityMed2.this, ActivityMed2Sub2.class,CODE_REQUEST));
        btnMed2Sub3.setOnClickListener(new EnviaraOtraClaseForResult(ActivityMed2.this, ActivityMed2Sub3.class,CODE_REQUEST));
        btnMed2Sub4.setOnClickListener(new EnviaraOtraClaseForResult(ActivityMed2.this, ActivityMed2Sub4.class,CODE_REQUEST));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode!=CODE_REQUEST){
            finish();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_med2, menu);
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
