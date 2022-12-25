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