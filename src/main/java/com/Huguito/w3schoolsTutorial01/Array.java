import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> cat = new LinkedList<String>();
        cat.add("Volvo");
        cat.add("BMW");
        cat.add("Ford");
        cat.add("Mazda");

        System.out.println(cat);





        ArrayList<Integer> my = new ArrayList<Integer>();
        my.add(10);
        my.add(15);
        my.add(20);
        my.add(25);

        for(int i : my){
            System.out.println(i);
        }
        System.out.println("*************************************************************");

        ArrayList<String> cad = new ArrayList<String>();
        cad.add("Volvo");
        cad.add("BMW");
        cad.add("Ford");
        cad.add("Mazda");

        Collections.sort(cad);
        for(String i : cad){
            System.out.println(i);
        }
        System.out.println("*************************************************************");

        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(33);
        num.add(15);
        num.add(20);
        num.add(34);
        num.add(8);
        num.add(12);

        Collections.sort(num, Collections.reverseOrder());

        for(int i : num){
            System.out.println(i);
        }

        System.out.println("*************************************************************");
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        cars.add("mototaxi");
        cars.add(0, "bicicleta");

        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
        for(String i : cars){
            System.out.println(i);
        }



        System.out.println(cars.size());

        System.out.println("*************************************************************");

        HashSet<String> car = new HashSet<String>();
        car.add("Volvo");
        car.add("BMW");
        car.add("Ford");
        car.add("BMW");
        car.add("Mazda");

        System.out.println(car);

        HashMap<String, String> capital = new HashMap<String, String>();
        capital.put("England", "London");
        capital.put("Germany", "Berling");
        capital.put("Norway", "Oslo");
        capital.put("USA", "Washinton DC");

        System.out.println(capital);

        System.out.println("*************************************************************");

        ArrayList<String> caty = new ArrayList<String>();
        caty.add("Volvo");
        caty.add("BWM");
        caty.add("Ford");
        caty.add("Mazda");

        Collections.sort(caty, Collections.reverseOrder());

        for(String i : caty){
            System.out.println(i);
        }
        System.out.println("*************************************************************");
        HashSet<String> pu = new HashSet<String>();
        pu.add("Volvo");
        pu.add("BMW");
        pu.add("Ford");
        pu.add("BMW");
        pu.add("Mazda");

        for(String u : pu){

            System.out.println(u);
        }
        System.out.println(pu);

        System.out.println("*************************************************************");

        HashSet<Integer> numm = new HashSet<Integer>();

        numm.add(4);
        numm.add(7);
        numm.add(8);

        for(int i = 1; i < 10; i++){
            if(numm.contains(i)){
                System.out.println(i + " Was found in the set.");
            } else {
                System.out.println(i + " Was not found in the set.");
            }
        }

        System.out.println("*************************************************************");

        var by = new TreeSet<String>();
        by.add("Volvo");
        by.add("BMW");
        by.add("Ford");
        by.add("BMW");
        by.add("Mazda");



        System.out.println(by.size());
        for(String i : by){
            System.out.println(i);
        }

        System.out.println("*************************************************************");

        var fono = new LinkedHashSet<String>();
        fono.add("Volvo");
        fono.add("BMW");
        fono.add("Ford");
        fono.add("BMW"); // duplicado
        fono.add("Mazda");

        System.out.println(fono);


        System.out.println("*************************************************************");

        HashMap<String, String> capi = new HashMap<String, String>();

        capi.put("England", "London");
        capi.put("India", "New Dehli");
        capi.put("Austria", "Wien");
        capi.put("Norway", "Oslo");
        capi.put("Norway", "Oslo");
        capi.put("USA", "Washington DC");

        System.out.println(capi.get("England") + " || " + capi.size() + " || " + capi);
        for(String i : capi.keySet()){
            System.out.println(capi.get(i));
        }

        System.out.println("*************************************************************");

        var pe = new HashMap<String, Integer>();
        pe.put("John", 32);
        pe.put("Steve", 30);
        pe.put("Angie", 33);

        for(String i : pe.keySet()){
            System.out.println("Key: " + i + " value: " + pe.get(i));
        }

        System.out.println("*************************************************************");

        var p = new TreeMap<String, String>();
        p.put("England","London");
        p.put("India","New Dehli");
        p.put("Austria","Wien");
        p.put("Norway","Oslo");
        p.put("USA","Whashinton DC");


        System.out.println(p.get("USA"));
        for(String i : p.values()){
            System.out.println(i);
            System.out.println("Key: " + i + " || Values: " + p.get(i));
        }

        System.out.println("*************************************************************");

        var m = new LinkedHashMap<String, String>();
        m.put("England", "London");
        m.put("India", "New Dehli");
        m.put("Austria", "Wien");
        m.put("Norway", "Oslo");
        m.put("Norway", "Oslo");
        m.put("USA", "Whashinton DC");

        System.out.println(m.get("Norway") + m.size());

        for(String ki : m.keySet()){
            System.out.println("Key: " + ki + " || " + " values: " + m.get(ki));
        }

        System.out.println("*************************************************************");


        ArrayList<String> l = new ArrayList<String>();
        l.add("Volvo");
        l.add("BMW");
        l.add("Ford");
        l.add("Mazda");


        Iterator<String> it = l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("*************************************************************");

        var lu = new ArrayList<Integer>();
        lu.add(12);
        lu.add(8);
        lu.add(2);
        lu.add(23);

        var ti = lu.iterator();
        while(ti.hasNext()){
            Integer g = ti.next();
            if(g < 10){
                ti.remove();
            }
        }
        System.out.println(lu);

        System.out.println("*************************************************************");

        ArrayList<String> names = new ArrayList<>();

        names.add("Liam");
        names.add("Jenny");
        names.add("Kasper");
        names.add("Angie");


        System.out.println(names);

        Collections.sort(names);

        System.out.println(names);
        var te = names.iterator();
        while(te.hasNext()){
            System.out.println(te.next());
        }



        int index = Collections.binarySearch(names, "Kasper");
        System.out.println("Kasper is at index: " + index + names.size());

        System.out.println("*************************************************************");

    }

    public static <T> void printArray(T[] arrey){
        for(T item : arrey){
            System.out.println(item);
        }
    }






}
    public static void mo(String[] args){
        String[] names = {"Jenny", "Liam"};

        Integer[] number = {2, 3, 3, 5};

        System.out.println(names);
        System.out.println(number);

    }

void main() {
}