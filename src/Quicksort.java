public class Quicksort {
    public static void main(String[] args) {
      int vetor[] = {5,17,3,22,9,1,10};
      int aux =0;
      for(int a = 0; a< vetor.length; a++ ) {
          for(int b= 0; b<vetor.length; b++) {
            if(vetor[a] <vetor[b]) {
              aux = vetor[a];
              vetor[a] = vetor[b];
              vetor[b] = aux;
            }
          }
      }
      for(int i=0;i<vetor.length;i++) {
        System.out.println(vetor[i]);
      }
      }
  }