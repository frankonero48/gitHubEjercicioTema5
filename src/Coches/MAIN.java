package Coches;

public class MAIN extends CocheCRUDImpl{

    public static void main(String[] args) {
        CocheCRUD cocheCrud1 = new CocheCRUDImpl("Ford", "Rojo", 2500.0, 2.0, true,25000);
        CocheCRUD cocheCrud2 = new CocheCRUDImpl("Seat", "Verde", 1500.0, 3.0, true,20000);
        CocheCRUD cocheCrud3 = new CocheCRUDImpl("Fiat", "Azul", 1800.0, 1.0, false,15000);
        System.out.println(cocheCrud1);
        System.out.println(cocheCrud2);
        System.out.println(cocheCrud3);

        cocheCrud1.saved();
        cocheCrud2.findAll();
        cocheCrud3.deleted();
        }


}




