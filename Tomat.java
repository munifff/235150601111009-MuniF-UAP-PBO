package UAP;

public class Tomat extends Tanaman implements Perawatan{
    public Tomat(){
    
    }
    
    @Override
    public void treatment() {
        setPerkembangan(getPerkembangan() * 5 / 100); // Increase perkembangan by 5%
    }

    @Override
    public void berkembang() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'berkembang'");
    }
}

    
