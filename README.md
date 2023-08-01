# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi tentang Kode Penerbangan menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa notik dan nama, dan memberikan output berupa informasi detail dari No penerbangan tersebut seperti kode Penerbanagan, kode posisi kelas, dan kode hari keberangkatan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `KodePenerbangan`, `KodePenerbanganDetail`, dan `KodePenerbanganUtama` adalah contoh dari class.

```bash
public class KodePenerbangan {
    ...
}

public class KodePenerbanganDetail extends KodePenerbangan {
    ...
}

public class KodePenerbanganUtama {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `kpu[i] = new KodePenerbanganDetail(kodePenerbangan, maskapai);` adalah contoh pembuatan object.

```bash
kpu[i] = new KodePenerbanganDetail(kodePenerbangan, maskapai);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `Kode Penerbangan` dan `Maskapai` adalah contoh atribut.

```bash
String KodePenerbangan;
String Maskapai;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `KodePenerbangan`dan 'KodePenerbanganDetail'.

```bash
public KodePenerbangan(String kodePenerbangan, String maskapai) {
        this.kodePenerbangan = kodePenerbangan;
        this.maskapai = maskapai;
}

public KodePenerbanganDetail(String kodePenerbangan, String maskapai) {
        super(kodePenerbangan, maskapai)
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setKodePenerbangan` dan `setMaskapai' adalah contoh method mutator.

```bash
public void setKodePenerbangan(String kodePenerbangan) {
        this.kodePenerbangan = kodePenerbangan;
    }

    public void setMaskapai(String maskapai) {
        this.maskapai = maskapai;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getKodePenerbangan`, `getMaskapai` adalah contoh method accessor.

```bash
 public String getKodePenerbangan() {
        return kodePenerbangan;
    }

    public String getMaskapai() {
        return maskapai;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `KodePenerbangan` dan `Maskapai` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String kodePenerbangan;
    private String maskapai;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `KodePenerbanganDetail` mewarisi `KodePenerbangan` dengan sintaks `extends`.

```bash
public class KodePenerbanganDetail extends KodePenerbangan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk 
berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini,Method displayInfo() 
di-class KodePenerbanganDetail meng-overriding method displayInfo() yang ada di class KodePenerbangan. Ketika objek dari class KodePenerbanganDetail dipanggil menggunakan referensi 
dari class KodePenerbangan, method displayInfo() yang akan dijalankan adalah method yang ada di class KodePenerbanganDetail, bukan method yang ada di class KodePenerbangan.

```bash
public String displayInfo() {
    return "Kode Penerbangan : " + getKodePenerbangan() + "\nMaskapai : " + getMaskapai();
}

@Override
public String displayInfo() {
    return super.displayInfo()
            + "\nNo Tiket: " + getTiket()
            + "\nTujuan Keberangkatan: " + getTujuanKeberangkatan()
            + "\nKelas: " + getKelas()
            + "\nHari Berangkat: " + getHariBerangkat();
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getKelas` 
dan seleksi `switch` dalam method `getTujuanKeberangkatan`dan 'getHariKeberangkatan'.

```bash
public String getKelas() {
        String Kelas = getKodePenerbangan().substring(4, 6);
        // seleksi if
        if (Kelas.equals("01")) {
            return "Kelas VIP";
        } else {
            return "Kelas Ekonomi";
        }
    }


public String getTujuanKeberangkatan() {
        String Tujuan = getKodePenerbangan() .substring(2, 4);
        switch (Tujuan) {
            case "01":
                return "Banjarmasin";
            case "02":
                return "Bandung";
            case "03":
                return "Jakarta";
            default:
                return "Maaf Tujuan Tidak Ada";

public String getHariBerangkat(){
        String hari = getKodePenerbangan().substring(6, 8);
        switch (hari) {
            case "01":
                return "Hari Senin";
            case "02":
                return "Hari Selasa";
            case "03":
                return "Hari Rabu";
            case "04":
                return "Hari Kamis";
            case "05":
                return "Hari Jumat";
            case "06":
                return "Hari Sabtu";
            case "07":
                return "Hari Minggu";
            default:
                return "Hari Tidak Ada";
        }

```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

Perulangan pertama pada class KodePenerbanganUtama:
```bash
for (int i = 0; i < kpu.length; i++) {
    System.out.print("Masukkan Kode Penerbangan " + (i + 1) + ": ");
    String kodePenerbangan = scanner.nextLine();
    System.out.print("Masukkan Maskapai " + (i + 1) + ": ");
    String maskapai = scanner.nextLine();

    // objek
    kpu[i] = new KodePenerbanganDetail(kodePenerbangan, maskapai);
}

Perulangan kedua pada class KodePenerbanganUtama:
```bash
for (KodePenerbanganDetail data : kpu) {
    System.out.println("");
    System.out.println("=========================");
    System.out.println("Data Penerbangan");
    System.out.println(data.displayInfo());
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.print("Masukkan Kode Penerbangan " + (i + 1) + ": ");
            String kodePenerbangan = scanner.nextLine();
            System.out.print("Masukkan Maskapai " + (i + 1) + ": ");
            String maskapai = scanner.nextLine();

System.out.println("");
            System.out.println("=========================");
            System.out.println("Data Penerbangan");
            System.out.println(data.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `KodePenerbanganDetail[] kpu = new KodePenerbanganDetail[2];` adalah contoh penggunaan array.

```bash
KodePenerbanganDetail[] kpu = new KodePenerbanganDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan Format Kode Penerbangan: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan Umum: " + e.getMessage());
        }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad sadam
NPM: 2110010122
