import java.util.ArrayList;
import java.util.List;

public class solution_1431 {
    
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int n = candies.length;
        List<Boolean> result = new ArrayList<>(n);
        int maxCandies = 0;

        for(int i = 0; i < n; i++){
            if(candies[i] > maxCandies)
                maxCandies = candies[i];
        }

        for(int i = 0; i < n; i++){

            if(candies[i] + extraCandies >= maxCandies)
                result.add(true);
            else
                result.add(false);

        }
        
        return result;

    }
}
