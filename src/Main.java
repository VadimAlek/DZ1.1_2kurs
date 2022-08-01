public class Main {
    public static void main(String[] args) {

        Griffindor harryPotter = new Griffindor(54,61,80);
        harryPotter.setConjure(54);
        harryPotter.setTransgress(68);
        Griffindor germiona = new Griffindor(30,52,24);
        germiona.setConjure(41);
        germiona.setTransgress(54);
        Griffindor ron = new Griffindor(45,51,36);
        ron.setConjure(21);
        ron.setTransgress(55);
        Slizerin drako = new Slizerin(25,65,43,75,58);
        drako.setTransgress(48);
        drako.setConjure(68);
        Slizerin grehem = new Slizerin(33,54,21,84,51);
        grehem.setConjure(12);
        grehem.setTransgress(34);
        Slizerin gregori = new Slizerin(21,54,33,68,57);
        gregori.setTransgress(22);
        gregori.setConjure(47);
        Puffendui zaharia = new Puffendui(54,65,32);
        zaharia.setConjure(88);
        zaharia.setTransgress(35);
        Puffendui sedrik = new Puffendui(45,69,25);
        sedrik.setTransgress(31);
        sedrik.setConjure(58);
        Puffendui jastin = new Puffendui(65,56,32);
        jastin.setConjure(26);
        jastin.setTransgress(84);
        Kogtevran chjou = new Kogtevran(32,45,62,33);
        chjou.setConjure(89);
        chjou.setTransgress(80);
        Kogtevran padma = new Kogtevran(55,64,35,26);
        padma.setTransgress(54);
        padma.setConjure(22);
        Kogtevran markus = new Kogtevran(63,24,52,66);
        markus.setConjure(88);
        markus.setTransgress(14);
        harryPotter.compare(germiona);
        System.out.println(markus);
    }
}