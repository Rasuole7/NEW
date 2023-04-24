
    public class Main{
    public static void main(String[] args){

int[] arr = {5, 10, 15, 20, 25};
int count = 0;
int max = arr[0];
arr[2] = 30;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] > 10) {
        count++;
    }

        }
        System.out.println("Masyvo elementų, didesnių nei 10, skaičius yra: " + count);

for (int i = 1; i < arr.length; i++){
    if(arr[i] > max) {
        max = arr[i];
    }
}
        System.out.println("Didžiausia reikšmė masyve yra: " + max);

for(int i = 0; i < arr.length; i++){
    System.out.println(arr[i] + "");
}
    }
}