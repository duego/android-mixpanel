package com.mixpanel.android.mpmetrics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * GCMReceiver is a no-op class, maintained for historical reasons.
 *
 * @see MixpanelAPI.People#initPushHandling(String)
 * @see <a href="https://mixpanel.com/docs/people-analytics/android-push">Getting Started with Android Push Notifications</a>
 */
@Deprecated
public class GCMReceiver extends BroadcastReceiver {
   @Override
   public void onReceive(Context context, Intent intent) {}
}
