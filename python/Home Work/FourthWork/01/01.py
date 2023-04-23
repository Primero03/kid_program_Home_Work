import random

firstSet = set()
secondSet = set()
firstSize = int(input("Введите размер первого набора чисел:"))
secondSize = int(input("Введите размер второго набора чисел"))
i = 0
v = 0
while i< firstSize:
    i+=1
    xz = random.randint(0,15)
    firstSet.add(xz)

print(f"Первый список:{firstSet}")

while v< secondSize:
    v+=1
    xz = random.randint(0,15)
    secondSet.add(xz)
    
print(f"Второй список:{secondSet}")

ThirdSed = firstSet.intersection(secondSet)
print(f"Пересекаемые значения:{ThirdSed}")