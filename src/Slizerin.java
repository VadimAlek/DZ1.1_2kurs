public class Slizerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slizerin(int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }


        public int getCunning () {
            return cunning;
        }

        public void setCunning ( int cunning){
            this.cunning = cunning;
        }

        public int getDetermination () {
            return determination;
        }

        public void setDetermination ( int determination){
            this.determination = determination;
        }

        public int getAmbition () {
            return ambition;
        }

        public void setAmbition ( int ambition){
            this.ambition = ambition;
        }

        public int getResourcefulness () {
            return resourcefulness;
        }

        public void setResourcefulness ( int resourcefulness){
            this.resourcefulness = resourcefulness;
        }

        public int getThirstForPower () {
            return thirstForPower;
        }

        public void setThirstForPower ( int thirstForPower){
            this.thirstForPower = thirstForPower;
        }

        @Override
        public String toString () {
            return "Я студент Slizerin " +
                    " у меня хитрость =" + cunning +
                    ", решимость =" + determination +
                    ", амбиции =" + ambition +
                    ", находчивость =" + resourcefulness +
                    ", жажда силы =" + thirstForPower + ", сила магии =" + this.getConjure() + ", расстояние трансгрессии =" + this.getTransgress();
        }
    public void compare(Slizerin student) {
        int powerStudentFirst = student.getConjure() + student.getTransgress() + student.cunning + student.determination + student.ambition + student.resourcefulness + student.thirstForPower;
        int powerStudentSecond = this.getConjure() + this.getTransgress() + this.cunning + this.determination + this.ambition + this.resourcefulness + this.thirstForPower;
        if (powerStudentFirst > powerStudentSecond) {
            System.out.println("ПОБЕДИТЕЛЬ - ПЕРВЫЙ СТУДЕНТ!");
        } else if (powerStudentFirst < powerStudentSecond) {
            System.out.println("ПОБЕДИТЕЛЬ - ВТОРОЙ СТУДЕНТ!");
        } else {
            System.out.println("НИЧЬЯ!");
        }


    }
}
