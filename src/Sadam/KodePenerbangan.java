package Sadam;

    public class KodePenerbangan {
    private String kodePenerbangan;
    private String maskapai;

    // constructor
    public KodePenerbangan(String kodePenerbangan, String maskapai) {
        this.kodePenerbangan = kodePenerbangan;
        this.maskapai = maskapai;
    }

    // mutator (setter)
    public void setKodePenerbangan(String kodePenerbangan) {
        this.kodePenerbangan = kodePenerbangan;
    }

    public void setMaskapai(String maskapai) {
        this.maskapai = maskapai;
    }

    // accessor (getter)
    public String getKodePenerbangan() {
        return kodePenerbangan;
    }

    public String getMaskapai() {
        return maskapai;
    }

    public String displayInfo() {
        return "Kode Penerbangan : " + getKodePenerbangan() + "\nMaskapai : " + getMaskapai();
    }


}
