/*

This file is part of Roboject

Copyright (c) 2010-2011 akquinet A.G.

Contact:  http://www.akquinet.de/en

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package de.akquinet.android.robojecttest.activities;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import de.akquinet.android.roboject.RobojectActivity;
import de.akquinet.android.roboject.annotations.InjectService;
import de.akquinet.android.robojecttest.services.IRemoteService;
import de.akquinet.android.robojecttest.services.RemoteTestService;


public class InjectRemoteServiceTestActivity extends RobojectActivity {
    @InjectService(clazz = RemoteTestService.class)
    public IRemoteService adderService;

    @Override
    public void onServiceConnected(ComponentName name, IBinder serviceObject) {
        super.onServiceConnected(name, serviceObject);
        try {
            Log.v("InjectRemoteServiceTestActivity", String.valueOf(adderService.add(22, 20)));
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
