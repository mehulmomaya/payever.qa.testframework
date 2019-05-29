$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "payever.com",
  "description": "",
  "id": "payever.com",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginFeatureTest"
    }
  ]
});
formatter.before({
  "duration": 3208724935,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Log In Log Out flow with a valid account",
  "description": "",
  "id": "payever.com;log-in-log-out-flow-with-a-valid-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@loginSuccessfull"
    },
    {
      "line": 5,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "As a user i navigate to https://commerceos.payever.org/entry/login Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "On SignIn Page I enter email as jondoe@mail.com and password as JonDoe12* and login",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User Profile is displayed for selection",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on User Profile Icon",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User Profile page is opened",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click on Logout",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://commerceos.payever.org/entry/login",
      "offset": 24
    }
  ],
  "location": "LoginPageSteps.asAUserINavigateToCouponsComHomePage(String)"
});
formatter.result({
  "duration": 9530052385,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jondoe@mail.com",
      "offset": 32
    },
    {
      "val": "JonDoe12*",
      "offset": 64
    }
  ],
  "location": "LoginPageSteps.onSignInPageIEnterEmailAsGojektestGmailComAndPasswordAsQwAndLogin(String,String)"
});
formatter.result({
  "duration": 10578188957,
  "status": "passed"
});
formatter.match({
  "location": "ProfilePageSteps.userProfileIsDisplayedForSelection()"
});
formatter.result({
  "duration": 44630903,
  "status": "passed"
});
formatter.match({
  "location": "ProfilePageSteps.clickOnUserProfileIcon()"
});
formatter.result({
  "duration": 196987576,
  "status": "passed"
});
formatter.match({
  "location": "PersonalProfilePageSteps.userProfilePageIsOpened()"
});
formatter.result({
  "duration": 6158546375,
  "status": "passed"
});
formatter.match({
  "location": "ProfilePageSteps.clickOnLogout()"
});
formatter.result({
  "duration": 358537911,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003cdiv _ngcontent-c5\u003d\"\" class\u003d\"business-menu-item\" translate\u003d\"\" pe-i18n-key\u003d\"dashboard.profile_menu.log_out\"\u003e...\u003c/div\u003e is not clickable at point (1060, 140). Other element would receive the click: \u003cdiv id\u003d\"cdk-overlay-0\" class\u003d\"cdk-overlay-pane\" style\u003d\"pointer-events: auto; position: static;\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d74.0.3729.169)\n  (Driver info: chromedriver\u003d2.35.528157 (4429ca2590d6988c0745c24c8858745aaaec01ef),platform\u003dMac OS X 10.14.0 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 53 milliseconds\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027mmomaya-ltm\u0027, ip: \u00272401:4900:16f0:800b:d844:667b:d371:321\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14\u0027, java.version: \u00271.8.0_151\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.35.528157 (4429ca2590d6988c0745c24c8858745aaaec01ef), userDataDir\u003d/var/folders/0v/hh_wn78s1zjb9jgsy6csw3nc3f21bk/T/.org.chromium.Chromium.hsXBR6}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d74.0.3729.169, platform\u003dMAC, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: ba1bf58ea2c85b51539ebb75472b69e0\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:327)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:85)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy20.click(Unknown Source)\n\tat pages.ProfilePage.clickOnLogoutButton(ProfilePage.java:54)\n\tat steps.ProfilePageSteps.clickOnLogout(ProfilePageSteps.java:22)\n\tat ✽.And Click on Logout(Login.feature:12)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 4716752186,
  "status": "passed"
});
});