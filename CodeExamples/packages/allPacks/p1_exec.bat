@echo off
echo Компиляция исходных файлов...
javac -d .\out\ .\src\p1\*.java

if %errorlevel% neq 0 (
    echo Ошибка компиляции! Пожалуйста, проверьте ваши Java-исходные файлы на наличие ошибок.
    pause
    exit /b
)

echo Запуск программы...
java -cp out p1.Demo
if %errorlevel% neq 0 (
    echo Ошибка выполнения! Программа столкнулась с ошибкой во время выполнения.
    pause
    exit /b
)
pause
