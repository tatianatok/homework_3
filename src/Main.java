public class Main {
    public static void main(String[] args) {
        int age=17;
        if (age>=18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age<18)  {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }

        int shcool=5;
        if (shcool>=7) {
            System.out.println("Ребенок ходит в школу");
        }
        if (shcool<7) {
            System.out.println("Ребенок НЕ ходит в школу");
        }

        int univercity=10;
        if (univercity>18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (univercity<18) {
            System.out.println("Человек еще не закончил школу");
        }
        int job=15;
        if (job>24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        if (job<24) {
            System.out.println("Человек еще учится в универитете");
        }
        int train=30;
        if (train>=60) {
            System.out.println("В вагоне закончились сидячие места. Можно приобрести стоячее место.");
        }
        if (train>102) {
            System.out.println("В вагоне нет свободных мест.");
        }
        if (train<60) {
            System.out.println("В вагоне есть свободные сидячие места.");
        }
        int ageElse=25;
        if (ageElse>=18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }

        int shcoolElse=9;
        if (shcoolElse>=7) {
            System.out.println("Ребенок ходит в школу");
        } else {
            System.out.println("Ребенок НЕ ходит в школу");
        }

        int univercityElse=25;
        if (univercityElse>18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else {
            System.out.println("Человек еще не закончил школу");
        }
        int jobElse=35;
        if (jobElse>24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        } else {
            System.out.println("Человек еще учится в универитете");
        }
        int trainElse=30;
        if (trainElse>=60) {
            System.out.println("В вагоне закончились сидячие места. Можно приобрести стоячее место.");
        } else {
            System.out.println("В вагоне есть свободные сидячие и стоячие места.");
        }
        int goToInfantSchool=3;
        if (goToInfantSchool>2 && goToInfantSchool<7) {
            System.out.println("Если возраст человека равен " + goToInfantSchool + " то ему нужно ходить в детский сад ");
        } else {
            System.out.println("Человек не ходит в детский сад");
        }
        int goToSchool=15;
        if (goToSchool>7 && goToSchool<18) {
            System.out.println("Если возраст человека равен " + goToSchool + ", то ему нужно ходить в школу.");
        } else {
            System.out.println("Человек не ходит в школу");
        }
        int goToUnivercity=20;
        if (goToUnivercity>18 && goToUnivercity<24) {
            System.out.println("Если возраст человека равен "+ goToUnivercity + ", то ему нужно ходить университет ");
        } else {
            System.out.println("Человек не ходит в университет");
        }

        int goToJob=35;
        if (goToJob>24) {
            System.out.println("Если возраст человека равен " + goToJob + ", то ему нужно ходить на работу");
        }

        int ageAttraction=25;
        if (ageAttraction<5) {
            System.out.println("Кататься на аттракционе нельзя!");
        }
        if (ageAttraction >5 && ageAttraction<14) {
            System.out.println("Можно кататься только в сопровождении взрослого.");
        }
        if (ageAttraction>14) {
            System.out.println("Можно кататься без сопровождения взрослого");
        }

        int one=1;
        int two=2;
        int three=3;
        if (one<two || two<three) {
            System.out.println("Большее из чисел " + three);

        }
    }
}