# Görev

Bir bilgisayarı simüle etmek için Computer adlı class’ımız var.

- Depolama olarak herhangi bir sayıda herhangi bir boyutta HDD, herhangi bir sayıda herhangi bir boyutta SSD’si olabilir (örn. 2 tane 512GB HDD, 1 tane 256GB SSD)
- Herhangi bir sayıda herhangi bir boyutta RAM (örn. iki tane 8GB RAM)
- Herhangi bir model işlemci
- İşletim Sistemi (optional)
- Ekran kartı (optional)

### 1. Builder patterni ile ComputerBuilder yazılacak.
### 2. Aynı pattern ile ComputerValueBuilder yazılacak (fiyat hesaplaması için, int dönecek en son)

- Bir Gaming Bilgisayarın özellikleri şu şekildedir:

  - 1 adet 1024GB HDD
  - 1 adet 256GB SSD
  - 1 adet 512GB SSD
  - 1 adet 8GB RAM
  - 1 adet 16GB RAM
  - Intel Core i7 işlemci
  - Windows 11 İşletim Sistemi
  - Nvidia RTX

- Bir İş Bilgisayarının özellikleri şu şekildedir:

  - 2 adet 512GB HDD
  - 2 adet 8GB RAM
  - AMD Ryzen 9 işlemci

### 3. 100 adet Gaming ve 100 adet İş bilgisayarı üretmek (seri üretim ツ) için Director yazılacak, bu bilgisayarların fiyatları da builder ile hesaplanacak (100 tane instance oluşturup bırakın)
### 4. Computer class’ı prototype patternine uygun hale getirilecek, 100er adet gaming ve iş bilgisayarı bu pattern ile üretilecek

| HDD    | Fiyat | SSD    | Fiyat | RAM  | Fiyat | İşlemci       | Fiyat | GPU        | Fiyat |
| ------ | ----- | ------ | ----- | ---- | ----- | ------------- | ----- | ---------- | ----- |
| 256GB  | ₺250  | 128GB  | ₺250  | 4GB  | ₺250  | Intel Core i5 | 3k    | Nvidia RTX | 15k   |
| 512GB  | ₺500  | 256GB  | ₺500  | 8GB  | ₺500  | Intel Core i7 | 10k   | Nvidia GTX | 10k   |
| 1024GB | ₺1000 | 512GB  | ₺1000 | 16GB | ₺1000 | AMD Ryzen 7   | 12k   | Nvidia MX  | 5k    |
| 2048GB | ₺2000 | 1024GB | ₺2000 | 32GB | ₺2000 | AMD Ryzen 9   | 19k   | AMD Radeon | 5k    |

