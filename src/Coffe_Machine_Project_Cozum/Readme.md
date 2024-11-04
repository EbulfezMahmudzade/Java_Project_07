# Kahve Makinesi
 
### 1. Bu projede kullanıcının kendi zevkine göre çeşitli kararlar alabileceği akıllı bir kahve makinesi yazılımı tasarlayacaksınız.
   Not: Projenin asıl amacı, tasarım yapmanın farklı yollarını keşfetmektir. Arayüz (_**Interface**_), Soyut Sınıf (**_Abstract Class_**), **_Enum_** kavramlarını bu sayede uygulama şansı yakalayacağız. Dolayısıyla lütfen OOP'nin temel kavramları olan Kalıtım (**_Inheritence_**), Soyutlama (**_Abstraction_**), Çok Biçimlilik (**_Polymorphism_**) ve Kapsülleme (**_Encapsulation_**) kavramlarını mümkün olduğunca uygulamaya çalışalım.

## GEREKSİNİMLER
 
###   Kahve makineniz aşağıdaki kahve türlerine sahip olmalıdır:

1. Americano
2. Espresso
3. Cappucino
4. Latte
5. Mocha
6. Macchiato
7. Affogato
8. Buzlu Kahve (Soğuk kahve)
9. Frappuccino (Soğuk kahve)
10. Irish

---

### 2. Kullanıcı geçersiz bir seçeneği seçerse konsolun çıktısını alması gerekir:
    - "Geçersiz seçim. Lütfen geçerli bir düğmeye basın!”

### 3. Kullanıcı geçerli düğmeye basarak istediği kahveyi seçtiğinde konsolun çıktısını alması gerekir:
    - “{Kahve}'yi seçtiniz…

### 4. Kahve soğuk bir kahve ise konsol çıktı almalıdır:
    - “Sıcak bir yaz gününde serinlemenin en iyi yolu… Mükemmel karar!”
### 5. Eğer kahve sıcaksa, konsol herhangi bir şey yazdırmamalıdır.


### 6. Daha sonra konsol kahvenin boyutunu sormalıdır:
    - “Lütfen aşağıdaki menüden kahvenizin boyutunu (size) seçiniz…”
        - Small
        - Medium
        - Large
        - XLarge

### 7. Daha sonra konsolunuz kullanıcıyı şu ana kadarki seçimleri hakkında bilgilendirmelidir:
    - "{size} {kahve}'niz hazırlanıyor…

### 8. Bundan sonra kahve makineniz şunu sormalıdır:
    - “{Kahvenize} süt eklemek ister misiniz? Lütfen {kahvenizin} yanında süt istiyorsanız Evet, istemiyorsanız Hayır yazın."
        - Kullanıcı süt isterse konsol şunu yazdırmalıdır:
            - "{Kahvenize} süt ekleniyor... Lütfen bekleyin..."
        - Kullanıcı süt istemiyorsa konsolun çıktısını alması gerekir:
            - "{Kahveniz} sütsüz hazırlanıyor..."

### 9. Ve son olarak kahve makineniz aşağıdaki çıktıyı alarak kullanıcıya kahvesine şeker isteyip istemediğini sormalıdır:
    - “{Kahvenize} şeker ister misiniz? (Şeker istiyorsanız Evet, istemiyorsanız Hayır yazın.)
        - Kullanıcı şeker isterse konsol şunu yazdırmalıdır:
            - “Kaç şeker istersin?”
        - Kullanıcı şeker istemiyorsa konsolun çıktı vermesi gerekir:
            - “Kahveniz şekersiz hazırlanıyor…”

### 10. Sonunda konsol, kullanıcının tüm seçimleri ve siparişin toplamı hakkında bir özet yazdırmalıdır. Şöyle bir şey olabilir:
```
Kahve sütsüz ve şekerli ise:
- “{size} {kahveniz} sütsüz ve {şeker sayısı} küp şekerle hazırlanıyor.

Kahve sütsüz ve şekersiz ise:
- “{size} {kahveniz} sütsüz ve şekersiz hazırlanıyor.

Kahve sütlü ve şekerli ise:
- “{size} {kahveniz} süt ve {şeker sayısı} küp şekerle hazırlanıyor.

Kahve sütlü ve şekersiz ise:
- “{size} {kahveniz} sütle hazırlanıyor, şeker ilave edilmeyecek.
```

LÜTFEN KAHVE MAKİNENİZE DAHA FAZLA İŞLEVSELLİK KATARAK EĞLENMEKTEN ÇEKİNMEYİN!
