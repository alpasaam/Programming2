// import java.util.ArrayList;
/**
   This class generates permutations of a word.
*/
public class PermutationIterator {
   // private String word;
   // private int current;
   // private PermutationIterator tailIterator;
   // private String tail;
   /**
      Permutation iterator for given word.
      @param aWord the word to permute
   */
   public PermutationIterator() {

   }

   public String printPermutn(String str, String ans) {
     //If String is empty
     if (str.length() == 0) {
       System.out.print(ans + " ");
       return ans + "";
     }
     for (int i = 0; i<str.length(); i ++) {
       char ch = str.charAt(i);

       String ros = str.substring(0,i) + str.substring(i+1);

       printPermutn(ros, ans + ch);
     }
   }
//
//
//    /**
//       Generate next permutation.
//       @return next permutation
//    */
//    public String nextPermutation()
//    {
//       if (word.length() == 0)
//       {
//          current++;
//          return "";
//       }
//
//       char c = word.charAt(current);
//       String nextPermut = tailIterator.nextPermutation();
//
//       if (!tailIterator.hasMorePermutations())
//       {
//          current++;
//          if (current >= word.length())
//          {
//             tailIterator = null;
//          }
//          else
//          {
//             if (current + 1 >= word.length())
//             {
//                tail = word.substring(0, current);
//             }
//             else
//             {
//                tail = word.substring(0, current)
//                      + word.substring(current + 1, word.length());
//             }
//             tailIterator = new PermutationIterator(tail);
//          }
//       }
//       return c + nextPermut;
//    }
//
//    /**
//       Determine if there are more permutations.
//       @return true if more permutations
//    */
//    public boolean hasMorePermutations()
//    {
//       return current < word.length() || tailIterator != null
//             && tailIterator.hasMorePermutations();
//    }
}
