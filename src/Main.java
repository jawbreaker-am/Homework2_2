//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("\nЗадача 1:");
        int v1 = 0;
        byte v2 = 0;
        short v3 = 0;
        long v4 = 0L;
        float v5 = 0.0f;
        double v6 = 0.0;
        System.out.println("Значение переменной v1 с типом int равно " + v1);
        System.out.println("Значение переменной v2 с типом byte равно " + v2);
        System.out.println("Значение переменной v3 с типом short равно " + v3);
        System.out.println("Значение переменной v4 с типом long равно " + v4);
        System.out.println("Значение переменной v5 с типом float равно " + v5);
        System.out.println("Значение переменной v6 с типом double равно " + v6);

        //Задача 2
        System.out.println("\nЗадача 2:");
        float vv1 = 27.12f;
        long vv2 = 987678965549L;
        double vv3 = 2.786;
        int vv4 = 569;
        short vv5 = -159;
        short vv6 = 27897;
        byte vv7 = 67;
        System.out.println("Значение переменной vv1 с типом float равно " + vv1);
        System.out.println("Значение переменной vv2 с типом long равно " + vv2);
        System.out.println("Значение переменной vv3 с типом double равно " + vv3);
        System.out.println("Значение переменной vv4 с типом int равно " + vv4);
        System.out.println("Значение переменной vv5 с типом short равно " + vv5);
        System.out.println("Значение переменной vv6 с типом short равно " + vv6);
        System.out.println("Значение переменной vv7 с типом byte равно " + vv7);

        //Задача 3
        System.out.println("\nЗадача 3:");
        byte classLudmilaPalna = 23;
        byte classAnnaSergevna = 27;
        byte classKaterinaAndrevna = 30;
        short totalPaperPieces = 480;
        int unitPaperPieces = totalPaperPieces/(classLudmilaPalna+classAnnaSergevna+classKaterinaAndrevna);
        System.out.println("На каждого ученика рассчитано " + unitPaperPieces + " листов бумаги");

        //Задача 4
        System.out.println("\nЗадача 4:");
        int productivity2Min = 16;
        int productivityMin = productivity2Min/2;
        int productivity20Min = productivityMin*20;
        System.out.println("За 20 минут машина произвела " + productivity20Min + " штук бутылок");
        int productivityDay = productivityMin*60*24;
        System.out.println("За сутки машина произвела " + productivityDay + " штук бутылок");
        int productivity3Days = productivityDay*3;
        System.out.println("За 3 дня машина произвела " + productivity3Days + " штук бутылок");
        int productivityMonth = productivityDay*30;
        System.out.println("За месяц машина произвела " + productivityMonth + " штук бутылок");

        //Задача 5
        System.out.println("\nЗадача 5:");
        int totalClasses = 120/(2+4);
        int totalWhiteJars = totalClasses*2;
        int totalBrownJars = totalClasses*4;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteJars + " банок белой краски и " + totalBrownJars + " банок коричневой краски");

        //Задача 6
        System.out.println("\nЗадача 6:");
        int massG = 5*80 + 200/100*105 + 2*100 + 4*70;
        float massKg = (float) massG/1000;
        System.out.println("Масса завтрака спортсмена в граммах " + massG);
        System.out.println("Масса завтрака спортсмена в килограммах " + massKg);

        //Задача 7
        System.out.println("\nЗадача 7:");
        float maxDays = (float) 7*1000/250;
        float minDays = (float) 7*1000/500;
        float avgDays = (float) (maxDays+minDays)/2;
        System.out.println("Если худеть на 250 грамм в день, для достижения цели потребуется " + maxDays + " дней");
        System.out.println("Если худеть на 500 грамм в день, для достижения цели потребуется " + minDays + " дней");
        System.out.println("В среднем для достижения цели потребуется " + avgDays + " дней");

        //Задача 8
        System.out.println("\nЗадача 8:");
        int oldSalaryMasha = 67760;
        int oldSalaryDenis = 83690;
        int oldSalaryKristina = 76230;
        double newSalaryMasha = oldSalaryMasha*1.1;
        double newSalaryDenis = oldSalaryDenis*1.1;
        double newSalaryKristina = oldSalaryKristina*1.1;
        double yearDiffMasha = 12*oldSalaryMasha*0.1;
        double yearDiffDenis = 12*oldSalaryDenis*0.1;
        double yearDiffKristina = 12*oldSalaryKristina*0.1;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + yearDiffMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + yearDiffDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + yearDiffKristina + " рублей");
    }
}