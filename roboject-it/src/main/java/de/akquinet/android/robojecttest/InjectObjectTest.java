/*

This file is part of Roboject

Copyright (c) 2010-2011 akquinet A.G.

Contact:  http://www.akquinet.de/en

GNU General Public License Usage
This file may be used under the terms of the GNU General Public License version 3.0 as published by the Free Software Foundation and appearing in the file LICENSE included in the packaging of this file.  Please review the following information to ensure the GNU General Public License version 3.0 requirements will be met: http://www.gnu.org/copyleft/gpl.html.

If you are unsure which license is appropriate for your use, please contact the sales department at http://www.akquinet.de/en.

*/
package de.akquinet.android.robojecttest;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import de.akquinet.android.marvin.ActivityTestCase;
import de.akquinet.android.robojecttest.activities.InjectLayoutTestActivity;
import de.akquinet.android.robojecttest.activities.InjectObjectTestActivityA;
import de.akquinet.android.robojecttest.activities.InjectObjectTestActivityB;
import org.hamcrest.CoreMatchers;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.IsInstanceOf.instanceOf;


public class InjectObjectTest extends ActivityTestCase<InjectObjectTestActivityA> {
    public InjectObjectTest() {
        super(InjectObjectTestActivityA.class);
    }

    public void testInjectObjectLayoutWithFieldName() {
        Activity activity = getMostRecentlyStartedActivity();
        assertThat(activity, instanceOf(InjectObjectTestActivityB.class));
        assertThat(((InjectObjectTestActivityB) activity).getMySet(), is(not(nullValue())));
    }

    public void testInjectObjectLayoutWithValue() {
        Activity activity = getMostRecentlyStartedActivity();
        assertThat(activity, instanceOf(InjectObjectTestActivityB.class));
        assertThat(((InjectObjectTestActivityB) activity).getMySet(), is(not(nullValue())));
    }
}