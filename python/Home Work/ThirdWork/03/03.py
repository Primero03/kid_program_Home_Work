English = {1: 'A''E''I''O''U''L''N''S''T''R',
2: 'D''G',
3:'B''C''M''P',
4:'F''H''V''W''Y',
5:'K',
8:'J''X',
10:'Q''Z'
}

Rus = {1:'А'"В""Е""И""Н""С""Р""С"'Т',
2:'Д''К''Л''М''П''У',
3:'Б''Г''Ё''Ь''Я',
4 : 'Й''Ы',
5:'Ж''З''Х''Ц''Ч',
8:'Ш''Э''Ю',
10:'Щ''Ъ'
}

userInpit = (input("Введите слово:")).upper()
count = int(0)
for i in userInpit:
    for j in English:
        if i in English[j]:
             count = count+ j
        else:
            for j in Rus:
               if i in Rus[j]:
                count +=j            


print(count)