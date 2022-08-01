public class Puffendui extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Puffendui(int diligence, int loyalty, int honesty) {
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }


        public int getDiligence () {
            return diligence;
        }

        public void setDiligence ( int diligence){
            this.diligence = diligence;
        }

        public int getLoyalty () {
            return loyalty;
        }

        public void setLoyalty ( int loyalty){
            this.loyalty = loyalty;
        }

        public int getHonesty () {
            return honesty;
        }

        public void setHonesty (int honesty){
            this.honesty = honesty;
        }

        @Override
        public String toString () {
            return "Я студент Puffendui " +
                    " у меня усердие =" + diligence +
                    ", лояльность =" + loyalty +
                    ", честность =" + honesty + ", сила магии =" + this.getConjure() + ", расстояние трансгрессии =" + this.getTransgress();
        }

    public void compare(Puffendui student) {
        int powerStudentFirst = student.getConjure() + student.getTransgress() + student.diligence + student.loyalty + student.honesty;
        int powerStudentSecond = this.getConjure() + this.getTransgress() + this.diligence + this.loyalty + this.honesty;
        if (powerStudentFirst > powerStudentSecond) {
            System.out.println("ПОБЕДИТЕЛЬ - ПЕРВЫЙ СТУДЕНТ!");
        } else if (powerStudentFirst < powerStudentSecond) {
            System.out.println("ПОБЕДИТЕЛЬ - ВТОРОЙ СТУДЕНТ!");
        } else {
            System.out.println("НИЧЬЯ!");
        }

    }
}
