import java.util.concurrent.ThreadLocalRandom;
//This class contain attributes for NPC these are displayed in their sheet and used for generating the backstories.

public enum Attribute{
    RICH("money"), POOR("money"), 
    MAGE("arcane"), SORCERER("arcane"), CLERIC("arcane")
    ERMIT("social status"), NOBLE("social status"),
    RUDE("character"), EASYGOING("character"), REFINED("character");

    private String attributeType;

    private Attribute(String attributeType){
        this.attributeType = attributeType;
    }

    public String getAttributeType(){ return attributeType; }

    public static Attribute[] generateAttributeArray(){
        Attribute[] arr = new Attribute[5];
        for(int i = 0; i < 3; i++){
            arr[i] = values()[ThreadLocalRandom.current().nextInt(0, values().length)];
        }
        for(int i = 3; i < 5; i++){ arr[i] = null; }

        arr = consistencyCheck(arr);

        return arr;
    }

    //Not the most optimized but for array of 5 item it will do
    private static Attribute[] consistencyCheck(Attribute[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != null){
                for(int j = arr.length - 1; j > i; j--){
                    if(arr[j] != null && arr[i].getAttributeType().equals(arr[j].getAttributeType())){
                        arr[j] = null;
                    }
                }
            }
        }

        return arr;
    }
}