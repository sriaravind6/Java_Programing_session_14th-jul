# Java_Programing_session_14th-jul
# Java installation on window and mac follow the below stepes:-
# Windows
1. Download and Install Java
   Go to the Oracle Java Downloads page.
   Click on "Download" for the Java version you want (typically Java
   17 or Java 21 LTS).
   Download the Windows installer (.exe file).
   Run the installer and follow the on-screen prompts.
2. Set JAVA_HOME Environment Variable
   Find where Java is installed (e.g., C:\\Program Files\\Java\\jdk-
   XX).
   Right-click ‘This PC’ → Properties → Advanced system settings →
# Environment Variables.
   Under System Variables, click New:
   Variable name: JAVA_HOME
   Variable value: path to your JDK folder
   Edit the Path variable and add: %JAVA_HOME%\\bin

3. Verify Java Installation
   Open Command Prompt and run:java -version
   Expected output: Displays installed Java version.

4. Download and Install Maven
   Go to the Maven Downloads page.
   Download the Binary zip archive.
   Extract the folder (e.g., to C:\\Program Files\\Apache\\maven).

5. Set MAVEN_HOME Environment Variable
   Go to Environment Variables.
   Under System Variables, click New:
   Variable name: MAVEN_HOME
   Variable value: path to your Maven folder
   Edit the Path variable and add: %MAVEN_HOME%\\bin

6. Verify Maven Installation
   Open Command Prompt and run:mvn -version
   Expected output: Displays installed Maven version.

# Mac
1. Install Java
   The simplest way is using Homebrew:
   Open Terminal and run:brew install openjdk@17
   Or download directly from Oracle Java Downloads and follow
# prompts.
2. Set JAVA_HOME
   After installation, add the following to your ~/.zshrc or
~/.bash_profile:
   export JAVA_HOME="$(/usr/libexec/java_home -v 17)" export
   PATH="$JAVA_HOME/bin:$PATH"
   Reload the profile:source ~/.zshrc
3. Verify Java Installation
   Run in Terminal:java -version
   Should display installed version.

4. Install Maven
   Using Homebrew:brew install maven
   Or download from Maven Download, unzip, and move to /usr/
   local/apache-maven.

5. Set MAVEN_HOME (if manual install)
   Add to your profile file:
   export MAVEN_HOME="/usr/local/apache-maven" export
   PATH="$MAVEN_HOME/bin:$PATH"
   Reload the profile:source ~/.zshrc

6. Verify Maven Installation
   Run:mvn -version
   Should display Maven version.
   
# if any doubt to install please follow this video to understand :- 
         https://www.youtube.com/watch?v=R6MoDMASwag  (java installation video )

# First Day Java Programme topic are :- Introduction to Programming
          # Class , Method , Variable / Object
          # Same Package , Different Packages
          # Importing Package
          # Oops Concept Object Oriented Programming Structure
          # (Encapsulation, Inheritance, Polymorphism , Abstraction)
