//Напишите программу, которая принимает на вход трёхзначное число и на выходе показывает вторую цифру этого числа.
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