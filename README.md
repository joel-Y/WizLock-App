WizLock-Tech-Admin (Native Android - Technician + Admin)

Steps:
1. Ensure you copied files to a project root preserving paths.
2. Add TTLockSDK.aar (from https://github.com/ttlock/Android_SDK_Demo) into app/libs/.
3. Open project in Android Studio (File -> Open).
4. If gradlew missing, run: gradle wrapper --gradle-version 8.5
5. Build: ./gradlew assembleDebug
6. Run on a physical device for BLE features.

Replace placeholder constants:
- app/src/main/java/.../ttlock/TTLockConfig.kt
- app/src/main/java/.../network/ApiClient.kt
