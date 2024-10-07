# Basic Statistics

Basic Statistics is a Java-based implementation for computing descriptive statistics on a set of numbers. This implementation is intended for use in software engineering courses as a subject software system.

Basic Statistics uses the Apache Ant build system. Make sure that you have Ant installed.

## How to Build and Run Basic Statistics

### Building the Project

1. Change into the Basic Statistics root directory, which contains the `build.xml` build file.
2. Ensure that you have Ant installed.
3. Run `ant` to compile Basic Statistics. The compiled Java class files will be located in the `/bin` directory.

### Running Basic Statistics

1. After building the project (i.e., running `ant`), change into the `/bin` directory.
2. Run: `java -cp . BasicStats`. The application's GUI should appear.
3. In the root directory, you can run `ant test` to execute all unit tests.
4. Whenever you want to clean the project (i.e., delete all generated files), type `ant clean`.

## Program Features

- Displays a set of entered numbers.
- Computes the mean of the set of numbers.
- Computes the median of the set of numbers.
- Computes the mode of the set of numbers.

## Troubleshooting

### Outdated Version of JUnit

If your system uses an outdated version of JUnit, you may encounter the following error:

[junit] junit/framework/JUnit4TestAdapterCache [junit] java.lang.NoClassDefFoundError: junit/framework/JUnit4TestAdapterCache

Run `ant -lib lib/ <target>` to explicitly use JUnit4, which is provided in the `lib` directory. For example, run `ant -lib lib/ test` to run all Basic Statistics unit tests.

### Java JDK Not Installed or Misconfigured

If a Java JDK is not installed or properly configured on your system, you may encounter the following error:

BUILD FAILED build.xml:17 Unable to find a javac compiler; Make sure that you have a JDK installed and that the JAVA_HOME environment variable is properly set.
