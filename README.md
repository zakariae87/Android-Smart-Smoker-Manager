# Android-Smart-Smoker-Manager

<img src="Alarme.png" />

A simple Android bluetooth example to turn on/off the radio and to view and connect with other devices. It has associated embedded firmware code to connect to an stm32f4 µC to improve bi-directional data stream.


<p align="center">
<img src="logo.png" width="35%" height="35%" />
</p>

## Introduction

This is a simple demo app that creates buttons to toggle ON/OFF the bluetooth radio, view connected devices, and to discover new bluetooth enabled devices. A checkbox and status strings provide functionality to communicate with an embedded microcontroller such as an Arduino. You don't necessarily need to connect an Arduino to still have a functioning phone application. The connected device MUST abide by the Serial Port Profile (SPP). Other complex profiles are not supported with this example and will fail to connect. 

## Required Tools

1. [Android Studio IDE and SDK](http://developer.android.com/sdk/index.html)
2. [HM-10 bluetooth module](https://people.ece.cornell.edu/land/courses/ece4760/PIC32/uart/HM10/DSD%20TECH%20HM-10%20datasheet.pdf)
3. stm32f4xx Discovery Board at least (Im using another ful devlopement board from Waveshare so expansive, I suggest for users Discovery Borad  
4. A few breadboard wires to connect the HM-10 to the Arduino

## Setup

1. Clone this repo and open it inside of Android Studio. Note, a later SDK will work just fine (SDK 23+)
2. Build the app
3. Install the app to your connected Android phone. You will need to install special drivers and enable USB debugging on your phone for this to work. There are plenty of tutorials on the web for this.
5. Run the application on your phone after it installs.

## Issues

Please submit all issues to the github tracker. Pull requests are also encouraged. General comments can be left either inside github or at [mcuhq.com](http://mcuhq.com/27/simple-android-bluetooth-application-with-arduino-example).


