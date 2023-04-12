num = int(input("Введите число-границу:"))
degree = int(0)
z = int(2)
while(z**degree < num):
    v = z**degree
    degree +=1
    print(f"{degree} степень: {v}")

