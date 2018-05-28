# ANDROID_LayoutInflater

LayoutInflater
----------- 
Instantiates a layout XML file into its corresponding View objects. 
It is never used directly. 
Instead, use getLayoutInflater() or getSystemService(Class) to retrieve a standard LayoutInflater instance 
that is already hooked up to the current context and correctly configured for the device you are running on.
To create a new LayoutInflater with an additional LayoutInflater.
Factory for your own views, you can use cloneInContext(Context) to clone an existing ViewFactory, 
and then call setFactory(LayoutInflater.Factory) on it to include your Factory.

ScreenShots
-----------
<div>
<img width="200" src="https://user-images.githubusercontent.com/32612534/40608656-68dcc80c-626c-11e8-8dce-1cb5aa3498d1.png">
</div>
