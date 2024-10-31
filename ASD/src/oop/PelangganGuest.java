package oop;

public class PelangganGuest extends Pelanggan{

    private String Medsos;

    PelangganGuest(){
        super("Guest", "");
    }

    public String getMedsos() {
        return Medsos;
    }

    public void setMedsos(String medsos) {
        Medsos = medsos;
    }

    public void inputData(String nama, String sapaan){
        setNama(nama);
        setSapaan(sapaan);
    }



    public static void main(String[] args) {
        PelangganGuest guest = new PelangganGuest();
        guest.inputData("Awan", "Bang");

    }



}
