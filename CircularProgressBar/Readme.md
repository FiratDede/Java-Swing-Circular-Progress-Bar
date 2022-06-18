## Java Swing Circular Progress Bar
This java project allows users to add a circular progress bar to their own projects. For adding a circular progress bar to your project, simply use CircularProgressBar.java file. Main.java file is for showing how to use CircularProgress Bar.java.
#### How to Use Circular Progress Bar
For creating a circular progress bar we simply benefit from this constructor:</br>
<code> CircularProgressBar(int delayms) </code> </br>
For example, in the example below, we created a circular progress bar which updated every 1000 miliseconds (1 second)
<code> CircularProgressBar c1=new CircularProgressBar(1000); </code> </br>
After creating circular progress bar, we have to call startAnimation method like the example below for starting animation:
<code> c1.startAnimation(); </code> </br>
Also we can change the properties such as color of circular progress bar , percentage change of circular bar ..etc by using defined methods. For more information, please look at Main.java file. </br>
#### Output of Main.java
https://user-images.githubusercontent.com/53142518/174457945-5f306919-799b-4c08-a721-368efbc9bb3a.mp4

