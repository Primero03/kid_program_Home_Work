num = int(input("Число:"))
sum = 1
work = 1

def GetSum(n,s):
    if n == 0:return
    GetSum(n=n-1,s = s+(s+1))
    print(f"Сумма :{s}")

GetSum(num,sum) 
print() 

def GetWork(n,w):
   if n == 0:return
   GetWork(n=n-1,w = w * (w+1))
   print(f"Произведение :{w}")

GetWork(num,work)  

##Нахождение суммы чисел от 1 до N(1,2 =3;3,4 = 7) и факториала от 1 до N