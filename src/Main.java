import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Actividad Mirando el pasado- Marcas");
        showBrands();
        System.out.println("\nActividad Mirando el pasado- Lista de invitados ");
        showGuests();
        System.out.println("\nActividad Mirando el pasado- Golosinas ");
        showSweets();
        System.out.println("\nActividad Mirando el pasado- Juegos ");
        showGames();
    }

    private static void showBrands() {
        ArrayList<String> marcas = new ArrayList<String>();
        ArrayList<String> posiblesMarcas = new ArrayList<String>();
        marcas.add("Remington");
        marcas.add("BlackBurry");
        marcas.add("Viceroy");
        marcas.add("Panamerican Airlines");
        marcas.add("Sony Ericsson");
        marcas.add("MSN Messenger");
        marcas.add("Concorde, avion");
        marcas.add("Napster, Internet");
        marcas.add("General Motors");
        marcas.add("Kodak");
        System.out.println(marcas);
        marcas.add("Blokbaster");
        marcas.add("Carrefour");
        marcas.add("Jeti");
        System.out.println(marcas);
        marcas.set(10,"Blockbuster");
        System.out.println(marcas);
        String elementRemoved = marcas.remove (11);
        System.out.println("El elemento eliminado es " + elementRemoved);
        System.out.println(marcas);
        posiblesMarcas.add("lg");
        posiblesMarcas.add("jonshon");
        posiblesMarcas.add("huawei");
        marcas.addAll(posiblesMarcas);
        System.out.println(marcas);
        System.out.println(marcas.size());
    }

    private static void showGuests() {
    Set<String> invitados =new TreeSet<String>();
    Set<String> posiblesInvitados = new TreeSet<String>();
    invitados.add("Daniel");
    invitados.add("Paola");
    invitados.add("Facundo");
    invitados.add("Pedro");
    invitados.add("Jacinta");
    invitados.add("Florencia");
    invitados.add("Juan Pablo");
    posiblesInvitados.add("Jorge");
    posiblesInvitados.add("Francisco");
    posiblesInvitados.add("Marcos");
    invitados.addAll(posiblesInvitados);
    System.out.println(invitados);
    invitados.remove("Jorge");
    System.out.println(invitados);
    }

    private static void showSweets() {
    Map<String,Integer> sweets = new TreeMap<String,Integer>();
    sweets.put("chocman", 100);
    sweets.put("trululú", 100);
    sweets.put("Centella", 100);
    sweets.put("Kilate", 50);
    sweets.put("Miti-miti", 30);
    sweets.put("Traga-traga", 150);
    sweets.put("Tableton", 5);
    int threshold = 100;
    Map<String,Integer> filteredSweets = new TreeMap<String, Integer>();
        for (Map.Entry<String,Integer> entry : sweets.entrySet()) {
            if (entry.getValue() < threshold) {
                filteredSweets.put(entry.getKey(), entry.getValue());
            }
        }
        System.out.println("Lista filtrada:" + filteredSweets);
    }

    private static void showGames() {
        Queue<String> juegos = new LinkedList<String>();
        juegos.add("Tombo");
        juegos.add("Congelado");
        juegos.add("Quemaditas");
        juegos.add("Cachipún");
        juegos.add("Pillarse");
    System.out.println (juegos.size());
    System.out.println(juegos);

    }



}










