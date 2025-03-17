@echo off
echo Compiling source files...
javac -d .\out\ .\src\p1\*.java
javac -d out -cp out src\p2\*.java

if %errorlevel% neq 0 (
    echo Compilation error! Please check your Java source files for errors.
    pause
    exit /b
)

echo Starting the program...

java -cp out p2.Demo
if %errorlevel% neq 0 (
    echo Runtime error! The program encountered an error during execution.
    pause
    exit /b
)
pause
