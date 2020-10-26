package Generic;

public class ChildProductAndStorageExample {
    public static void main(String[] args) {
        Childproduct<Tv, String, String> product = new Childproduct<>();
        product.setKind(new Tv());
        product.setModel("smart Tv");
        product.setCompany("Samsung");

        Storage<Tv> storage = new StorageImpl<>(100);
        storage.add(new Tv(), 0);
        Tv tv = storage.get(0);
    }
}
