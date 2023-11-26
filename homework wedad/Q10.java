public class Q10 {
    private String name;
    private  int numberPetals;;
    private float price;

    public Q10(String name, int numberPetals, float price) {
        this.name = name;
        this.numberPetals = numberPetals;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumberPetals() {
        return numberPetals;
    }
    public void setNumberPetals(int numberPetals) {
        this.numberPetals = numberPetals;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public static void main(String[] args){
        Flower pinkFlower = new Flower("pink flower",24,2.99f);
        System.out.println("Flower name :"+pinkFlower.getName());
    }
}
