class Box {
    private double width, height, length;

    // Constructor with no parameters (default values)
    public Box() {
        this.width = 1;
        this.height = 1;
        this.length = 1;
    }

    // Constructor with one parameter (cube case)
    public Box(double side) {
        this.width = this.height = this.length = side;
    }

    // Constructor with three parameters
    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    // Method to calculate volume
    public double volume() {
        return width * height * length;
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Box box1 = new Box();
        Box box2 = new Box(5);
        Box box3 = new Box(3, 4, 5);
        
        // Printing volumes
        System.out.println("Volume of Box 1: " + box1.volume());
        System.out.println("Volume of Box 2: " + box2.volume());
        System.out.println("Volume of Box 3: " + box3.volume());
    }
}
