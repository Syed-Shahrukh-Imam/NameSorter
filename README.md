# NameSorter
This is a name sorter application. This application takes a text containing names as a ***command-line argument***, orders the names by last name followed by first name. 


### Before you run
- Please add the names text file under **src/main/resources/**. 
- Gradle can be installed from https://gradle.org/install/

### Instructions to run
- Clone the repository using `git clone`
- Head to the directory in your local machine and run `gradle build`. This builds the application and the fetches the dependencies. 
- Use command `gradle build run --args="<< names text file >>"` to run the application. Please make sure the text file is present in the  **src/main/resources/**.
- Use command `gradle test` to run all the tests.

#### Recommeneded to be run using Intellij IDEA. However, it works fine when using using terminal.


