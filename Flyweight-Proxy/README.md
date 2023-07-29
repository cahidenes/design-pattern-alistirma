## Flyweight ve Proxy Design Pattern Alıştırma

**Drawable** adlı bir interface’imiz var

- getCoordinates() fonksiyonu var.

**Document** adlı bir classımız var

- Drawable listesi tutuyor
- addDrawable(Drawable)
- draw() fonksiyonunda bu listedeki koordinatları çiziyor (gerçekten çizmenize gerek yok).

**Shape** adlı bir classımız var

- Drawable implement ediyor
- Constructorında koordinat listesi, x ve y alıyor
- getCoordinates() fonksiyonunda koordinatlara x ve y ekleyerek döndürüyor.

**MyCharacter** adlı bir classımız var

- Drawable implement ediyor
- Constructorında harf, x ve y alıyor.
- getCoordinates() fonksiyonunda harfe karşılık gelen koordinatlara x ve y ekleyerek döndürüyor

```
private static final Map<Character, int[]> characterMap = new HashMap<>();
characterMap.put('A', new int[]{0, 4, 2, 0, 4, 4, 3, 1, 1, 1, 0, 4});
characterMap.put('B', new int[]{0, 0, 0, 4, 2, 4, 2, 2, 2, 0, 4, 0, 4, 1, 2, 1, 4, 3, 2, 3, 4, 4, 0, 0});
characterMap.put('C', new int[]{4, 0, 0, 0, 0, 4, 4, 4, 4, 1, 1, 1, 4, 0});
characterMap.put('D', new int[]{0, 0, 0, 4, 3, 4, 4, 3, 4, 1, 3, 0, 0, 0});
characterMap.put('E', new int[]{4, 0, 0, 0, 0, 4, 4, 4, 0, 2, 2, 2, 4, 0});
characterMap.put('F', new int[]{4, 0, 0, 0, 0, 4, 0, 2, 2, 2, 4, 0});
characterMap.put('G', new int[]{4, 0, 0, 0, 0, 4, 4, 4, 4, 1, 1, 1, 2, 1, 3, 1, 4, 1, 4, 2, 3, 2, 4, 0});
characterMap.put('H', new int[]{0, 0, 0, 4, 0, 2, 4, 0, 4, 4, 4, 2, 0, 0});
characterMap.put('I', new int[]{2, 0, 2, 4, 1, 0, 3, 0, 1, 4, 3, 4, 2, 0});
characterMap.put('J', new int[]{3, 0, 3, 4, 2, 0, 1, 0, 1, 4, 3, 0});
characterMap.put('K', new int[]{0, 0, 0, 4, 0, 2, 4, 0, 1, 2, 3, 4, 0, 0});
characterMap.put('L', new int[]{0, 0, 0, 4, 0, 0, 4, 0, 0, 0});
characterMap.put('M', new int[]{0, 4, 0, 0, 2, 2, 4, 0, 4, 4});
characterMap.put('N', new int[]{0, 4, 0, 0, 4, 4, 4, 0, 0, 4});
characterMap.put('O', new int[]{0, 0, 0, 4, 4, 4, 4, 0, 0, 0});
characterMap.put('P', new int[]{0, 4, 0, 0, 3, 0, 4, 1, 3, 2, 0, 2, 0, 4});
characterMap.put('Q', new int[]{0, 0, 0, 4, 4, 4, 4, 0, 0, 0, 3, 1, 4, 0, 0});
characterMap.put('R', new int[]{0, 4, 0, 0, 3, 0, 4, 1, 3, 2, 0, 2, 3, 2, 4, 4, 0, 4});
characterMap.put('S', new int[]{4, 0, 0, 0, 0, 2, 4, 2, 4, 4, 0, 4});
characterMap.put('T', new int[]{0, 0, 4, 0, 2, 0, 2, 4, 0, 0});
characterMap.put('U', new int[]{0, 0, 0, 4, 4, 4, 4, 0, 0, 0});
characterMap.put('V', new int[]{0, 0, 2, 4, 4, 0, 0});
characterMap.put('W', new int[]{0, 0, 0, 4, 2, 2, 4, 4, 4, 0, 0, 0});
characterMap.put('X', new int[]{0, 0, 4, 4, 0, 4, 4, 0, 0, 0});
characterMap.put('Y', new int[]{0, 0, 2, 2, 4, 0, 2, 2, 2, 4, 0, 0});
characterMap.put('Z', new int[]{0, 0, 4, 0, 0, 4, 4, 4, 0, 0});
```
1. Fakat bir Document classının çoğu MyCharacter’den oluşmaktadır. MyCharacter’in içindeki koordinat listesi hafızaya yük olmaktadır. Bu sorunu Flyweight patterni kullanarak çözünüz.


