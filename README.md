Quotes Extension for AlarmPad
=============================

This is a working example of an extension that works with the Android app AlarmPad available for free on the [Play Store](https://play.google.com/store/apps/details?id=com.mindmeapp.alarmpad). 

AlarmPad is an alarm clock that brings context to your alarms. Once you set one you can see right away the weather forecast and your calendar appointments following its time. AlarmPad listens to the calendar updates and offers widgets that put in one place your next alarm, calendar appointment and weather forecast. It also allows you to listen to your personal messages and speak voice commands to dismiss or snooze the alarm.

With extensions like this one, you can now add your own custom views to the alarms. Once it rings, the data provided by the extension will be shown in a summary on the alarm's front page linking to details in its own custom view. You can [download this app](https://play.google.com/store/apps/details?id=com.mindmeapp.extensions.quotes) for free to see it working in practice with AlarmPad.

## Getting started

Extensions like this one are very easy to create and work the same way [DashClock extensions](https://code.google.com/p/dashclock/wiki/API) do:

1. Download and add the [API jar](https://github.com/riclage/quotes_extension/blob/master/libs/alarmpad-api-r1.0.jar?raw=true) file to your Android project;
2. Create a new service that extends the [MindMeExtension](http://riclage.github.io/extensions-api/com/mindmeapp/extensions/MindMeExtension.html) class;
3. Add the corresponding <service> tag to your AndroidManifest.xml file and add the required <intent-filter> and <meta-data> elements.

Once you have both AlarmPad and your custom extension installed, you should be able to add your extension from AlarmPad's 'Manage Extensions' menu option.

## API source code
The full source code for the API and its reference documentation are available [here](https://github.com/riclage/mindme_extensions_api).

## Get AlarmPad test version
Extensions are currently only supported on AlarmPad's test version. You can get it by joining the Google+ community at [https://plus.google.com/communities/113108980221311144145](https://plus.google.com/communities/113108980221311144145). Once you join the community, you need to also [join the test](https://play.google.com/apps/testing/com.mindmeapp.alarmpad) to download this version from the Play Store. 

## Get help
Please contact me at any time if you need any help by sending an e-mail to alarmpad (at) mindmeapp (dot) com.

## Credits
This work would not have been possible without [Roman Nurik](https://plus.google.com/u/0/+RomanNurik/)'s open source [DashClock](https://code.google.com/p/dashclock/wiki/API) app. Thank you very much for making it available.
