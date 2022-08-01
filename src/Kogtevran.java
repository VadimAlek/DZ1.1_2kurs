public class Kogtevran extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Kogtevran(int intelligence, int wisdom, int wit, int creativity) {
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }


        public int getIntelligence () {
            return intelligence;
        }

        public void setIntelligence ( int intelligence){
            this.intelligence = intelligence;
        }

        public int getWisdom () {
            return wisdom;
        }

        public void setWisdom ( int wisdom){
            this.wisdom = wisdom;
        }

        public int getWit () {
            return wit;
        }

        public void setWit ( int wit){
            this.wit = wit;
        }

        public int getCreativity () {
            return creativity;
        }

        public void setCreativity ( int creativity){
            this.creativity = creativity;
        }

        @Override
        public String toString () {
            return "Я студент Kogtevran " +
                    " у меня интеллект =" + intelligence +
                    ", мудрость =" + wisdom +
                    ", остроумие =" + wit +
                    ", краетивность =" + creativity + ", сила магии =" + this.getConjure() + ", расстояние трансгрессии =" + this.getTransgress();
        }
    public void compare(Kogtevran student) {
        int powerStudentFirst = student.getConjure() + student.getTransgress() + student.intelligence + student.wisdom + student.wit + student.creativity;
        int powerStudentSecond = this.getConjure() + this.getTransgress() + this.intelligence + this.wisdom + this.wit + this.creativity;
        if (powerStudentFirst > powerStudentSecond) {
            System.out.println("ПОБЕДИТЕЛЬ - ПЕРВЫЙ СТУДЕНТ!");
        } else if (powerStudentFirst < powerStudentSecond) {
            System.out.println("ПОБЕДИТЕЛЬ - ВТОРОЙ СТУДЕНТ!");
        } else {
            System.out.println("НИЧЬЯ!");
        }


    }
}

