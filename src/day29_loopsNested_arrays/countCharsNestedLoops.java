package day29_loopsNested_arrays;

public class countCharsNestedLoops {
    public static void main(String[] args) {


        String wordone = "java";
        for (int o = 0; o < wordone.length(); o++) {
            System.out.println(" outer: "+wordone.charAt(o));
            int count=0;
            for (int ii = 0; ii < wordone.length(); ii++) {
                // System.out.println(word.charAt(ii))
                if(wordone.charAt(o)== wordone.charAt(ii)){
                    count++;
                }
            }
            System.out.println(wordone.charAt(o)+"=" + count);
        }
        //OUTER: 0-LENGTH{
        // char-letter =  word.charAt(OUTER)
        //     INT COUNT=0;
        //INNER : 0 -LENGTH
        //       char innerLetter= word.charAt(INNER);
        // if outerChar ==  innerChar && OUTER != INNER
        // count++ }
        //  System.out.println(outerChar + "=" + count);
    }

}