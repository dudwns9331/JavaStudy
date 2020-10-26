package Generic;

class Tv {
    private String model;
    private String kind;

    public void setModel(String model){
        this.model = model;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getModel() {
        return this.model;
    }

    public String getKind() {
        return this.kind;
    }
}

class Car{

}

public class ProductExample {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<Tv, String>();
        product1.setKind(new Tv());
        product1.setModel("스마트TV");
        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        Product<Car, String> product2 = new Product<Car, String>();
        product2.setKind(new Car());
        product2.setModel("디젤");
        Car car = product2.getKind();
        String carModel = product2.getModel();

        System.out.println(product1.getKind() + product1.getModel());
        System.out.println("제품 : " + tv.getKind() + "이름 : " + tv.getModel());
    }
}
