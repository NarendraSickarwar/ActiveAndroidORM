package android.anative.com.demoadvance.volley;

/**
 * Created by Narendra Singh on 3/11/17.
 */

public interface ApiListeners {
    void onSucess(String response, String tag, long startTimeStamp, long endTimeStamp);

    void onFailure(String error);
}
