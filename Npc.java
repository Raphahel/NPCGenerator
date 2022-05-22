public class Npc{

    private String name;
    private String surname;
    private int age;
    private Specie specie;
    private String story;
    private Attribute[] attributes;

    public Npc(String name, String surname, Specie specie, int age){
        this.name = name;
        this.surname = surname;
        this.specie = specie;
        this.age = age;
        attributes = Attribute.generateAttributeArray();
        story = "this is a test story";
    }

    public Npc(String name, String surname, Specie specie){
        this(name, surname, specie, specie.generateAge());
    }

    public String toString(){
        String attributesString ="";
        for(int i = 0; i < attributes.length; i++){
            if(attributes[i] != null){
                attributesString += attributes[i].name() + " ";
            }
        }
        return String.format("%s %s\n%s\n%s\n%d years\n\n%s", name, surname, specie.getSpecieName(), attributesString, age, story);
    }
}