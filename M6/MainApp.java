public class MainApp {
    public static void main(String[] args) {
        Product shirt = new Product();
        Electronics elektronik = new Electronics();
        Clothing polo = new Clothing();

        shirt.setName("Shirt");
        shirt.setPrice(25.80);
        shirt.setProductId(1);

        elektronik.setName("Laptop");
        elektronik.setPrice(999.99);
        elektronik.setProductId(1);
        elektronik.setWarrantyMonths(3);

        polo.setName("Polo");
        polo.setPrice(9.99);
        polo.setProductId(1);
        polo.setSize("M");


        System.out.println("---Shirt---");
        shirt.getInfo();
        System.out.println();

        System.out.println("---Electronics---");
        System.out.println("Name : " + elektronik.getName() + "\nPrice : " + elektronik.getPrice() + "\nId : " + elektronik.getProductId());
        elektronik.getInfo();
        System.out.println();

        System.out.println("---Clothing---");
        System.out.println("Name : " + polo.getName() + "\nPrice : " + polo.getPrice() + "\nId : " + polo.getProductId());
        polo.getInfo();
        System.out.println();
    }
}