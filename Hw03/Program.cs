// Домашка03.01 -Напишите программу, которая принимает на вход пятизначное число и проверяет, является ли оно палиндромом. 
//Задание должно быть выполнено в методе. В методе не должно быть вывода в консоль. Не использовать String!

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

int num = P3();
while(num < 10000 || num > 99999)
{
    Console.WriteLine("Введенное число, в данном моменте, не является верным");
    num = int.Parse(Console.ReadLine());
}

bool Revers(int palind)
{
     int count = 5;
     int index = 0;
     int temp = palind;
    int poul = 0;
     while(index < count)
         {
             poul = poul * 10 + temp % 10;
             temp = temp / 10;
             index++;
         }
     bool a = poul == palind;
     return a;
}

if (Revers(num))
{
    Console.WriteLine("Число является полиндромом");
}
else
{
    Console.WriteLine("Число не является полиндромом");
}
//Домашка03.02-Напишите программу, которая принимает на вход координаты двух точек и находит расстояние между ними в 3D пространстве. 
//Задание должно быть выполнено в методе. В методе не должно быть вывода в консоль.
/*
double P3 ()
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

double a1 = P3();
double a2 = P3();
double a3 = P3();
double b1 = P3();
double b2 = P3();
double b3 = P3();

double ab = Math.Sqrt((b1-a1)*(b1-a1) + (b2-a2)*(b2-a2) + (b3-a3)*(b3-a3));
Console.WriteLine(ab);
*/

//Домашка03.03-Напишите программу, которая принимает на вход число (N) и выдаёт таблицу кубов чисел от 1 до N. 

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

int num = P3();
int i = 0;
while(i <= num)
{
 int num3 = (int)(Math.Pow(i, 3));
 Console.Write(num3 + " ");
 i++;
}
*/