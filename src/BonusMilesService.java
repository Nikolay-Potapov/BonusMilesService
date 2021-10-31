public class BonusMilesService {
    public int calculate(int cost) {

        int oneMiles = 1;
        int miles = cost / 20 * oneMiles;

        return miles;
    }
}
