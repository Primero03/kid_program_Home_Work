## Найдите сумму цифр трехзначного числа

n = int(input("Введите трехзначное число :"))
q = int(n//100)
r = int(n//10%10)
z = int(n%10)
sum = q+r+z
print(f"{q} , {r} , {z}")
print(sum)