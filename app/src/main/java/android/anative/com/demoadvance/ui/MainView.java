package android.anative.com.demoadvance.ui;

import java.util.HashMap;

/**
 * Created by Narendra Singh on 6/11/17.
 */

public interface MainView {
    void displayData(HashMap<String, ApiDataModel> hashMap);

    void showDialog();

    void hideDialog();

    void displayErrorMessage(String error);
}
