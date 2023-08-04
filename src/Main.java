public class Main {
    public static void main(String[] args) {
        Direction whereToGo = Direction.NORTH;
        if(whereToGo == Direction.SOUTH)
            System.out.println("vperedi pingviny");
        if (whereToGo == Direction.NORTH)
            System.out.println("BEARS!!");

        whereToGo = Direction.EAST;
        System.out.println(whereToGo);
        whereToGo=Direction.WEST;

        Robot robot = new Robot(2,3, Direction.NORTH);
        System.out.println(robot);
    }
}

enum Direction{
    NORTH, SOUTH, EAST, WEST
}