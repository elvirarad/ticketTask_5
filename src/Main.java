public class Main {
    public static void main(String[] args) {

        String[][] book = {{"Война миров", "Гэрберт Уэлс"}, {"Судьба человека", "Михаил Александрович Шолохов"},{"Понедельник начинается в субботу", "Стругацкие"}, {"Посёлок", "Кир Булычёв"},{"Идиот", "Федр Михайлович Достоевский"}};
        int k;
        for (int i = 0; i < book.length; i++) {
            System.out.print("<<" + book[i][0] + ">> ");
                String authtor[];
                authtor = book[i][1].split(" ");
                for (k = 0; k < authtor.length - 1; k++) {
                    char name = authtor[k].charAt(0);
                    System.out.print(name + ".");
                }
                String surName = authtor[k];
                System.out.print(surName);
                System.out.println();
            }
        }
}