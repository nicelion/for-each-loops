import java.util.ArrayList;

public class EnhancedForLoop
{
    public static double mean(double nums[]) {
        int sum = 0;
        
        for (double x: nums) {
            sum += x;
        } 
        
        return sum / nums.length;
    }
    
    public static double max(double nums[]) {
        double max = nums[0];
        
        for (double x: nums) {
            if (x > max) {
                max = x;
            }
        }
        
        return max;
    }
    
    public static int sumEvenVals(int nums[]) {
        int sum = 0;
        

        
        for (int x: nums) {
            if (x % 2 == 0)
                sum += x;
            }
        
        return sum;
    }
    
    public static int vowelCount(String phrase) {
        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char c: phrase.toCharArray()){
            for (char v: vowels) {
                if (c == v){
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public static int sumEvenLocs(int[] nums) {
        int sum = 0;
        int index = 0;
        for (int n: nums) {
            if (index % 2 == 0){
                index++;
                sum += n;
                
            }
            
        }
        
        return sum;
    }
    
    public static int sumEvenLocsFor(int[] nums) {
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];
            }
        }
        
        return sum;
    }
    
    public static void main(String[] args)
    {
        /********** Examples **********/
        
        int[] arr = {4,5,1,2,3,8};
        
        // Ex. 1
        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();
        
        // Ex. 2
        for (int x: arr)
            x++; // remember, x is a copy of each item in the array
            
        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();
        
        // Ex. 3
        for (int i=0; i<arr.length; i++)
            arr[i]++; // now we are actually changing elements in the array
            
        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();
        
        
        // Ex. 4
        Pet[]   pets = {new Pet("Phineas"),new Pet("Ferb"),new Pet("Perry")};
        
        for (Pet p : pets)
            p.sleep();
        

        for (Pet p : pets)
            System.out.println(p);

        ArrayList<Pet> morePets = new ArrayList<Pet>();
        morePets.add(new Pet("Milo"));
        morePets.add(new Pet("Otis"));
        
        for (int i=morePets.size()-1; i>=0; i--) {
            Pet p = morePets.get(i);
            
            morePets.remove(i);
            p.eat();
        }
        System.out.println();
        /********** Your turn **********/
        
        // #1 - Write a method mean(double nums[]) which uses an enhanced
        //      for loop to return the mean of the elements in nums. Test
        //      the method here.
        
        double[] dubArr = {3.1, 3.3, 6.5, 3.12, 98.4, 98.3, 98.5};
        System.out.println(mean(dubArr));
        
        
        System.out.println();
        // #2 - Write a method max(double nums[]) which uses an enhanced
        //      for loop to return the maximum value of the elements in
        //      nums. Then test the method.
        
        System.out.println(max(dubArr));
        
        System.out.println();
        // #3 - Write a method sumEvenVals that uses an enhanced for 
        //      loop to return the sum of all even values stored in an 
        //      Array.  Then test the method.
        
        System.out.println(sumEvenVals(arr));

        System.out.println();
        // #4 - Write a method vowelCount that uses an enhanced for loop
        //      to count the number of vowels (a,e,o,u only) in a list
        //      of words.
        
        System.out.println(vowelCount("the lazy dog jumped over the quick brown fox"));
        
        System.out.println();
        // #5 - Write a method sumEvenLocs that uses an enhanced for 
        //      loop to find the sum of all values stored with even 
        //      numbered indices in an Array. Then test the method.
        
        System.out.println(sumEvenLocs(arr));
        
        System.out.println();
        // #6 - Solve #5 using a regular for loop. Then explain why a
        //      regular for loop is more appropriate for that problem.
        System.out.println(sumEvenLocsFor(arr));
        
        /*
         * It is more appropriate to use a standart for loop because you can access the index without having to define it before starting 
         * the for loop.
         */
        
    }
}