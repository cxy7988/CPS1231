public class ass11 {
    public static void main(String[] args) {
        double Population = 312032486;
        double TotalBirthPerYear = 365.0*24*60*60/7;
        double TotalDeathPerYear = 365.0*24*60*60/13;
        double TotalImmigrantPerYear = 365.0*24*60*60/45;
        int Plus = (int)(TotalBirthPerYear + TotalImmigrantPerYear - TotalDeathPerYear);
        System.out.println(Plus);

        Population = Population +Plus;
        System.out.println(Population);
        Population = Population +Plus;
        System.out.println(Population);
        Population = Population +Plus;
        System.out.println(Population);
        Population = Population +Plus;
        System.out.println(Population);
        Population = Population +Plus;
        System.out.println(Population);
        System.out.println("ChenXinyu 1234760");
    }
}
