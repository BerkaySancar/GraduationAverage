import java.util.Scanner;

public class GraduationCalculator {
    public static void main(String[] args) {
         /*
         
        Kullanıcıdan Matematik,Fizik,Türkçe,Kimya ve Müzik sınav puanlarını al.

        Not ortalamsı 55 ve üzeri ise sınıfı geçti, altı ise sınıfta kaldı şeklinde yazdır.

        0 ile 100 arasında olmayan ders notlarını ortalamaya katma..

         */
        Scanner input = new Scanner(System.in);
        double math, physic, tr, chem, music, average;
        System.out.print("Matematik notunuz: ");
        math = input.nextDouble();
        System.out.print("Fizik notunuz: ");
        physic = input.nextDouble();
        System.out.print("Türkçe notunuz: ");
        tr = input.nextDouble();
        System.out.print("Kimya notunuz: ");
        chem = input.nextDouble();
        System.out.print("Müzik notunuz: ");
        music = input.nextDouble();
        int totalCalculatedLesson = 0;
        double totalCalculatedLessonPoint = 0;

        if (math > 0 && math < 100) {
            totalCalculatedLesson++;
            totalCalculatedLessonPoint = totalCalculatedLessonPoint + math;
        }

        if (physic > 0 && physic < 100) {
            totalCalculatedLesson++;
            totalCalculatedLessonPoint += physic;
        }

        if (tr > 0 && tr < 100) {
            totalCalculatedLesson++;
            totalCalculatedLessonPoint += tr;
        }

        if (chem > 0 && chem < 100) {
            totalCalculatedLesson++;
            totalCalculatedLessonPoint += chem;
        }

        if (music > 0 && music < 100) {
            totalCalculatedLesson++;
            totalCalculatedLessonPoint += music;
        }
        double result = totalCalculatedLessonPoint / totalCalculatedLesson;
        if (result >= 55) {
            System.out.print("Ortalamanız: " + result + "Sınıfı geçtiniz..");
        } else {
            System.out.print("Ortalamanız: " + result + "Sınıfta kaldınız.");
        }
    }
}
