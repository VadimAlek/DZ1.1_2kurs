public class Griffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(int nobility, int honor, int bravery) {
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void compare (Griffindor student){
        int powerStudentFirst = student.getConjure()+ student.getTransgress()+student.bravery+student.honor+student.nobility;
        int powerStudentSecond = this.getConjure()+this.getTransgress()+this.bravery+this.honor+this.nobility;
        if (powerStudentFirst>powerStudentSecond){
            System.out.println("ПОБЕДИТЕЛЬ - ПЕРВЫЙ СТУДЕНТ!");
        } else if (powerStudentFirst<powerStudentSecond) {
            System.out.println("ПОБЕДИТЕЛЬ - ВТОРОЙ СТУДЕНТ!");
        } else {
            System.out.println("НИЧЬЯ!");
        }
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Я студент Griffindor " +
                "у меня благородство =" + nobility +
                ", честь =" + honor +
                ", храбрость =" + bravery + ", сила магии =" + this.getConjure() + ", расстояние трансгрессии =" + this.getTransgress();
    }


}
