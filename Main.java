public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int totalmiles = service.calculate( 23333);
        System.out.println(totalmiles);
    }
}