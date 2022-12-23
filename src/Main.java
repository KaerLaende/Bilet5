public class Main {
    public static void main(String[] args) {

        String[] doubleAuthor = {"Михаил Булгаков", "Мастер и Маргарита", "Михаил Булгаков", "Собачье сердце", "Николай Гоголь", "Мёртвые души"};
        System.out.println("===========================");
        for (int i = doubleAuthor.length-1; i >=0 ; i--) {
            if (i % 2 != 0) {
                System.out.print('"'+doubleAuthor[i] +'"'+ " ");
            } else {System.out.print(doubleAuthor[i]+'.' + '\n' );}
        }
        System.out.println("===========================");
    }


}