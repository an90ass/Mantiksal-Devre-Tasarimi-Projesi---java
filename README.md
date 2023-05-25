# Mantiksal-Devre-Tasarimi-Projesi---java

Uygulama çalıştığında ilk olarak “karnaugh.txt” adındaki dosyayı okuyor. “karnaugh.txt” dosyasında bir
karnaugh diyagramına ilişkin bilgiler yer almaktadır.Dosyanın ekran görüntüsü aşağıda yer almaktadır.
Uygulama sadece 3-değişkenli ve 4-değişkenli karnaugh diyagramlarını destekliyor. Değişkenlerin isimleri tek karakterlidir fakat değişken isimleri değişebilir. Yani uygulama bunu
destekliyor.
 Program şu üç şeyi ekrana çıktı olarak veriyor:
a. Dosyadaki karnaugh diyagramına karşılık gelen doğruluk tablosu
b. Boole fonksiyonunun minterimlerin toplamı ve maksterimlerin çarpımı şeklindeki ifadesi.
c. Fonksiyonun tümleyeninin minterimlerin toplamı ve maksterimlerin çarpımı şeklindeki ifadesi
(Örnek bir ekran görüntüsü aşağıda verilmiştir.)
Proje nesneye yönelik programlama tekniğini göz önünde buldum.

Örnek bir ekran görüntüsü aşağıda verilmiştir:

karnaugh.txt dosyası okundu.
doğruluk tablosu:
A B C F
0 0 0 0
0 0 1 1
0 1 0 0
0 1 1 1
1 0 0 1
1 0 1 0
1 1 0 0
1 1 1 1
fonksiyon ifadeleri:
F = A’B’C + A’BC + AB’C’ + ABC
F = (A + B + C).(A + B’ + C).(A’ + B + C’).(A’ + B’ + C)
F’ = A’B’C’ + A’BC’ + AB’C + ABC’
F’ = (A + B + C’).(A + B’ + C’).(A’ + B + C).(A’ + B’ + C’)


![image](https://github.com/an90ass/Mantiksal-Devre-Tasarimi-Projesi---java/assets/91754070/87c137ba-dd17-4ca0-b5d7-c88d0984e5b9)

