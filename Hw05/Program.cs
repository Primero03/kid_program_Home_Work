// Домашка05.01
// Задайте массив заполненный случайными положительными трёхзначными числами. Напишите программу, которая покажет количество чётных чисел в массиве

// Random xz = new Random();
// Console.WriteLine("Какой длины будет массив?");
// int arrLentgth = Convert.ToInt32(Console.ReadLine());
// int[] Array = new int[arrLentgth];
// int i = 0;
// while (i < arrLentgth)
// {
//     Array[i] = xz.Next(100, 1000);
// }
// int positive = 0;
// for (i = 0; i < Array.Length; i++)
// {
//     if (Array[i] / 2)
//     {
//         positive += 1;
//     }

// }
// Console.WriteLine(positive);
// Console.WriteLine('[' + string.Join("• ", Array) + ']');


//Домашка05.02
//Задайте одномерный массив, заполненный случайными числами. Найдите сумму элементов, стоящих на нечётных позициях.

// Random xz = new Random();
// Console.WriteLine("Какой длины будет массив?");
// int arrLentgth = Convert.ToInt32(Console.ReadLine());
// int[] Array = new int[arrLentgth];
// int i = 0;
// while (i < arrLentgth)
// {
//     Array[i] = xz.Next(1, 100);
// }
// int sum=0;
// for (i = 0; i < Array.Length; i++)
// {
//     if (Array[i] )
//     {
//         sum += 1;
//     }

// }
// Console.WriteLine(sum);
// Console.WriteLine('[' + string.Join("• ", Array) + ']');



//Домашка05.03
//Задайте массив вещественных чисел. Найдите разницу между максимальным и минимальным элементов массива.
Console.WriteLine("Какой длины будет массив?");
int arrLentgth = int.Parse(Console.ReadLine());
double[] Array = new double[arrLentgth];
int index = 0;
while (index < arrLentgth)
{
    Console.Write($"Введите {index + 1} число: ");
    Array[index] = double.Parse(Console.ReadLine());
    index++;
}
double max = 0;
double min = 999;
for (index = 0; index < arrLentgth; index++)
{
    if (Array[index] > max)
    {
        max = Array[index];
    }
    else if (Array[index] < min)
    {
        min = Array[index];
    }
}
double difference = 0;
difference = max - min;
Console.WriteLine($"Максимально значение {max},минимальное значени {min}");
System.Console.WriteLine($"Раздница между максимальным значение({max}) и минимальным ({min}) равняется {difference}");
Console.WriteLine('[' + string.Join("• ", Array) + ']');