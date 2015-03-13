package test.susalud.gob.pe.pas_actforresult;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

/**
 * Created by jcuentas on 12/03/2015.
 */
public class EnviaraOtraClaseForResult implements View.OnClickListener {
    Activity activity;
    Class clase;
    int resultCode;

    public EnviaraOtraClaseForResult(Activity act, Class as, int code) {
        activity = act;
        clase = as;
        resultCode=code;
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(activity, clase);
        activity.startActivityForResult(i,resultCode);

    }
}
