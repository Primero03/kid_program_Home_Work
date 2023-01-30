//Домашка07.01
// Задайте двумерный массив размером m×n, заполненный случайными вещественными числами.
// Console.Write("Число m:");
// int m = int.Parse(Console.ReadLine());
// Console.Write("Число n:");
// int n = int.Parse(Console.ReadLine());

// double[,] array = new double[m, n];
// Random xz = new Random();

// void FillArray(double [,] array3,int m3,int n3)
// {
//     for(int i =0;i<m3;i++)
//     {
//         for(int j = 0;j<n3;j++)
//         {
//             array3[i,j] = xz.Next(3,33) + xz.NextDouble();
//             Console.Write(array3[i, j] + "\t");
//         }
//         Console.WriteLine();
//     }

// }
// FillArray(array,m,n);

//Домашка07.02
// Напишите программу, которая на вход принимает позиции элемента в двумерном массиве, и возвращает значение этого элемента или же указание, что такого элемента нет.
Random xz = new Random();
int m = xz.Next(3, 14);
int n = xz.Next(3, 14);
int[,] array = new int[m, n];

int[,] FillArray(int[,] array3, int m3, int n3)
{
    for (int i = 0; i < m3; i++)
    {
        for (int j = 0; j < n3; j++)
        {
            array3[i, j] = xz.Next(3, 34);
            Console.Write(array3[i, j] + "\t");
        }
        Console.WriteLine();
    }
    return array3;
}

int[,] arrayRandom = FillArray(array, m, n);
int[,] GettingNumberByIndex(int[,] array3, int m3, int n3)
{
    System.Console.Write("Ввеидите номер строки :");
    int indexI = int.Parse(Console.ReadLine());
    System.Console.Write("Ввеидите номер столбца :");
    int indexJ = int.Parse(Console.ReadLine());
    if (indexI >= m || indexJ >= n)
    {
        System.Console.WriteLine("Такого элемента не существует");
    }
    else
    {
        System.Console.WriteLine(arrayRandom[indexI, indexJ]);

    }
    return arrayRandom;
}
int[,] index = GettingNumberByIndex(array, m, n);

// GettingNumberByIndex(array, m, n);
//Домашка07.03
// Задайте двумерный массив из целых чисел. Найдите среднее арифметическое элементов в каждом столбце.

// Console.Write("Число m:");
// int m = int.Parse(Console.ReadLine());
// Console.Write("Число n:");
// int n = int.Parse(Console.ReadLine());

// int[,] array = new int[m, n];

// void FillArray(int[,] array3, int m3, int n3)
// {
//     for (int i = 0; i < m3; i++)
//     {
//         for (int j = 0; j < n3; j++)
//         {   
//             array3[i, j] = new Random().Next(3,34);
//             Console.Write(array3[i, j] + "\t");
//         }
//         Console.WriteLine();
//     }
// }

// void AverageOfPillars(int[,] array, int rows, int columns)
// {

//     for (int j = 0; j < columns; j++)
//     {
//         double sum = 0;
//         for (int i = 0; i < rows; i++)
//         {
//             sum += array[i, j];

//         }
//         Console.WriteLine($"Среднее арифметическое столбце {j} = {Math.Round(sum / rows, 2)}");
//     }

// }

// int[,] matrix = new int[m, n];
// FillArray(matrix, m, n);
// AverageOfPillars(matrix, m, n);