/// Домашка02.01-Напишите программу, которая принимает на вход трёхзначное число и на выходе показывает вторую цифру этого числа
/*
 string num = "Введите трёхзначное число ";
 int range = 0;

 while(range>1000 || range<100)
 {
     Console.WriteLine(num);
     range = int.Parse(Console.ReadLine());
     num = "Введенное число вне диапазона! Введите трехзначное число ";
 }
 int twoNumber = range/10%10;
 Console.WriteLine(twoNumber);
 */
//Домашка02.02-Напишите программу, которая выводит третью цифру заданного числа или сообщает, что третьей цифры нет.
/*
 Console.Write("Введите число ");
 int range = int.Parse(Console.ReadLine());

 int num = range;
 if(num < 0)
 {
     num = num * -1;
 }

 while(num>999)
 {
     num = num / 10;
 }
 if(num < 100)
 {
     Console.WriteLine("Третьей цифры нет");
 }
 else
 {
     Console.WriteLine(num % 10);
 }   
*/
///Домашка02.03-Напишите программу, которая принимает на вход цифру, обозначающую день недели, и проверяет, является ли этот день выходным.
int day = int.Parse(Console.ReadLine());

if (day == 1){
    Console.WriteLine("Понедельник");
    Console.Write("Будний день");
}
else if (day == 2)
{
    Console.WriteLine("Вторник");
    Console.Write("Будний день");
}
else if (day == 3)
{
    Console.WriteLine("Среда");
    Console.Write("Будний день");
}
else if (day == 4)
{
    Console.WriteLine("Четверг");
    Console.Write("Будний день");
}
else if (day == 5)
{
    Console.WriteLine("Пятница");
    Console.Write("Будний день");
}
else if (day == 6)
{
    Console.WriteLine("Суббота");
    Console.Write("Выходной");
}
else if (day == 7)
{
    Console.WriteLine("Воскресенье");
    Console.Write("Выходной");
}
else 
{
    Console.WriteLine("EROR");
}
