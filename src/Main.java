import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задание: 9) Определить язык на котором написан текст (из двух - русский и англ)
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        boolean isRus = false;
        boolean isEng = false;
        boolean isErr = false;
        for (int i = 0; i <= text.length() - 1; i++) {
            if ((text.charAt(i) >= 65 && (text.charAt(i) <= 122))) {
                isEng = true;
            } else if (((text.charAt(i) >= 1040 && (text.charAt(i) <= 1103)))) {
                isRus = true;
            } else if ((text.charAt(i) <= 65 || (text.charAt(i) >= 122))) {
                isErr = true;
            }
        }
        if (isEnglish(isRus, isEng, isErr)) {
            System.out.println("Данный текст написан на английском");
        } else if (isRussian(isRus, isEng, isErr)) {
            System.out.println("Данный текст написан на русском");
        } else if (isErr) {
            System.out.println("Строка не содержит искомый язык или содержит недопустимый символ");
        }
    }

    private static boolean isRussian(boolean markerRus, boolean markerEng, boolean markerErr) {
        return markerRus && !markerEng && !markerErr;
    }

    private static boolean isEnglish(boolean markerRus, boolean markerEng, boolean markerErr) {
        return markerEng && !markerRus && !markerErr;
    }
}