package scrap.heap.refactor;

public final class Ballon extends Product{
    public enum Color {
        Red,
        Blue,
        Yellow,
        White,
        Brown,
        Pink,
        Green,
        Navy
    }
    
    public enum Material {
        Mylar,
        Latex,
        Nylon
    }
    
    private final Color color; 
    private final Material material;
    
    public Ballon(Color color, Material material) {
        this.color = color;
        this.material = material;
        super.price = 5.0;
    }

    @Override
    public String toString() {
        return "Ballon [color=" + color + ", material=" + material + ", price=" + price + "]";
    }

    public Color getColor() {
        return color;
    }

    public Material getMaterial() {
        return material;
    }
    
    public void setPrice(double p) {
        price = p;
    }
}
