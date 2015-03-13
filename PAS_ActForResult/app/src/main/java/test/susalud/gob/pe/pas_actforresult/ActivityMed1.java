package test.susalud.gob.pe.pas_actforresult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class ActivityMed1 extends Activity {


    public static final int CODE_REQUEST=11;



    Button btnMed1Sub1, btnMed1Sub2,btnMed1Sub3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_med1);
        btnMed1Sub1=(Button)findViewById(R.id.buttonActivityMed1Sub1);
        btnMed1Sub2=(Button)findViewById(R.id.buttonActivityMed1Sub2);
        btnMed1Sub3=(Button)findViewById(R.id.buttonActivityMed1Sub3);

//        btnMed1Sub1.setOnClickListener(new EnviaraOtraClase(ActivityMed1.this, ActivityMed1Sub1.class));
//        btnMed1Sub2.setOnClickListener(new EnviaraOtraClase(ActivityMed1.this, ActivityMed1Sub2.class));
//        btnMed1Sub3.setOnClickListener(new EnviaraOtraClase(ActivityMed1.this, ActivityMed1Sub3.class));


        setResult(CODE_REQUEST);
        btnMed1Sub1.setOnClickListener(new EnviaraOtraClaseForResult(ActivityMed1.this, ActivityMed1Sub1.class,CODE_REQUEST));
        btnMed1Sub2.setOnClickListener(new EnviaraOtraClaseForResult(ActivityMed1.this, ActivityMed1Sub2.class,CODE_REQUEST));
        btnMed1Sub3.setOnClickListener(new EnviaraOtraClaseForResult(ActivityMed1.this, ActivityMed1Sub3.class,CODE_REQUEST));



    }


    @Override
    public void finish() {
        setResult(MainActivity.CODE_REQUEST);
        super.finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_med1, menu);
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(ActivityMed1.class.getName(), "code: " + resultCode);
//        if (resultCode!=CODE_REQUEST){
//            finish();
//        }
    }
}
