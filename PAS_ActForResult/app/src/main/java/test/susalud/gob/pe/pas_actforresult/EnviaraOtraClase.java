package test.susalud.gob.pe.pas_actforresult;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

/**
 * Created by jcuentas on 12/03/2015.
 */
public class EnviaraOtraClase implements View.OnClickListener {
    Activity activity;
    Class clase;

    public EnviaraOtraClase(Activity act, Class as) {
        activity = act;
        clase = as;
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(activity, clase);
        activity.startActivity(i);

    }
}
