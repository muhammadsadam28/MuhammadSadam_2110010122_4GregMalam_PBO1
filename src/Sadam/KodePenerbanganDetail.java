package Sadam;

public class KodePenerbanganDetail extends KodePenerbangan {

    // overriding
    public KodePenerbanganDetail(String kodePenerbangan, String maskapai) {
        super(kodePenerbangan, maskapai);
    }

    public int getTiket() {
      return Integer.parseInt(getKodePenerbangan().substring(0, 2));
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
        }
    }

    public String getKelas() {
        String Kelas = getKodePenerbangan().substring(4, 6);
        // seleksi if
        if (Kelas.equals("01")) {
            return "Kelas VIP";
        } else {
            return "Kelas Ekonomi";
        }
    }
    
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
    }

    @Override
    public String displayInfo() {
        return super.displayInfo()
                + "\nNo Tiket: " + getTiket()
                + "\nTujuan Keberangkatan: " + getTujuanKeberangkatan()
                + "\nKelas: " + getKelas()
                + "\nHari Berangkat: " + getHariBerangkat();
    }
}