package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.Log;

import io.flutter.embedding.engine.FlutterEngine;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  private static final String TAG = "GeneratedPluginRegistrant";
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin cloud_firestore, io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new flutter.plugins.contactsservice.contactsservice.ContactsServicePlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin contacts_service, flutter.plugins.contactsservice.contactsservice.ContactsServicePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.example.easy_sms_receiver.EasySmsReceiverPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin easy_sms_receiver, com.example.easy_sms_receiver.EasySmsReceiverPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin firebase_auth, io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.firebase.database.FirebaseDatabasePlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin firebase_database, io.flutter.plugins.firebase.database.FirebaseDatabasePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new id.flutter.flutter_background_service.FlutterBackgroundServicePlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin flutter_background_service_android, id.flutter.flutter_background_service.FlutterBackgroundServicePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new co.quis.flutter_contacts.FlutterContactsPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin flutter_contacts, co.quis.flutter_contacts.FlutterContactsPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.bottlepay.flutter_libphonenumber.FlutterLibphonenumberPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin flutter_libphonenumber_android, com.bottlepay.flutter_libphonenumber.FlutterLibphonenumberPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin flutter_local_notifications, com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.juliusgithaiga.flutter_sms_inbox.FlutterSmsInboxPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin flutter_sms_inbox, com.juliusgithaiga.flutter_sms_inbox.FlutterSmsInboxPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new net.wolverinebeach.flutter_timezone.FlutterTimezonePlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin flutter_timezone, net.wolverinebeach.flutter_timezone.FlutterTimezonePlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.github.ponnamkarthik.toast.fluttertoast.FlutterToastPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin fluttertoast, io.github.ponnamkarthik.toast.fluttertoast.FlutterToastPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.googlesignin.GoogleSignInPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin google_sign_in_android, io.flutter.plugins.googlesignin.GoogleSignInPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.pathprovider.PathProviderPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.baseflow.permissionhandler.PermissionHandlerPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new fman.ge.smart_auth.SmartAuthPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin smart_auth, fman.ge.smart_auth.SmartAuthPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new org.microprogramers.sms_plugin_mp.SmsAdvancedPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin sms_plugin_mp, org.microprogramers.sms_plugin_mp.SmsAdvancedPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.oval.sms_receiver.SmsReceiverPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin sms_receiver, com.oval.sms_receiver.SmsReceiverPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.shounakmulay.telephony.TelephonyPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin telephony, com.shounakmulay.telephony.TelephonyPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.urllauncher.UrlLauncherPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e);
    }
  }
}
