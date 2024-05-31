package UAP;

public class Persik extends Tanaman implements Perawatan{
    public Persik(){
    
    }
    @Override
    public void treatment() {
        setPerkembangan(getPerkembangan() * 2.5 / 100); // Increase perkembangan by 5%
    }

    @Override
    public String toString() {
        return "Persik - " + super.toString();
    }
    @Override
    public void berkembang() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'berkembang'");
    }
}
