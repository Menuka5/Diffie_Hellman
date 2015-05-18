//final one
public class DH{
    
    public static void main(String[] args) {
        DH test = new DH();
        int private_key, public_key;
        int pubkey = 7;
        int prime = getPrime();
        
        
        if(args.length == 1){
            private_key = Integer.parseInt(args[0]);
            int publickey = (int)(Math.pow(pubkey, private_key))%prime;
            System.out.println("public key is "+publickey);
        }else if( args.length == 2){
            private_key = Integer.parseInt(args[0]);
            public_key = Integer.parseInt(args[1]);
            int publickey1 = (int)(Math.pow(public_key, private_key))%prime;
            System.out.println("Session key is " + publickey1);
            
        }else{
            System.out.println("Wrong commandline input method");
            System.out.println("You have two choices");
            System.out.println("1. java DH private_key");
            System.out.println("1. java DH private_key public_key");
        }
    }
    
    public static int getPrime(){
        int prime[] = {11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int primenum = prime[(int)(Math.random()*20.0)];
        return primenum;
    }
            
}