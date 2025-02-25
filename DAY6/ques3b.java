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
    
    // Method to check if two boxes are identical
    public boolean equals(Box other) {
        return this.width == other.width && this.height == other.height && this.length == other.length;
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Box box1 = new Box();
        Box box2 = new Box(5);
        Box box3 = new Box(3, 4, 5);
        Box box4 = new Box(3, 4, 5);
        
        // Printing volumes
        System.out.println("Volume of Box 1: " + box1.volume());
        System.out.println("Volume of Box 2: " + box2.volume());
        System.out.println("Volume of Box 3: " + box3.volume());
        
        // Checking equality
        System.out.println("Box 3 is identical to Box 4: " + box3.equals(box4));
    }
}