2. Koordinatlar \[x1, y1, x2, y2, x3, y3, …, xn, yn] formatında verilmektedir.

- bu listesinin çift uzunluktuda olması gerekmektedir.
- şeklin kapalı olması için ilk koordinatın son koordinata eşit olması gerekmektedir.

Bu kütüphaneyi kullanan kodırlar bir türlü bu kısıtlamalara alışamamıştır. Sürekli yanlış liste verip uygulamayı çökertmektedirler. Bunu engellemek için işlemeden önce Drawable classına bir Proxy yazıp yeni bir Drawable eklemeden önce liste doğru mu diye kontrol etmeniz, doğru değilse hata vermeniz gerekmektedir.

3. Yukarıdaki hardcoded koordinat listesinde 4 tane hatalı harf vardır, onları proxy sayesinde bulunuz.

**Koordinatların c++ hali**

    std::unordered_map<char, std::vector<int>> CharacterCoordinates::characterMap = {
        {'A', {0, 4, 2, 0, 4, 4, 3, 1, 1, 1, 0, 4}},
        {'B', {0, 0, 0, 4, 2, 4, 2, 2, 2, 0, 4, 0, 4, 1, 2, 1, 4, 3, 2, 3, 4, 4, 0, 0}},
        {'C', {4, 0, 0, 0, 0, 4, 4, 4, 4, 1, 1, 1, 4, 0}},
        {'D', {0, 0, 0, 4, 3, 4, 4, 3, 4, 1, 3, 0, 0, 0}},
        {'E', {4, 0, 0, 0, 0, 4, 4, 4, 0, 2, 2, 2, 4, 0}},
        {'F', {4, 0, 0, 0, 0, 4, 0, 2, 2, 2, 4, 0}},
        {'G', {4, 0, 0, 0, 0, 4, 4, 4, 4, 1, 1, 1, 2, 1, 3, 1, 4, 1, 4, 2, 3, 2, 4, 0}},
        {'H', {0, 0, 0, 4, 0, 2, 4, 0, 4, 4, 4, 2, 0, 0}},
        {'I', {2, 0, 2, 4, 1, 0, 3, 0, 1, 4, 3, 4, 2, 0}},
        {'J', {3, 0, 3, 4, 2, 0, 1, 0, 1, 4, 3, 0}},
        {'K', {0, 0, 0, 4, 0, 2, 4, 0, 1, 2, 3, 4, 0, 0}},
        {'L', {0, 0, 0, 4, 0, 0, 4, 0, 0, 0}},
        {'M', {0, 4, 0, 0, 2, 2, 4, 0, 4, 4}},
        {'N', {0, 4, 0, 0, 4, 4, 4, 0, 0, 4}},
        {'O', {0, 0, 0, 4, 4, 4, 4, 0, 0, 0}},
        {'P', {0, 4, 0, 0, 3, 0, 4, 1, 3, 2, 0, 2, 0, 4}},
        {'Q', {0, 0, 0, 4, 4, 4, 4, 0, 0, 0, 3, 1, 4, 0, 0}},
        {'R', {0, 4, 0, 0, 3, 0, 4, 1, 3, 2, 0, 2, 3, 2, 4, 4, 0, 4}},
        {'S', {4, 0, 0, 0, 0, 2, 4, 2, 4, 4, 0, 4}},
        {'T', {0, 0, 4, 0, 2, 0, 2, 4, 0, 0}},
        {'U', {0, 0, 0, 4, 4, 4, 4, 0, 0, 0}},
        {'V', {0, 0, 2, 4, 4, 0, 0}},
        {'W', {0, 0, 0, 4, 2, 2, 4, 4, 4, 0, 0, 0}},
        {'X', {0, 0, 4, 4, 0, 4, 4, 0, 0, 0}},
        {'Y', {0, 0, 2, 2, 4, 0, 2, 2, 2, 4, 0, 0}},
        {'Z', {0, 0, 4, 0, 0, 4, 4, 4, 0, 0}}
    };
