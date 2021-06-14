public class CILab implements CILabInterface {
    private String myString;


    /**
     * Returns the current string. If the string is null, it should return null.
     *
     * @return Current string
     */
    @Override
    public String getString() {

        return myString;
    }


    /**
     * Sets the value of the current string.
     *
     * @param string The value to be set
     */
    @Override
    public void setString(String string) {

        myString = string;
    }


    /**
     *  We define the usage of capitals in a word to be right when one of the following cases holds:
     *  All letters in this word are capitals, like "USA".
     *  All letters in this word are not capitals, like "leetcode".
     *  Only the first letter in this word is capital, like "Google".
     * @return  Given a string word, return true if the usage of capitals in it is right.
     */

    @Override
    public boolean detectCapitalUse() {
        String word = getString();
        int caps = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                caps++;
            }
        }
        if (caps == word.length() || caps == 0) return true;
        return caps == 1 && Character.isUpperCase(word.charAt(0));
    }

}

