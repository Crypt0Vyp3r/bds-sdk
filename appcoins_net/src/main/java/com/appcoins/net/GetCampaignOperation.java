package com.appcoins.net;

import java.util.HashMap;

public class GetCampaignOperation extends Operation {

  public static final String PACKAGE_NAME = "packageName";
  public static final String VER_CODE = "vercode";
  public static final String COUNTRY_CODE = "countryCode";
  public static final String SORT = "sort";
  public static final String BY = "by";
  public static final String VALID = "valid";
  public static final String TYPE = "type";

  @Override public String mapParams(String packageName,String versionCode,QueryParams queryParams) {
    return "/campaign/listall?"
        + PACKAGE_NAME
        + "="
        + packageName
        + "&"
        + VER_CODE
        + "="
        + versionCode
        + "&"
        + SORT
        + "="
        + queryParams.getSort()
        + "&"
        + BY
        + "="
        + queryParams.getBy()
        + "&"
        + VALID
        + "="
        + queryParams.getValid()
        + "&"
        + TYPE
        + "="
        + queryParams.getType();
  }

  @Override public AppcoinsClientResponse mapResponse(String response) {
    AppcoinsClientResponse appcoinsClientResponse = new AppcoinsClientResponse((String)response);
    return appcoinsClientResponse;
  }
}
