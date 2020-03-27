package com.sdk.appcoins_adyen.encryption;

import com.sdk.appcoins_adyen.card.Card;
import com.sdk.appcoins_adyen.card.EncryptedCard;
import com.sdk.appcoins_adyen.exceptions.EncryptionException;
import java.util.concurrent.Callable;

public interface CardEncryptor {

  /**
   * Encrypt the individual fields of a {@link Card} to an {@link EncryptedCard}.
   *
   * @param card The {@link Card} to be encrypted.
   * @param publicKey The public key to encrypt with.
   *
   * @return A {@link Callable} object returning an {@link EncryptedCard}.
   */
  EncryptedCard encryptFields(String number, Integer month, Integer year, String code,
      String publicKey) throws EncryptionException;

  String encryptStoredPaymentFields(String cvv, String storedPaymentId, String scheme,
      String adyenPublicKey);
}
