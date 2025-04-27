def not_cevirme(sayi):
    if 90 <= sayi <= 100:
        return 4
    elif 80 <= sayi < 90:
        return 3
    elif 70 <= sayi < 80:
        return 2
    elif 60 <= sayi < 70:
        return 1
    else:
        return 0


n = input()
sozluk = {}
toplam = 0
for i in range(int(n)):
    isim, sayi = input().split()
    sozluk[isim] = int(sayi)

for i in sozluk:
    toplam += sozluk[i]
ortalama = int(toplam / int(n))

max_deger = max(sozluk.values())
print(max(sozluk , key=sozluk.get) + ":", end=" ")
print(max_deger, end=" ")
print(not_cevirme(max_deger))
print(f"AVG: {ortalama} ", end=" ")
print(not_cevirme(ortalama))

for anahtar, deger in sozluk.items():
    print(anahtar, ":", not_cevirme(deger))

