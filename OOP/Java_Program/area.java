class area{
    public double determine_area(double side)
    {
        return side * side;
    }
    public double determine_area(double radius)
    {
        return 3.14*radius*radius;
    }
    public double determine_area(double height,double breadth)
    {
        return height * breadth;
    }
    public static void main(string[] args) {
        System.out.println("1.Square  2.Circle 3.Rectangle 4.Triangle");
        Scanner reader = new Scanner(System.in);
        int choice = reader.nextInt()
        switch(choice)
        {
            case 1:
                          
        }

    }
}