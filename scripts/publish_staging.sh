#!/bin/bash
cd ..
# Add '.dev' on the version name. Non dev builds are done though jenkins build only
export BUILD_NAME_SUFFIX=".staging"
export BUILD_TYPE_NAME="release"

./gradlew :appcoins:clean :android-appcoins-billing:clean :appcoins-billing:clean :appcoins-ads:clean :appcoins-adyen:clean :communication:clean
./gradlew :appcoins:assemble :android-appcoins-billing:assemble :appcoins-billing:assemble :appcoins-ads:assemble :appcoins-adyen:assemble :communication:assemble
./gradlew publish bintrayUpload