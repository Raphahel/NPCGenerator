import java.util.concurrent.ThreadLocalRandom;

public class Specie{

    private String specieName;
    private int adultAge;
    private int lifeExpenctancy;

    public Specie(String specieName, int adultAge, int lifeExpenctancy){
        this.specieName = specieName;
        this.adultAge = adultAge;
        this.lifeExpenctancy = lifeExpenctancy;
    }

    public int generateAge(){
        return generateAge(0,lifeExpenctancy);
    }

    public int generateAge(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public String getSpecieName(){
        return specieName;
    }
}