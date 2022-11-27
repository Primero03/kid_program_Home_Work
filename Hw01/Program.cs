// Домашка01_01-Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее, а какое меньшее.
//Console.WriteLine("Введите первое число:");
//int number1 = int.Parse(Console.ReadLine());
//Console.WriteLine("Введите второе число:");
//int number2 = int.Parse(Console.ReadLine());

//int max = number1;
//if (number2 > max) max = number2;
//Console.Write("Максимальное число:");
//Console.WriteLine(max);

//int min = number1;
//if (number2 < min) min = number2;
//Console.Write("Минимальное число:");
//Console.WriteLine(min);

//Домашка01.02- Напишите программу, которая принимает на вход три числа и выдаёт максимальное из этих чисел.

//Console.WriteLine("Введите первое число:");
//int number1 = int.Parse(Console.ReadLine());
//Console.WriteLine("Введите второе число:");
//int number2 = int.Parse(Console.ReadLine());
//Console.WriteLine("Введите третье число:");
//int number3 = int.Parse(Console.ReadLine());


//int max = number1;
//if (number2 > max) max = number2;
//if (number3 > max) max = number3;
//Console.Write("Максимальное число:");
//Console.WriteLine(max);

//Домашка01.03-Напишите программу, которая на вход принимает число и выдаёт, является ли число чётным

//Console.WriteLine("Ваше число");
//int a = int.Parse(Console.ReadLine());

//if (a % 2 ==0)
//{
//    Console.WriteLine("Число четное");

//}
//else
//Console.WriteLine("Число не является четным");

//Домашка01.04-Напишите программу, которая на вход принимает число (N), а на выходе показывает все чётные числа от 1 до N.

Console.WriteLine("Ваше число");
int p = int.Parse(Console.ReadLine());
int Nmin = 1;

 while (p >= Nmin)
 {
     if (p % 2 < 1)
     {
         Console.Write($"{p}, ");
     }
     p = p - 1;
 }