public class NombresPremiers {

    public static void main(String[] args) {
        int nombreDeNombresPremiers = 1000;
        genererNombresPremiers(nombreDeNombresPremiers);
    }

    public static void genererNombresPremiers(int nombreDeNombresPremiers) {
        int nombre = 2;
        int compte = 0;

        System.out.println("Les " + nombreDeNombresPremiers + " premiers nombres premiers sont :");

        while (compte < nombreDeNombresPremiers) {
            if (estPremier(nombre)) {
                System.out.print(nombre + " ");
                compte++;
            }
            nombre++;
        }
    }

    public static boolean estPremier(int nombre) {
        if (nombre <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(nombre); i++) {
            if (nombre % i == 0) {
                return false;
            }
        }
        return true;
    }
}
