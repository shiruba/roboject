package de.akquinet.android.roboject;

import android.app.Activity;
import android.os.Bundle;


public class RobojectActivity extends Activity implements RobojectLifecycle
{
    private Container container;

    /**
     * Contract for subclasses: You need to call super before relying on
     * injections in {@link #onCreate(Bundle)}.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            this.container = new Container(this, this, getClass());
        }
        catch (RobojectException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        this.container.invokeResumePhase();
    }

    @Override
    public void onServicesConnected() {
    }

    @Override
    public void onReady() {
    }
}
