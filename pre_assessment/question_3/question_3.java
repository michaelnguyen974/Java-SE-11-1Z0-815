public class Question_3 {

    public static void main(String[] args) {
    int moon = 9, // moon = 9
    star = 2 + 2 * 3; //star = 8
    float sun = star > 10 ? 1 : 3; //8 is not greater than 10 so false, so sun = 3
    double jupiter = (sun + moon) - 1.0f; // sun + moon = 3 + 9 - 1.0 = 11.0, so jupiter = 11.0
    int mars = --moon <= 8 ? 2 : 3; // mars = 2
    System.out.println(sun+"-"+jupiter+"-"+mars); // 3-11.0-3
    }

}


