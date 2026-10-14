public class Problems {
    //Pr60
   static private int n = 12;
   static private int k = 8;
   static int quotient(){
       int res = 0;
       while (n>=k){
           n = n-k;
           res++;
       }
       return res;
   }
   static int remainder(){
       while (n>=k){
           n=n-k;
       }
       return n;
   }
    //Pr61
    static int num = 43;
    static boolean Even(){
        while (num>0){
            int digit = num%10;
            if (digit%2==0){
            return true;
        }
            num = num/10;
        }
        return false;
    }
   //Pr62
    static int n2 = 5;
    static void Pattern(){
        for (int i = 1; i < n2; i++) {
            for (int j = 1; j <= i  ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for (int i = 1; i <=n2 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    //Pr103
    static int n3 = 5;
    static void Letter() {
        char letter = (char) ('A' + n3 - 1);
        for (int i = n3; i >=1 ; i--) {
            for (int j =1; j <= i; j++) {
                System.out.print(letter+" ");
            }
            System.out.println();
            letter--;
        }
    }
    //Pr104
    static int n4=5;
    static void Pattern2(){
        for (int i = 1; i <= n4 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    //Pr105
    static int n5 = 5;
    static void Pattern105(){
        for (int i = n5; i >= 1 ; i--) {
            for (int j = i; j <=n5 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    //Pr106
    static int n6 = 5;
    static void Dioganal(){
        for (int i = 1; i <= n6 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("  ");
            }
            System.out.println(i);
        }
    }
    //Pr107
    static int n107 = 5;
    static void dioganal2(){
        for (int i = n107; i >=1 ; i--) {
            for (int j = n107; j >i ; j--) {
                System.out.print("  ");
            }
            System.out.println(i);
        }
    }
    // Pr108
    static int n108 = 7;
    static void Prime(){
        boolean prime = n108 >= 2;
        int i = 2;
        while (i * i <= n108) {
            if (n108 % i == 0){
                prime = false;
                break;
            }
            i++;
        }
        if (prime){
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
    // Pr109
    static int n109 = 9;
    static void Composite(){
        boolean composite = false;
        int i = 2;
        while (i < n109) {
            if (n109 % i == 0) {
                composite = true;
                break;
            }
            i++;
        }
        if (composite){
            System.out.println("Composite");
        } else {
            System.out.println("Not composite");
        }
    }
    // Pr110
    static void MultiplicationTable(){
        int i = 2;
        while (i <= 9) {
            int j = 1;
            while (j <= 10) {
                System.out.println(i + " * " + j + " = " + i * j);
                j++;
            }
            System.out.println();
            i++;
        }
    }

    // Pr111
    static void OddTables(){
        int i = 1;
        while (i<=9) {
            int j= 1;
            while (j<= 10){
                System.out.println(i + " * " + j + " = " + i * j);
                j++;
            }
            System.out.println();
            i += 2;
        }
    }
    // Pr112
    static void EvenTables(){
        int i = 2;
        while (i <= 8) {
            int j = 1;
            while (j <= 10){
                System.out.println(i + " * " + j + " = " + i * j);
                j++;
            }
            System.out.println();
            i += 2;
        }
    }
    // Pr113
    static int n113 = 5;
    static void Pattern113(){
        int middle=(n113+1)/2;
        for (int i=1; i <= n113; i++){
            for (int j=1; j<=n113; j++) {
                if (i==1 || i==middle || i== n113 || j== 1 || j ==middle || j == n113) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    // Pr114
    static int n114 =4;
    static void Pattern114(){
        for (int i=1; i<=n114; i++) {
            for (int j= 1; j <= n114; j++) {
                if (i ==1 || i == n114 || j == 1 || j == n114) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    // Pr115
    static int n115 = 5;
    static void Pattern115(){
        for (int i =1; i <=n115; i++) {
            for (int j=1; j<= n115; j++) {
                if (j==1 || j==n115 || i ==(n115+1)/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    // Pr116
    static int n116=5;
    static void Pattern116(){
        for (int i = 1; i <= n116; i++) {
            for (int j = 1; j <= n116; j++) {
                if (j == i || j == n116 - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    // Pr117
    static int n117 = 5;
    static void Pattern117(){
        for (int i = n117; i >= 1; i--) {
            for (int j = 1; j <= n117 - i + 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    // Pr118
    static int n118 =5;
    static void Pattern118(){
        for (int i =1; i <= 4; i++) {
            for (int j = 1; j <=n118-1; j++) {
                System.out.print("*   ");
            }
            System.out.println("*");
        }
    }
    // Pr119
    static int n119 =5;
    static void Pattern119(){
        for (int i =n119; i>= 1; i--) {
            for (int j =1; j<= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // Pr120
    static int n120 =5;
    static void Pattern120(){
        for (int i =1; i<=n120; i++) {
            for (int j= 1; j<=n120-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // Pr121
    static int n121=5;
    static void Pattern121(){
        for (int i =n121; i>=1; i--) {
            for (int j=n121; j>i; j--) {
                System.out.print("  ");
            }
            for (int j=1; j<= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // Pr122
    static int n122=5;
    static void Pattern122(){
        for (int i=1; i<=n122; i++) {
            for (int j=1; j<=n122; j++) {
                if (i ==1 || i== n122 || j==1 || j==n122 || i+j==n122+ 1) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    // Pr123
    static int a123=24;
    static int b123=36;
    static int GCD(){
        int a=a123;
        int b=b123;
        while (b!=0) {
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
    // Pr124
    static int[] nums124 ={3, 4, 3, 5, -9};
    static void PositiveCount(){
        int count=0;
        int i=0;
        while (i<nums124.length&&nums124[i]>0) {
            count++;
            i++;
        }
        System.out.println(count);
    }
    // Pr125
    static int a125=12;
    static int b125=18;
    static int LCM(){
        int a=a125;
        int b=b125;
        int x=a;
        int y=b;
        while(y!=0) {
            int r=x%y;
            x=y;
            y=r;
        }
        return (a*b)/x;
    }
    // Pr126
    static int a126=24;
    static int b126=36;
    static void GCDandLCM(){
        int a=a126;
        int b=b126;
        int x=a;
        int y=b;
        while (y!=0) {
            int r=x%y;
            x=y;
            y=r;
        }
        int gcd=x;
        int lcm=(a*b)/gcd;
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
    // Pr127
    static int n127=5;
    static void Sum(){
        double s=0;
        int i=1;
        while (i<=n127){
            s+=1.0/i;
            i++;
        }
        System.out.println("Sum: " + s);
    }
    // Pr128
    static int a128= 2;
    static int b128 =6;
    static void NumberPattern(){
        for (int i=a128+1; i<b128; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(i);
            }
        }
        System.out.println();
    }
    // Pr129
    static int n129 =4;
    static void AtPattern(){
        for (int i=1; i<=n129; i++) {
            for (int j= 1; j<= i; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
    // Pr130
    static int n130=20;
    static void PrimesUpToN(){
        for (int i=2; i<=n130; i++) {
            boolean prime= true;
            int j=2;
            while (j*j<=i) {
                if (i%j== 0) {
                    prime= false;
                    break;
                }
                j++;
            }
            if (prime){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
