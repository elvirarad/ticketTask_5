import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        String[][] book = {{"Война миров", "Гэрберт Уэлс"}, {"Судьба человека", "Михаил Александрович Шолохов"},{"Понедельник начинается в субботу", "Стругацкие"}, {"Посёлок", "Кир Булычёв"},{"Идиот", "Федр Михайлович Достоевский"}};
        int k = 0;
        int i = 0;
        StringBuilder[] bookAuthtor = new StringBuilder[book.length];
        while (i < book.length) {
            bookAuthtor[i] = new StringBuilder("<<");
            bookAuthtor[i].append(book[i][0]);
            bookAuthtor[i].append(">> ");
                String  authtor[] = book[i][1].split(" ");
                for (k = 0; k < authtor.length - 1; k++) {
                    char name = authtor[k].charAt(0);
                    bookAuthtor[i].append(name);
                    bookAuthtor[i].append(".");
                }
            bookAuthtor[i].append(authtor[k]);
            i++;
            }
        for (StringBuilder stringBuilder : bookAuthtor) {
            System.out.println(stringBuilder);
        }
        }
    }
