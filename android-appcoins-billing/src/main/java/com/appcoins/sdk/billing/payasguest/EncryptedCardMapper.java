package com.appcoins.sdk.billing.payasguest;

import com.sdk.appcoins_adyen.api.CardPaymentMethod;
import com.sdk.appcoins_adyen.api.PaymentMethodDetails;
import com.sdk.appcoins_adyen.card.EncryptedCard;
import com.sdk.appcoins_adyen.exceptions.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;

public class EncryptedCardMapper {

  private static final String ENCRYPTED_CARD_NUMBER = "encryptedCardNumber";
  private static final String ENCRYPTED_EXPIRY_MONTH = "encryptedExpiryMonth";
  private static final String ENCRYPTED_EXPIRY_YEAR = "encryptedExpiryYear";
  private static final String ENCRYPTED_SECURITY_CODE = "encryptedSecurityCode";
  private static final String HOLDER_NAME = "holderName";
  private static final String STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";

  EncryptedCardMapper() {

  }

  public String map(EncryptedCard encryptedCard) {
    final JSONObject jsonObject = new JSONObject();
    try {
      // getting parameters from parent class
      jsonObject.putOpt(PaymentMethodDetails.TYPE, "scheme");

      jsonObject.putOpt(ENCRYPTED_CARD_NUMBER, encryptedCard.getEncryptedNumber());
      jsonObject.putOpt(ENCRYPTED_EXPIRY_MONTH, encryptedCard.getEncryptedExpiryMonth());
      jsonObject.putOpt(ENCRYPTED_EXPIRY_YEAR, encryptedCard.getEncryptedExpiryYear());
      jsonObject.putOpt(ENCRYPTED_SECURITY_CODE, encryptedCard.getEncryptedSecurityCode());
    } catch (JSONException e) {
      throw new ModelSerializationException(CardPaymentMethod.class, e);
    }
    return jsonObject.toString();
  }
}
