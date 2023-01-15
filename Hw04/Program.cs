// Напишите цикл, который принимает на вход два числа (A и B) и возводит число A в натуральную степень B
//Домашка04.01
/*
int P3 ()
{
    Console.WriteLine("Ваше число");
    bool isParsed = int.TryParse(Console.ReadLine(), out int num);
    if (isParsed)
    {
        return num;
    }
    else
    {
        Console.WriteLine("Введенные символы,не являются верными в данном контексте");
        return num = int.Parse(Console.ReadLine());
    }
}

int a = P3();
int b = P3(); 
int res =1;
for(int i=1;i<=b;i++)
{
  res *=a;
}

Console.WriteLine(res);

*/
//Напишите программу, которая принимает на вход число и выдаёт сумму цифр в числе.
//Домашка04.02
/*
int P3()
{
    Console.WriteLine("Ваше число");
    bool isParsed = int.TryParse(Console.ReadLine(), out int num);
    if (isParsed)
    {
        return num;
    }
    else
    {
        Console.WriteLine("Введенные символы,не являются верными в данном контексте");
        return num = int.Parse(Console.ReadLine());
    }
}

int a = P3();
Console.WriteLine(SumOfSomeNumber(a));
int SumOfSomeNumber(int temp)
 {
     int a = 0;
     while(temp > 0)
     {
         a = a + temp % 10;
         temp = temp / 10;
     }
     return a;
}

*/
//Напишите программу, которая задаёт массив из 8 элементов и выводит их на экран.
//Домашка04.03


Console.WriteLine("Какой длины будет массив?");
 int arrLentgth = int.Parse(Console.ReadLine());
 int[] Array = new int[arrLentgth];
 int index = 0;
 while (index < arrLentgth)
 {
     Console.Write($"Введите {index + 1} число: ");
     Array[index] = int.Parse(Console.ReadLine());
     index++;
 }
Console.WriteLine('[' + string.Join(", ", Array) + ']');