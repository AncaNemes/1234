package day14_multi_branch_if_statement;


public class YesOrNo {

    public static void main(String[] args) {
        System.out.println("Are you sure you want to delete this file?" );

        char selection='y'; //if y it will chose your File will be deleted
        boolean answer;
        String results; //


        if (selection =='y' ) {
            System.out.println("Your file will be deleted");
            answer=true;
            results = "deleted";
        }
            else {
            System.out.println("File deletion cancelled");
            answer=false;
            results = "not deleted";
            }
        System.out.println("did file get deleted = " + answer);
        System.out.println("Did file get deleted = " + results);
    }
}
/*add new package day14_multi_branch_if_statements
add new class YesOrNo
add main method

print "Are you sure you want to delete this file?"
selection > "y";
answer -> boolean variable

selection -- "y"
    true :
        "your file will be deleted"
        answer -> true
    false :
        "file deletion cancelled"
        answer -> false


"Did file get deleted? - true"*/