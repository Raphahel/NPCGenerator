public abstract class Origin{

    private String originName;
    private String inhabitantName;
    private Pantheon culturalPantheon;
    private float conformism;
    
    public Origin(String originName, String inhabitantName, Pantheon culturalPantheon, float conformism){
        this.originName = originName;
        this.inhabitantName = inhabitantName;
        this.culturalPantheon = culturalPantheon;
        this.conformism = conformism;
    }

}