public class Main {
        public static void main(String[] args) {
            int[] arreglo={3,5,7,9,1,3,7,5,10,34,12,345,567,234,67,23,23,23,1};
            int[] arregloOriginal=new int[arreglo.length];
            for(int l=0; l<arreglo.length; l++){
                arregloOriginal[l]=arreglo[l];

            }
            for(int i = 0; i < (arreglo.length); i++) {
                for (int c = 0; c < (arreglo.length) - 1; c++) {
                    int temp = 0;
                    if (arreglo[c + 1] > arreglo[c]) {
                        temp = arreglo[c];
                        arreglo[c] = arreglo[c + 1];
                        arreglo[c + 1] = temp;
                    }
                }

            }
            System.out.println("Arreglo original:");
            for(int o:arregloOriginal){
                System.out.print(o+" ");
            }
            System.out.println();
            System.out.println("Arreglo ordenado");
            for(int a:arreglo){
                System.out.print(a+" ");
            }
        }
    }
