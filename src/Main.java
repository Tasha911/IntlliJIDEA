public class Main {

    public static void main(String[] args) {
        int eaters = 5; // сколько людей будут есть

        int woter = 3000; //  миллилитров воды
        int potatoes = 5; //  картофелин
        int chicken = 6; //  куринных бедер
        int spices = 10; //  ложек специй

        System.out.println("Сварим суп. На одногочеловека вышло:");
        System.out.println((woter / eaters) + " миллилитров(а) воды");
        System.out.println((potatoes / eaters) + " картофелин(а/ы)");
        System.out.println((chicken / eaters) + " куринных(ое) бедер(ро)");
        System.out.println((spices / eaters) + " ложек(ки/ка) специй");

    }
}