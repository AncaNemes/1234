package day32Arrays_Split;

public class newSplit_Practice {
    public static void main(String[] args) {

         String app = "etsy";
         String zones = "us-east-1,us-west-2,us-west-1";
         System.out.println("--- Staring deployment of etsy app to AWS zones -----");

         String [] zonesToDeploy = zones.split (",");

         for(String eachZone:zonesToDeploy){
            // System.out.println(eachZone);
             System.out.println("deploying ["+ app +"]to" + eachZone+ "...");
             System.out.println("deploying completed for " +eachZone+ " ..");
         }
        System.out.println("--all deployments complete, traffic enables..");
        /*Deploying etsy to us-east-1...
        Deployment completed for us-east-1


        Deploying etsy to us-west-1...
        Deployment completed for us-west-1

        Deploying etsy to us-west-2...
        Deployment completed for us-west-2


                ---All deployments complete----*/

    }
}
