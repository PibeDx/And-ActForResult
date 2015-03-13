package test.susalud.gob.pe.pas_actforresult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by jcuentas on 12/03/2015.
 */
public class ActivityMed2Sub2 extends Activity {
    private static final int CODE_REQUEST=122;
    Button btnIrMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_med2_sub2);
        setResult(CODE_REQUEST);
        btnIrMain = (Button) findViewById(R.id.buttonIrMainActivity);
//        btnIrMain.setOnClickListener(new EnviaraOtraClase(ActivityMed2Sub2.this, MainActivity.class));
        btnIrMain.setOnClickListener(new EnviaraOtraClaseForResult(ActivityMed2Sub2.this, MainActivity.class,CODE_REQUEST));

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode!=CODE_REQUEST){
            finish();
        }
    }
}
