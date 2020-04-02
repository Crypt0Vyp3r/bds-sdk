package com.appcoins.sdk.billing.analytics;

import com.appcoins.sdk.billing.analytics.core.KnockEventLogger;

class EmptyKnockLogger implements KnockEventLogger {
  @Override public void log(String url) {

  }
}
