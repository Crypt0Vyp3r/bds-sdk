package com.appcoins.sdk.billing.analytics.core;

public interface AnalyticsLogger {
  void logDebug(String tag, String msg);

  void logWarningDebug(String TAG, String msg);
}
