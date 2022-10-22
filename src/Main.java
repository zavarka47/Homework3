public class Main {
    public static void main(String[] args) {

        System.out.println("Exercise 1");
        byte b1 = 127;
        System.out.println("Значение переменной b c типом byte равно " + b1);
        short s1 = 32767;
        System.out.println("Значение переменной s c типом short равно " + s1);
        int i1 = 2147483647;
        System.out.println("Значение переменной i c типом int равно " + i1);
        long l1 = 922337203685477580L;
        System.out.println("Значение переменной l c типом long равно " + l1);
        float f1 = 3.4f;
        System.out.println("Значение переменной f c типом float равно " + f1);
        double d1 = 1.7d;
        System.out.println("Значение переменной d c типом double равно " + d1);

        System.out.println("Exercise 2");
        byte b21 = 67;
        System.out.println("Значению " + b21 + " может соответствовать тип byte");
        short s2 = -159;
        System.out.println("Значению " + s2 + " может соответствовать тип short");
        int i2 = 27897;
        System.out.println("Значению " + i2 + " может соответствовать тип int");
        long l2 = 987678965549L;
        System.out.println("Значению " + l2 + " может соответствовать тип long");
        float f2 = 27.12f;
        System.out.println("Значению " + f2 + " может соответствовать тип float");
        int c2 = 2_786;
        System.out.println("Значению " + c2 + " может соответствовать тип char");
        boolean b22 = false;
        System.out.println("Значению " + b22 + " может соответствовать тип boolean");

        System.out.println("Exercise 3");
        byte LNStudents = 23;
        System.out.println("У Людмилы Николаевны " + LNStudents + " ученика в классе");
        short ASStudents = 27;
        System.out.println("У Анны Сергеевны " + ASStudents + " учеников в классе");
        int EAStudents = 30;
        System.out.println("У Екатерины Андреевны " + LNStudents + " учеников в классе");
        int allQuentityStudent = LNStudents+ASStudents+EAStudents;
        System.out.println("Всего учеников у трех учителей " + allQuentityStudent);
        int papers = 480;
        int papersOneStudent = papers/allQuentityStudent;
        System.out.println("На каждого ученика рассчитано "+ papersOneStudent+ " листов бумаги");

        System.out.println("Exercise 4");
        int productivity2minute = 16;
        System.out.println("За 2 минуты работы, машина произвела " + productivity2minute + " бутылок");
        int productivity1minuty = productivity2minute / 2;
        int productivity20minute = productivity1minuty * 20;
        System.out.println("За 20 минут работы, машина произвела " + productivity20minute + " бутылок");
        int productivityOneDay = productivity1minuty * 60 * 24;
        System.out.println("За сутки работы, машина произвела " + productivityOneDay + " бутылок");
        int productivityThreeDay = productivityOneDay*3;
        System.out.println("За 3 дня работы, машина произвела " + productivityThreeDay + " бутылок");
        int productivityOneMonth = productivityOneDay * 30;
        System.out.println("За месяц работы, машина произвела " + productivityOneMonth + " бутылок");

        System.out.println("Exercise 5");
        int whitPotPaintOneRoom = 2;
        int brownPotPaintPotRoom = 4;
        int potsPaint = 120;
        int rooms = potsPaint / (whitPotPaintOneRoom + brownPotPaintPotRoom);
        int whitPotsPaint = whitPotPaintOneRoom * rooms;
        int brownPotsPaint = brownPotPaintPotRoom*rooms;
        System.out.println("В школе, где " + rooms + " классов, нужно " + whitPotsPaint + " банок белой краски и " + brownPotsPaint + " банок коричневой краски");

        System.out.println("Exercise 6");
        int wightBanana = 80;
        int quantityBanana = 5;

        int wightMilk = 150;
        int quantityMilk = 2;

        int wightIceCream = 100;
        int quantityIceCream = 2;

        int wightEgg = 70;
        int quantityEggs = 4;

        float wightbreakfast = wightBanana * quantityBanana + wightMilk * quantityMilk + wightIceCream * quantityIceCream + wightEgg * quantityEggs;
        wightbreakfast = wightbreakfast/1000;
        System.out.println("Завтрак спортсмена весит " + wightbreakfast + " кг");
        // Вы слишком много кушаете

        System.out.println("Exercise 7");
        int purpose = 7;
        float way1WightLoss = 0.25f;
        float way2WightLoss = 0.5f;
        float timeWay1 = purpose/way1WightLoss;
        System.out.println("Если спортсмен каждый день будет худеть на 250 гр, то на 7 кг он похудеет за " + timeWay1 + " дней");
        float timeWay2 = purpose/way2WightLoss;
        System.out.println("Если спортсмен каждый день будет худеть на 500 гр, то на 7 кг он похудеет за " + timeWay2 + " дней");
        float middleTimeWightLoss = (timeWay1 + timeWay2)/2;
        System.out.println("В среднем спортсмен похудеет за " + middleTimeWightLoss + " дней");

        System.out.println("Exercise 8");
        int mariaIncome = 67_760;
        int denisIncome = 83_690;
        int cristinIncome = 76_230;
        float upIncome = 1.1f;

        float mariaUpIncome = mariaIncome * upIncome;
        float denisUpIncome = denisIncome * upIncome;
        float cristinUpIncome = cristinIncome * upIncome;

        float mariaChangeIncome = (mariaUpIncome - mariaIncome) * 12;
        float deniseChangeIncome = (denisUpIncome - denisIncome) * 12;
        float cristinChangeIncome = (cristinUpIncome - cristinIncome) * 12;

        System.out.println("Маша теперь получает " + mariaUpIncome + " рублей. Годовой доход вырос на " + mariaChangeIncome + " рублей");
        System.out.println("Денис теперь получает " + denisUpIncome + " рублей. Годовой доход вырос на " + deniseChangeIncome + " рублей");
        System.out.println("Кристина теперь получает " + cristinUpIncome + " рублей. Годовой доход вырос на " + cristinChangeIncome + " рублей");

        //Homework done
    }
}