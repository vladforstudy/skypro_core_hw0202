public class StudentService {

    public void print(Gryffindor[] gryffindors) {
        System.out.println("Факультет Гриффиндор");
        for (Gryffindor student : gryffindors) {
            System.out.println("Имя: " + student.getName()
                    + "; сила магии: " + student.getWitchcraftPower()
                    + "; расстояние трансгрессии: " + student.getTransgression()
                    + "; благородство: " + student.getNobility()
                    + "; честь : " + student.getHonor()
                    + "; храбрость: " + student.getBravery());
        }
        System.out.println();
    }

    public void print(Slytherin[] slytherins) {
        System.out.println("Факультет Слизерин");
        for (Slytherin student : slytherins) {
            System.out.println("Имя: " + student.getName()
                    + "; сила магии: " + student.getWitchcraftPower()
                    + "; расстояние трансгрессии: " + student.getTransgression()
                    + "; хитрость: " + student.getTrick()
                    + "; решительность: " + student.getDecision()
                    + "; амбициозность: " + student.getAmbition()
                    + "; находчивость : " + student.getIngenuity()
                    + "; жажда власти: " + student.getPowerThirst());
        }
        System.out.println();
    }

    public void print(Hufflepuff[] hufflepuffs) {
        System.out.println("Факультет Пуффендуй");
        for (Hufflepuff student : hufflepuffs) {
            System.out.println("Имя: " + student.getName()
                    + "; сила магии: " + student.getWitchcraftPower()
                    + "; расстояние трансгрессии: " + student.getTransgression()
                    + "; трудолюбие: " + student.getDiligence()
                    + "; верность: " + student.getLoyalty()
                    + "; честность: " + student.getHonesty());
        }
        System.out.println();
    }

    public void print(Ravenclaw[] ravenclaws) {
        System.out.println("Факультет Когтевран");
        for (Ravenclaw student : ravenclaws) {
            System.out.println("Имя: " + student.getName()
                    + "; сила магии: " + student.getWitchcraftPower()
                    + "; расстояние трансгрессии: " + student.getTransgression()
                    + "; ум: " + student.getMind()
                    + "; мудрость: " + student.getWisdom()
                    + "; остроумие: " + student.getWit()
                    + "; творчество: " + student.getCreativity());
        }
        System.out.println();
    }

    public String compareForTheBest(Gryffindor student1, Gryffindor student2) {
        int student1Sum = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int student2Sum = student2.getNobility() + student2.getHonor() + student2.getBravery();

        if (student1Sum > student2Sum) {
            return student1.getName() + " лучший Гриффиндорец, чем " + student2.getName();
        } else if (student1Sum < student2Sum) {
            return student2.getName() + " лучший Гриффиндорец, чем " + student1.getName();
        } else {
            return "Эти Гриффиндорцы равны";
        }
    }

    public String compareForTheBest(Slytherin student1, Slytherin student2) {
        int student1Sum = student1.getTrick() + student1.getDecision() + student1.getAmbition()
                + student1.getIngenuity() + student1.getPowerThirst();
        int student2Sum = student2.getTrick() + student2.getDecision() + student2.getAmbition()
                + student2.getIngenuity() + student2.getPowerThirst();

        if (student1Sum > student2Sum) {
            return student1.getName() + " лучший Слизеринец, чем " + student2.getName();
        } else if (student1Sum < student2Sum) {
            return student2.getName() + " лучший Слизеринец, чем " + student1.getName();
        } else {
            return "Эти Слизеринцы равны";
        }
    }

    public String compareForTheBest(Hufflepuff student1, Hufflepuff student2) {
        int student1Sum = student1.getDiligence() + student1.getLoyalty() + student1.getHonesty();
        int student2Sum = student2.getDiligence() + student2.getLoyalty() + student2.getHonesty();

        if (student1Sum > student2Sum) {
            return student1.getName() + " лучший Пуффендуец, чем " + student2.getName();
        } else if (student1Sum < student2Sum) {
            return student2.getName() + " лучший Пуффендуец, чем " + student1.getName();
        } else {
            return "Эти Пуффендуцы равны";
        }
    }

    public String compareForTheBest(Ravenclaw student1, Ravenclaw student2) {
        int student1Sum = student1.getMind() + student1.getWisdom() + student1.getWit()
                + student1.getCreativity();
        int student2Sum = student2.getMind() + student2.getWisdom() + student2.getWit()
                + student2.getCreativity();

        if (student1Sum > student2Sum) {
            return student1.getName() + " лучший Когтевранец, чем " + student2.getName();
        } else if (student1Sum < student2Sum) {
            return student2.getName() + " лучший Когтевранец, чем " + student1.getName();
        } else {
            return "Эти Когтевранцы равны";
        }
    }

    public String compareForTheBest(Hogwarts student1, Hogwarts student2) {
        int student1Sum = student1.getWitchcraftPower() + student1.getTransgression();
        int student2Sum = student2.getWitchcraftPower() + student2.getTransgression();

        if (student1Sum > student2Sum) {
            return student1.getName() + " обладает бОльшей мощностью магии, чем " + student2.getName();
        } else if (student1Sum < student2Sum) {
            return student2.getName() + " обладает бОльшей мощностью магии, чем " + student1.getName();
        } else {
            return "Эти студенты равны по мощности магии";
        }
    }
}
