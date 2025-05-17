import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Tema> tema = new CopyOnWriteArrayList<>();
        tema.add(new Tema("Lectura comprensiva", 2));
        tema.add(new Tema("Matemáticas básicas", 1));
        tema.add(new Tema("Cuidado del medio ambiente", 3));

        Collections.sort(tema);
        System.out.println("📚 Temas ordenados de forma alfabética:");
        for (Tema i : tema) {
            System.out.println(i);
        }
        tema.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema a, Tema b) {
                return Integer.compare(a.prioridad, b.prioridad);
            }
        });
        System.out.println("\n🧠 Temas ordenados por prioridad:");
        for (Tema t : tema) {
            System.out.println(t);
        }

        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");

        System.out.println("\n💻 Repositorio de recursos:");
        for (String temas : recursos.keySet()) {
            System.out.println(temas + ": " + recursos.get(temas));
        }
    }
}

