/// Домашка02.01-Напишите программу, которая принимает на вход трёхзначное число и на выходе показывает вторую цифру этого числа

 var phrase = "Введите трёхзначное число ";
 int someNumber = 0;

 while(someNumber>1000 || someNumber<100)
 {
     Console.WriteLine(phrase);
     someNumber = int.Parse(Console.ReadLine());
     phrase = "Введенное число вне диапазона! Введите трехзначное число ";
 }
 int secondNumberOfSomeNumber = someNumber/10%10;
 Console.WriteLine(secondNumberOfSomeNumber);
//Домашка02.02-Напишите программу, которая выводит третью цифру заданного числа или сообщает, что третьей цифры нет.
//Console.Write("Введите число ");
// var someNumber2 = int.Parse(Console.ReadLine());

// var thirdNumberOfSomeNumber2 = someNumber2;
// if(thirdNumberOfSomeNumber2 < 0)
// {
//     thirdNumberOfSomeNumber2 = thirdNumberOfSomeNumber2 * -1;
// }

// while(thirdNumberOfSomeNumber2>999)
// {
//     thirdNumberOfSomeNumber2 = thirdNumberOfSomeNumber2 / 10;
// }
// if(thirdNumberOfSomeNumber2 < 100)
// {
//     Console.WriteLine("Третьей цифры нет");
// }
// else
// {
//     Console.WriteLine(thirdNumberOfSomeNumber2 % 10)

///Домашка02.03-Напишите программу, которая принимает на вход цифру, обозначающую день недели, и проверяет, является ли этот день выходным.
//int a = int.Parse(Console.ReadLine());

//if (a == 1){
//    Console.WriteLine("Понедельник");
//    Console.Write("Будний день");
//}
//else if (a == 2)
//{
//    Console.WriteLine("Вторник");
//    Console.Write("Будний день");
//}
//else if (a == 3)
//{
//    Console.WriteLine("Среда");
//    Console.Write("Будний день");
//}
//else if (a == 4)
//{
//    Console.WriteLine("Четверг");
//    Console.Write("Будний день");
//}
//else if (a == 5)
//{
//    Console.WriteLine("Пятница");
//    Console.Write("Будний день");
//}
//else if (a == 6)
//{
//    Console.WriteLine("Суббота");
//    Console.Write("Выходной");
//}
//else if (a == 7)
//{
//    Console.WriteLine("Воскресенье");
//    Console.Write("Выходной");
//}
//else 
//{
//    Console.WriteLine("EROR");
//}