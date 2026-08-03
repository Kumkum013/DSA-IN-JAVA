public class GcdOfNumber {
    public int gcd(int n1, int n2) {
        int answer = 1;
        int min = Math.min(n1, n2);
        for(int i = 1; i <= min; i++) {
            if(n1 % i == 0 && n2 % i == 0) {
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        GcdOfNumber obj = new GcdOfNumber();
        System.out.println(obj.gcd(12, 15));
    }
    
}
