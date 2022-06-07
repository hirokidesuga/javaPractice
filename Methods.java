public class Methods {
    public static void main(String[] args) {
    }
    
    // 最小公倍数
    static int lcm (int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("エラー：実引数の要素に0が含まれている");
            System.exit(0);
        }
        
        int temp;
        long c = a * b;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }

        return (int)(c/b);
    }

    // 最大公約数
    static int gcd (int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("エラー：実引数の要素に0が含まれている");
            System.exit(0);
        }

        int temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }

        return b;
    }

    // 文字列配列を整数配列に変換
    static int[] stringArrayToIntArray(String[] stringArray) {
        int stringArrayLength = stringArray.length;
        
        if (stringArrayLength <= 0) {
            System.out.println("エラー：配列の要素数が0以下");
            System.exit(0);
        }

        int[] intArray = new int[stringArrayLength];
        for (int i=0; i<stringArrayLength; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        
        return intArray;
    }
}