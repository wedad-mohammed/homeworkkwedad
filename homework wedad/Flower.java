//Q10
public class Flower {
    private String name;
    private  int numberOfPetals;;
    private float price;

    public Flower(String name, int numberOfPetals, float price) {
        this.name = name;
        this.numberOfPetals = numberOfPetals;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getNumberOfPetals() {
        return numberOfPetals;
    }
    public void setNumberOfPetals(int numberOfPetals) {
        this.numberOfPetals = numberOfPetals;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public static void main(String[] args){
        Flower rose = new Flower("rose",32,5.00f);
        System.out.println("Flower name :"+rose.getName());
        System.out.println("number of petals :"+rose.getNumberOfPetals());
        System.out.println("Price :"+rose.getPrice());

        rose.setName("lolo");
        rose.setNumberOfPetals(31);
        rose.setPrice(2.99f);
        System.out.println("Flower name :"+rose.getName());
        System.out.println("number of petals :"+rose.getNumberOfPetals());
        System.out.println("Price :"+rose.getPrice());
    }
}


