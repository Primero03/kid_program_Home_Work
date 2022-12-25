//Напишите программу, которая принимает на вход трёхзначное число и на выходе показывает вторую цифру этого числа.
/*
Console.WriteLine("Введите трехзначное число");
bool isParsed = int.TryParse(Console.ReadLine(), out int num);

while (!isParsed || num < 100 || num > 1000)
{
    Console.WriteLine("Данное число не подходит под нужный диапозон");
    Console.WriteLine("Повторите попытку");
    num = int.Parse(Console.ReadLine());  
}

    Console.WriteLine(num);
    int numTwo = num / 10 % 10;

Console.WriteLine(numTwo);
*/

// Напишите программу, которая выводит третью цифру заданного числа или сообщает, что третьей цифры нет.
/*
Console.Write("Ваше число:");
bool isParsed = int.TryParse(Console.ReadLine(), out int num);

while (!isParsed || num < 0)
{
    num = num * -1;
}
while (num > 999)
{
    num = num / 10;
}
if(num < 100)
{
    Console.WriteLine($"Третьей цифры в {num} нет");
    Console.WriteLine("Попробуй еще раз");
    num = int.Parse(Console.ReadLine());
}
int numTri = num % 10;
Console.WriteLine(numTri);
*/

// Напишите программу, которая принимает на вход цифру, обозначающую день недели, и проверяет, является ли этот день выходным.

Console.Write("Число дня:");
bool isParsed = int.TryParse(Console.ReadLine(), out int day);

if (day > 7 || day < 1)
{
    Console.Write("Такого дня не изобрели;");
    Console.WriteLine("Еще разок давай");
    day = int.Parse(Console.ReadLine());
}
if (day > 0 & day < 6)
{
    Console.WriteLine("Итс будний день");
}
if (day > 5 & day < 8)
{
    Console.WriteLine("Итс выходной");
}