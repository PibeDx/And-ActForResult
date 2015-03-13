package test.susalud.gob.pe.pas_actforresult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by jcuentas on 12/03/2015.
 */
public class ActivityMed2Sub3Sub1 extends Activity {
    private static final int CODE_REQUEST=1231;
    Button btnIrMed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_med2_sub3_sub1);
        btnIrMed1 = (Button) findViewById(R.id.buttonIrActivityMed1);
//        btnIrMed1.setOnClickListener(new EnviaraOtraClase(ActivityMed2Sub3Sub1.this, ActivityMed1.class));

        btnIrMed1.setOnClickListener(new EnviaraOtraClaseForResult(ActivityMed2Sub3Sub1.this, ActivityMed1.class,CODE_REQUEST));
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
