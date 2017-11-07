package android.anative.com.demoadvance;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by Narendra Singh on 6/11/17.
 */

public class ApiProgressDialog {
    /***
     * progress dialog showing
     */
    private ProgressDialog progressDialog;

    public ApiProgressDialog(Context context) {
        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("Wait...");
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setCancelable(false);
    }

    public void showDialog() {
        progressDialog.show();
    }

    public void hideDialog() {
        progressDialog.dismiss();
    }
}
