package scrap.heap.refactor;

import java.time.LocalDateTime;

import scrap.heap.refactor.Cake.Color;
import scrap.heap.refactor.Cake.Flavor;
import scrap.heap.refactor.Cake.Shape;
import scrap.heap.refactor.Cake.Size;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

         //Place birthday party orders
        Customer bruceLee = new Customer("Bruce", "Lee", "415-3723322");
        Cake cake = new Cake.Builder(Flavor.Chocolate, Size.XXLarge, Shape.Elipse)
                .chooseFrostingFlavor(Flavor.Chocolate).chooseColor(Color.Brown).build();
        Order bruce = new Order(bruceLee, LocalDateTime.now());
        bruce.addItem(cake, 1, 0.9);
        bruce.addItem(new Ballon(Ballon.Color.Red, Ballon.Material.Mylar), 4, 0.9);
        System.out.println(bruce);

        Customer jackieChen = new Customer("Jackie", "Chen", "650-7384353");
        cake = new Cake.Builder(Flavor.Vanilla, Size.Medium, Shape.Square)
                .chooseFrostingFlavor(Flavor.Chocolate).chooseColor(Color.Brown).build();
        Order jackie = new Order(jackieChen, LocalDateTime.now());
        jackie.addItem(cake, 1, 0);
        jackie.addItem(new Ballon(Ballon.Color.Blue, Ballon.Material.Latex), 7, 0.9);
        System.out.println(jackie);
        
         Customer jetLi = new Customer("Jet", "Li", "408-53698977");
         cake = new Cake.Builder(Flavor.Vanilla, Size.Small, Shape.Triangle)
                 .chooseFrostingFlavor(Flavor.Lavender).chooseColor(Color.Yellow).build();
         Order jet = new Order(jetLi, LocalDateTime.now());
         jet.addItem(cake, 1, 0.9);
         jet.addItem(new Ballon(Ballon.Color.Red, Ballon.Material.Mylar), 4, 0.9);
         System.out.println(jet);


    }
}
