//Задайте значения M и N. Напишите программу, которая найдёт сумму натуральных элементов в промежутке от M до N.
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


// int M = P3();
// int N = P3();
// int Sum = 0;
// void GetSum(int M, int N, int Sum)
// {
//     if (M == N) return;
//     Sum+=M ;GetSum(M - 1, N, Sum);
//     Console.Write(Sum + "\t");

// }
// GetSum(M, N, Sum);

//Задайте значение N. Напишите программу, которая выведет все натуральные числа в промежутке от N до 1.


// int N = P3();

// void GetSum(int N)
// {
//     if (N == 1) return;
//     GetSum(N - 1);
//     Console.Write(N + "\t");
// }
// GetSum(N);

//Напишите программу вычисления функции Аккермана с помощью рекурсии. Даны два неотрицательных числа m и n

int m = P3();
int n = P3();
int AckermanFunction(int m, int n)
{
    if (n == 0)
        return m + 1;
    else if ((n != 0) && (m == 0))
        return AckermanFunction(n - 1, 1);
    else
        return AckermanFunction(n - 1, AckermanFunction(n, m - 1));
}

int FunctionAckerman = AckermanFunction(m,n);
System.Console.WriteLine(FunctionAckerman);