class Point{
    private double x;
    private double y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }   

    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }

    public double distanceTo(Point bPoint) {
        double dx = x - bPoint.x;
        double dy = y - bPoint.y;
        double distance = Math.sqrt(dx*dx + dy*dy);
        return distance;
    }

    public double distanceToOrigin() {
        Point origin = new Point(0.0,0.0);
        return distanceTo(origin);
    }

    private Point moveTo(double x, double y) {
        this.x = x;
        this.y = y;
        Point movedPoint = new Point(x,y);
        return movedPoint;
    }

    public double getMovedX() {
        return this.x;
    }

    public double getMovedY() {
        return this.y;
    }


    public Point clone() {
        Point clone = new Point(this.x, this.y);
        return clone;
    }

    private Point opposite() {
        Point oppositePoint = new Point(this.x * - 1, this.y * - 1);
        return oppositePoint;
    }
    public static void main(String[] args) {
        Point aPoint = new Point(5.0,3.0);
        Point bPoint = new Point(9.0,8.0);
        System.out.println("Point A is: " + aPoint.getX() + (" ") + aPoint.getY());
        System.out.println("Point B is: " + bPoint.getX() + (" ") + bPoint.getY());
        System.out.println("Distance between Point A and Point B is: " + aPoint.distanceTo(bPoint));
        System.out.println("Distance between Point A and Origin is: " + aPoint.distanceToOrigin());
        System.out.println("Distance between Point B and Origin is: " + bPoint.distanceToOrigin());
        System.out.println("Point A moved to :" + aPoint.moveTo(2.0,2.0));
        System.out.println("Point A is now: " + aPoint.getMovedX() + (" ") + aPoint.getMovedY());
        System.out.println("I'm a cloned Point: " + bPoint.clone() + " and I'm the opposite: " + bPoint.opposite());
    }
}