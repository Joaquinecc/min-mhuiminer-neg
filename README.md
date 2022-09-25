# minHUIminerNeg
This repository contains the source code of the algorithm Minimal mHUIMiner negative.

## Requirement
It requires prior experience with Java for compiling the source code and running the examples.

## Deployment 
### Compiling the source code with Eclipse

1. Open Eclipse. Do "File / New / Java Project /"
2. Type the name of the project and then click on "Finish"
3. Then, right-click on the "src" folder of the Java project that you have created. Choose "Properties". Copy the name of the directory that is shown in the properties. It should be something like that: "C:\eclipse\Workspace\test2\src"
4. Go to that directory. Download the the repository. Make sure the folder "ca" should appear directly in the folder "src"
5. Go back into Eclipse.
6. Right-click on! the Java project and select "Refresh".
7. Done

Once you have installed the project you are ready for running the

1. In Eclipse, you should go to "ca.pfv.spmf.test" folder, in your Java project. You will see a java class `MainTestMHUIMiner.java`
2. Right-click on the file, select `Run as -> Java application"`
3. Done

## Configurations
To try different minimum utility threshold or databases, you can edit the `MainTestMHUIMiner.java`.

To modify the database, just modify DB_Utility.txt file:
>String input = fileToPath("DB_Utility.txt");

In the test folder you will find may example dataset
To modify the min-util, just modify the followed line

> int min_utility = [minimum utility threshold];


This value must be a positive integer.



