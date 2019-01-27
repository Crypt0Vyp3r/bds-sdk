package com.appcoins.sdk.billing;

import java.util.List;

public interface Billing {

    PurchasesResult queryPurchases(String skuType);

    void querySkuDetailsAsync(SkuDetailsParam skuDetailsParam , ResponseListener onSkuDetailsResponseListener);

    void launchPurchaseFlow(Object act,String sku, String itemType, List<String> oldSkus, int requestCode, ResponseListener listener, String extraData);
}
