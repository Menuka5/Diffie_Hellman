import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;

class Test{
  public static void main(String[] args)throws NoSuchAlgorithmException, 
    InvalidAlgorithmParameterException, 
    InvalidParameterSpecException, 
    InvalidKeySpecException{
    
    System.out.println(args.length);
    
    
      KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DH");
      keyGen.initialize(576);
      KeyPair keypair = keyGen.genKeyPair();
      PrivateKey privateKey = keypair.getPrivate();
      PublicKey publicKey = keypair.getPublic();
      System.out.println(privateKey);
    


    
  }
  
  
}