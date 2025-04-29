public class Main {
    public static void main(String[] args) {

        Hogwarts[] hogwarts = {
                new Hogwarts("Гарри Поттер", 45, 30),
                new Hogwarts("Гермиона Грейнджер", 90,75),
                new Hogwarts("Рон Уизли", 38, 42),
                new Hogwarts("Драко Малфой", 41, 50),
                new Hogwarts("Грэхэм Монтегю", 57, 47),
                new Hogwarts("Грегори Гойл", 48, 95),
                new Hogwarts("Захария Смит,", 78, 58),
                new Hogwarts("Седрик Диггори", 67, 95),
                new Hogwarts("Джастин Финч-Флетчли", 79,50),
                new Hogwarts("Чжоу Чанг", 66, 44),
                new Hogwarts("Падма Патил", 77, 33),
                new Hogwarts("Маркус Белби", 67, 78)
        };

        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", 45, 30, 58,
                        61, 63),
                new Gryffindor("Гермиона Грейнджер", 90,75, 57,
                        81, 57),
                new Gryffindor("Рон Уизли", 38, 42, 81,
                        70, 56),
        };

        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 41, 50, 79, 82,
                        99, 47, 72),
                new Slytherin("Грэхэм Монтегю", 57, 47, 29, 95,
                        48, 85,78),
                new Slytherin("Грегори Гойл", 48, 95, 62, 48,
                        11, 60, 86),
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит,", 78, 58, 30, 74,
                        60),
                new Hufflepuff("Седрик Диггори", 67, 95, 38, 81,
                        78),
                new Hufflepuff("Джастин Финч-Флетчли", 79,50, 30, 51,
                        77),
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 66, 44, 39, 88, 44,
                        80),
                new Ravenclaw("Падма Патил", 77, 33, 55, 22, 88,
                        99),
                new Ravenclaw("Маркус Белби", 67, 78, 89, 91, 12,
                        23)
        };

        StudentService studentService = new StudentService();
        studentService.print(gryffindors);
        studentService.print(slytherins);
        studentService.print(hufflepuffs);
        studentService.print(ravenclaws);
        System.out.println();
        System.out.println(studentService.compareForTheBest(slytherins[0], hufflepuffs[2]));

    }



}