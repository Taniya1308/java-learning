public class ShiftOperators{
    public static void main(String[] args){
        int x = 5;
        System.out.println(x << 1);  //left shift
        int y = 10;
        System.out.println(y >> 1);  //right shift
        int z = -8;
        System.out.println(z >>> 1);  //unsigned right shift
    }
}

// left shift
// x << 1 ≈ x × 2 
// x << 2 ≈ x × 4

// right shift
// x >> 1 ≈ x / 2 
// x >> 2 ≈ x / 4

