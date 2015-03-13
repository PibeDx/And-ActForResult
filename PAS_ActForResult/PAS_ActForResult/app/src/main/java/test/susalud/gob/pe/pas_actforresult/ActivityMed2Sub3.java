package test.susalud.gob.pe.pas_actforresult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by jcuentas on 12/03/2015.
 */
public class ActivityMed2Sub3 extends Activity {
    private static final int CODE_REQUEST=123;
    Button btnMed2Sub3Sub1, btnMed2Sub3Sub2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_med2_sub3);
        btnMed2Sub3Sub1 = (Button) findViewById(R.id.buttonActivityMed2Sub3Sub1);
        btnMed2Sub3Sub2 = (Button) findViewById(R.id.buttonActivityMed2Sub3Sub2);
//        btnMed2Sub3Sub1.setOnClickListener(new EnviaraOtraClase(ActivityMed2Sub3.this, ActivityMed2Sub3Sub1.class));
//        btnMed2Sub3Sub2.setOnClickListener(new EnviaraOtraClase(ActivityMed2Sub3.this, ActivityMed2Sub3Sub2.class));


        btnMed2Sub3Sub1.setOnClickListener(new EnviaraOtraClaseForResult(ActivityMed2Sub3.this, ActivityMed2Sub3Sub1.class,CODE_REQUEST));
        btnMed2Sub3Sub2.setOnClickListener(new EnviaraOtraClaseForResult(ActivityMed2Sub3.this, ActivityMed2Sub3Sub2.class,CODE_REQUEST));
        setResult(CODE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode!=CODE_REQUEST){
            finish();
        }
    }
}
