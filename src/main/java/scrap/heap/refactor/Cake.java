package scrap.heap.refactor;

public final class Cake extends Product{
    private Flavor flavor;
    private Shape shape;
    private Size size;
    private Color color;
    private Flavor frostingFlavor;
    
    public static enum Size {
        Small,
        Medium,
        Large,
        XLarge,
        XXLarge
    }
    
    public static enum Shape {
        Rectangle,
        Square,
        Circle,
        Elipse,
        Triangle,
    }
    
    public static enum Color {
        White,
        Brown,
        Yellow
    }
    
    public static enum Flavor {
        Chocolate,
        Vanilla,
        Strawberry,
        Lavender
    }
    
    public static final class Builder {
        private Cake cake;
        
        public Builder(Flavor flavor, Size size, Shape shape) {
            cake = new Cake(flavor, size, shape);
        }
        
        public Builder chooseFrostingFlavor(Flavor f) {
            cake.frostingFlavor = f;
            cake.price += 5.0;
            return this;
        }
        
        public Builder chooseColor(Color c) {
            cake.color = c;
            cake.price += 3.0;
            return this;
        }
        
        public Cake build() {
            return cake;
        }
    }
    
    public Cake(Flavor flavor, Size size, Shape shape) {
        this.flavor = flavor;
        this.size = size;
        this.shape = shape;

        // default
        this.frostingFlavor = Flavor.Vanilla;
        this.color = Color.White;

        switch (size) {
        case Small:
            price = 10.0;
            break;
        case Medium:
            price = 15.0;
            break;
        case Large:
            price = 20.0;
            break;
        case XLarge:
            price = 30.0;
            break;
        case XXLarge:
            price = 40.0;
            break;
        default:
            throw new RuntimeException("Unexpected size");
        }
    }

    public Flavor getFlavor() {
        return flavor;
    }

    public Shape getShape() {
        return shape;
    }

    public Size getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    public Flavor getFrostingFlavor() {
        return frostingFlavor;
    }

    @Override
    public String toString() {
        return "Cake [flavor=" + flavor + ", shape=" + shape + ", size=" + size + ", color=" + color
                + ", frostingFlavor=" + frostingFlavor + ", price=" + price + "]";
    }
}
