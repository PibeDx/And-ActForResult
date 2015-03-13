package test.susalud.gob.pe.pas_actforresult;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by jcuentas on 12/03/2015.
 */
public class ActivityMed1Sub2 extends Activity {
    private static final int CODE_REQUEST=112;
    Button btnIrMed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_med1_sub2);
        btnIrMed2=(Button)findViewById(R.id.buttonIrActivityMed2);
//        btnIrMed2.setOnClickListener(new EnviaraOtraClase(ActivityMed1Sub2.this, ActivityMed2.class));
        btnIrMed2.setOnClickListener(new EnviaraOtraClaseForResult(ActivityMed1Sub2.this, ActivityMed2.class,CODE_REQUEST));
//        setResult(CODE_REQUEST);
    }

    @Override
    public void finish() {
        setResult(ActivityMed1.CODE_REQUEST);
        super.finish();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode!=CODE_REQUEST){
            finish();
        }
    }
}
