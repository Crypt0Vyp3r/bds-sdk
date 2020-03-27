package com.sdk.appcoins_adyen.encryption;

public final class Encryptor {

  public static final CardEncryptor INSTANCE;

  static {
    INSTANCE = new CardEncryptorImpl();
  }

  private Encryptor() {
    throw new IllegalStateException("No instances.");
  }
}
