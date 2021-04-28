package modul3;

public class DataMahasiswa extends DataUniversitas  {
    static String Alamat;
    static String Jurusan;

    public static String getAlamat() {
        return Alamat;
    }

    public static void setAlamat(String Alamat) {
        DataMahasiswa.Alamat = Alamat;
    }

    public static String getJurusan() {
        return Jurusan;
    }

    public static void setJurusan(String Jurusan) {
        DataMahasiswa.Jurusan = Jurusan;
    }

}
