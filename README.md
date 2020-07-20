# Android-QRCodeScanner
Android QR Code scanner app using Google Mobile Vision.

## Description
This is an android QR code scanner which makes use of Google's Mobile Vision API to enable reading QR Code.
You can scan email and url with this scanner.
You can directly send email by scanning the email id from QR code scanner.
You can also directly visit the link by scanning the QR code of the url.

## Usage Docs
1. *Use Surface View in your layout* <br/>
      ` <SurfaceView ` <br/>
       ` android:id="@+id/surfaceView" ` <br/>
        `android:layout_width="match_parent" ` <br/>
        `android:layout_height="match_parent"/> ` <br/>
        
 2. *Add this dependency in your build.gradle file.* <br/>
      &nbsp;  ` implementation 'com.google.android.gms:play-services-vision:11.8.0' `
