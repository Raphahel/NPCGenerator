import Java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class NonGenderedNames extends Origin{

    private ArrayList<String> nameArray = new ArrayList<String>;
    private ArrayList<String> surnameArray = new ArrayList<String>;

    public NonGenderedNames(String originName, String inhabitantName, Pantheon culturalPantheon, float conformism){
        super(String originName, String inhabitantName, Pantheon culturalPantheon, float conformism);
    }

    public void addName(String name){ nameArray.add(name); }

    public void addName(String surname){ surnameArray.add(surname); }

    public String generateName(){
        return nameArray.get(ThreadLocalRandom.current().nextInt(0, nameArray.size()));
    }
}