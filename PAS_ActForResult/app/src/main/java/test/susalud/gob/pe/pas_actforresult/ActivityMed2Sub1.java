package test.susalud.gob.pe.pas_actforresult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by jcuentas on 12/03/2015.
 */
public class ActivityMed2Sub1 extends Activity {
    private static final int CODE_REQUEST=121;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_med2_sub1);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode!=CODE_REQUEST){
            finish();
        }
    }
}
