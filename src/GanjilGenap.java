public class GanjilGenap {
    public static void main(String[] args) {
int Nomor[] ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
System.out.println("bilangan genap");
for (int A = 0; A< Nomor.length; A++){
    if(Nomor[A]%2 == 0){
        System.out.println(Nomor[A]);

        System.out.println("bilangan ganjil");
        for (int i = 0; i< Nomor.length; i++){
            if (Nomor[i]%2!= 0){
                System.out.println(Nomor[i]);
            }
        }


    }
}
    }
}
