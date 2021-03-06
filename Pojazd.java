package zadaniaDomowe.wypożyczalnia;

import java.time.LocalDate;

public abstract class Pojazd {
    private String rejestracja;
    private String vin;
    private String kolor;
    private String typ;
    private int cena;
    private double spalanie; // na 100km
    private double stanZbiornikaPaliwa; //w litrach
    private double licznikKilometrów;
    private boolean czyWypożyczony;
    private LocalDate dataWypozyczenia;
    private int iloscDniWypozyczenia;

    public Pojazd(String rejestracja, String vin, String kolor, double spalanie) {
        this.rejestracja = rejestracja;
        this.vin = vin;
        this.kolor = kolor;
        this.spalanie = spalanie;
    }

    public boolean isCzyWypożyczony() {
        return czyWypożyczony;
    }

    public void setCzyWypożyczony(boolean czyWypożyczony) {
        this.czyWypożyczony = czyWypożyczony;
    }

    public LocalDate getDataWypozyczenia() {
        return dataWypozyczenia;
    }

    public void setDataWypozyczenia(LocalDate dataWypozyczenia) {
        this.dataWypozyczenia = dataWypozyczenia;
    }

    public int getIloscDniWypozyczenia() {
        return iloscDniWypozyczenia;
    }

    public void setIloscDniWypozyczenia(int iloscDniWypozyczenia) {
        this.iloscDniWypozyczenia = iloscDniWypozyczenia;
    }

    public String getTyp() {
        return typ;
    }

    public String getRejestracja() {
        return rejestracja;
    }

    public String getVin() {
        return vin;
    }

    public String getKolor() {
        return kolor;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public double getSpalanie() {
        return spalanie;
    }

    public double getStanZbiornikaPaliwa() {
        return stanZbiornikaPaliwa;
    }

    public void setStanZbiornikaPaliwa(double stanZbiornikaPaliwa) {
        this.stanZbiornikaPaliwa = stanZbiornikaPaliwa;
    }

    public double getLicznikKilometrów() {
        return licznikKilometrów;
    }

    public void setLicznikKilometrów(double licznikKilometrów) {
        this.licznikKilometrów = licznikKilometrów;
    }

    @Override
    public String toString() {
        return "Pojazd[" +
                "rejestracja = " + rejestracja + '\'' +
                ", kolor = " + kolor + '\'' +
                ", cena = " + cena +
                ", spalanie = " + spalanie +
                ", stanZbiornikaPaliwa = " + stanZbiornikaPaliwa +
                ", licznikKilometrów = " + licznikKilometrów +
                ", czyWypożyczony = " + czyWypożyczony +
                ']';
    }
}
