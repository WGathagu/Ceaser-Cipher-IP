public class Encrypt {
    private String inputString;
    private int cChange;

    public String getInputString(){
        return inputString;
    }

    public int getcChange(){
        return cChange;
    }

    public Encrypt(String inputString, int cChange) {
        this.inputString = inputString;
        this.cChange = cChange;
    }

    public static String encrypt(Encrypt encrypt){

        if(encrypt.cChange > 26){
            encrypt.cChange = encrypt.cChange % 26;
        }
        else if(encrypt.cChange < 0) {
            encrypt.cChange = (encrypt.cChange % 26) + 26;
        }

        String outputString = "";
        int length = encrypt.inputString.length();
        for (int i = 0; i < length ; i++) {
            char cc = encrypt.inputString.charAt(i);
            if(Character.isLetter(cc)){
                if(Character.isLowerCase(cc)){
                    char c = (char)(cc+encrypt.cChange);
                    if(c>'z'){
                        outputString += (char)(cc - (26-encrypt.cChange));
                    }
                    else {
                        outputString += c;
                    }
                }
                else if(Character.isUpperCase(cc)){
                    char c = (char)(cc+encrypt.cChange);
                    if(c>'Z'){
                        outputString += (char)(cc - (26-encrypt.cChange));
                    }
                    else {
                        outputString += c;
                    }
                }
            }
            else{
                outputString += cc;
            }
        }
        return outputString;
    }
}
