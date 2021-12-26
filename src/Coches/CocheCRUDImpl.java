package Coches;

public class CocheCRUDImpl implements CocheCRUD {

    String marca;
    String color;
    double peso;
    double cilindrada;
    boolean aireAcond;
    int precio;



    public CocheCRUDImpl() {
    }


    public CocheCRUDImpl(String marca, String color, double peso, double cilindrada, boolean aireAcond, int precio) {
        this.marca = marca;
        this.color = color;
        this.peso = peso;
        this.cilindrada = cilindrada;
        this.aireAcond = aireAcond;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", cilindrada=" + cilindrada +
                ", aireAcond=" + aireAcond +
                ", precio=" + precio +
                '}';
    }

    @Override
    public void saved() {
        System.out.println("save()");
    }

    @Override
    public void findAll() {
        System.out.println("findAll()");
    }

    @Override
    public void deleted() {
        System.out.println("deleted()");
    }
}
