package OOP;

public class AngajatStudent extends Persoana implements AngajatInt, StdentInt {
    private String firma;
    private String experienta;
    private String zileConcediu;

    private String facultate;
    private String an;
    private Boolean bursa;

    public AngajatStudent(String nume, String prenume, String varsta,
                          String firma, String experienta, String zileConcediu,
                          String facultate, String an, Boolean bursa)
    {
        super(nume, prenume, varsta);
        this.firma=firma;
        this.experienta=experienta;
        this.zileConcediu=zileConcediu;
        this.facultate=facultate;
        this.an=an;
        this.bursa=bursa;
    }

    @Override
    public void mergeLaMunca() {

    }

    @Override
    public void primesteSalar() {

    }

    @Override
    public void mergeInPauza() {

    }

    @Override
    public void prezintaDemisie() {

    }

    @Override
    public void mergeLaCurs() {

    }

    @Override
    public void sustineExamene() {

    }

    @Override
    public void mergeLaCafea() {

    }
}
