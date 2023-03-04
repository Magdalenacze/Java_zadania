
package zad_prog_rozdz_2_zad_16;

public class Zad_prog_rozdz_2_zad_16 
{
    public static void main(String[] args) 
    {
        int liczbaKonsumentow = 12467;
        double procentKupujacych = 0.14;
        double procentSmakCytrusowy = 0.64;
        int liczbaKonsumentowKupujacych;
        int liczbaKonsumentowSmakCytrusowy;
        
        liczbaKonsumentowKupujacych = (int)(liczbaKonsumentow 
                                           * procentKupujacych);
        
        liczbaKonsumentowSmakCytrusowy = (int)(liczbaKonsumentowKupujacych 
                                         * procentSmakCytrusowy);
        
        System.out.println("Przybliżona liczba ankietowanych osób, które kupują "
                          + "przynajmniej jeden napój energetyczny tygodniowo "
                          + "wynosi: " + liczbaKonsumentowKupujacych 
                          + "\nPrzybliżona liczba ankietoanych osób, które "
                          + "preferują napoje energetyczne o smaku cytrusowym "
                          + "wynosi: " + liczbaKonsumentowSmakCytrusowy);
    }
}
