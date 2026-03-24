//to find the given phrase is palidrom or not using bool func

class Solution {
    public boolean isPalindrome(String s) {
         int left = 0;
         int right = s.length() - 1;

         while(left<right)
         {  // to skip the non alph charcter from left
            while(left<right &&
                  !Character.isLetterOrDigit(s.charAt(left))) 
                  {
                    left++;
                  }
           // to skip the non alpha char from right
           while(left<right &&
                  !Character.isLetterOrDigit(s.charAt(right))) 
                  {
                    right--;
                  }
             if(Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right)))
                {
                    return false;
                }  
                left++;
                right--;

         } 
         return true;      
         }
        
    }
