//Домашка 06.01
//Пользователь вводит с клавиатуры M чисел. Посчитайте, сколько чисел больше 0 ввёл пользователь.

double P3()
{
    Console.WriteLine("Ваше число");
    bool isParsed = double.TryParse(Console.ReadLine(), out double num);
    if (isParsed)
    {
        return num;
    }
    else
    {
        Console.WriteLine("Введенные символы,не являются верными в данном контексте");
        return num = double.Parse(Console.ReadLine());
    }
}


// Console.WriteLine("Какой длины будет массив?");
// int arrLentgth = int.Parse(Console.ReadLine());
// int[] Array = new int[arrLentgth];
// int i = 0;
// while (i < arrLentgth)
// {
//     Console.Write($"Введите {i + 1} число: ");
//     Array[i] = int.Parse(Console.ReadLine());
//     i++;
// }
// int count = 0;
// for(i = 0; i < Array.Length; i++)
// {
//     if(Array[i]>0)
//     {
//         count+=1;
//     }
// }
// System.Console.WriteLine(count);
// System.Console.WriteLine('[' + string.Join("• ", Array) + ']');

//Домашка06.02
// Напишите программу, которая найдёт точку пересечения двух прямых, заданных уравнениями y = k1 * x + b1, y = k2 * x + b2; 
//значения b1, k1, b2 и k2 задаются пользователем.


double k1 =P3();
double b1 =P3();
double k2 =P3();
double b2 =P3();

double x = -(b1 - b2) / (k1 - k2);
double y = k1 * x + b1;
 
x = Math.Round(x, 3);
y = Math.Round(y, 3);
 
Console.WriteLine($"Пересечение в точке: ({x};{y})");


