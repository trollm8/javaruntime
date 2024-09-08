# javaruntime
Hello! javaruntime is a project that lets you go web to java easily, here is how to use it!
# Packages
JavaFX
Java
# How to setup!
1. Fork this repository
2. Edit runtime.java
3. In runtime.java, edit the "webView.getEngine().load("https://trollm8.xyz/index.html");" part where it says my website with yours.
4. Edit "stage.setTitle("runtime");" in the runtime part, change it to whatever you are using the runtime for.
5. download the fork
# Compiling
To compile, you need to open your terminal in the same directory as runtime.java is in
first run "javac --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.web runtime.java", make sure to replace module path with javafx path on all of these lines.
then run "java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.web runtime"
# Packaging into a .jar file
run "jar --create --file runtime.jar --main-class runtime -C . ."
it should create the file!
to run the .jar do "java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.web -jar EaglercraftLauncher.jar"
# You are done!

