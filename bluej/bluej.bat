@echo off
set APPBASE="F:\Desktop\Projects\bluej"
set CP=%APPBASE%\lib\bluej.jar;"C:\Program Files\BlueJ\jdk"\lib\tools.jar
"C:\Program Files\BlueJ\jdk\bin\java" -cp %CP% bluej.Boot  %1 %2 %3 %4 %5 %6 %7 %8 %9
