public class Inverted {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            for (int j = i; j <= 4; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

// public class Inverted {
//     public static void main(String[] args) {

//         for (int i = 1; i <= 4; i++) {

//             for (int j = 5; j>i; j--) {
//                 System.out.print("* ");
//             }

//             System.out.println();
//         }
//     }
// }