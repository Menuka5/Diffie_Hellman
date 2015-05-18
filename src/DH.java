class DH{
    public static void main(String[] args) {
        //System.out.println("what is the key "+args[0]);
        double publickey = createRandom();
        double privatekey = createRandom();
        int prime = getPrime();
        
       
        if(args.length == 1 && ("private_key".equals(args[0].toLowerCase())) ){
            System.out.println("Public key " + publickey);
        }else if((args.length == 2) && ("public_key".equals(args[1].toLowerCase())) && ("private_key".equals(args[0].toLowerCase())) ){
            System.out.println("Session key " + (int)Math.pow(publickey,privatekey)%prime);
        }else{
            System.out.println("Wrong commandline input method");
            System.out.println("You have two choices");
            System.out.println("1. java DH private_key");
            System.out.println("1. java DH private_key public_key");
        }
        
        
}
    public static double createRandom(){
        String strnum = "";
        
        for (int i = 0; i < 100; i++) {
            strnum = strnum + (int)(Math.random()*10.0);
        }
        //System.out.println(strnum);
        return Double.parseDouble(strnum);
    }
    
    public static int getPrime(){
        int prime[] = {11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int primenum = prime[(int)(Math.random()*20.0)];
        return primenum;
    }
    
}
