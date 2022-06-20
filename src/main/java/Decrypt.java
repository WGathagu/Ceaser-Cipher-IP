public class Decrypt {
    private String inputString;
    private int cChange;

    public Decrypt(String inputString, int cChange) {
        this.inputString = inputString;
        this.cChange = cChange;
    }

    public String getInputString(){
        return inputString;
    }

    public int getCharacterChange(){
        return cChange;
    }

    public static String decrypt(Decrypt decrypt){

        if(decrypt.cChange > 26){
            decrypt.cChange = decrypt.cChange % 26;
        }
        else if(decrypt.cChange < 0) {
            decrypt.cChange = (decrypt.cChange % 26) + 26;
        }

        String outputString = "";
        int length = decrypt.inputString.length();
        for (int i = 0; i < length ; i++) {
            char cc = decrypt.inputString.charAt(i);
            if(Character.isLetter(cc)){
                if(Character.isLowerCase(cc)){
                    char c = (char)(cc-decrypt.cChange);
                    if(c<'a'){
                        outputString += (char)(cc + (26-decrypt.cChange));
                    }
                    else {
                        outputString += c;
                    }
                }
                else if(Character.isUpperCase(cc)){
                    char c = (char)(cc-decrypt.cChange);
                    if(c<'A'){
                        outputString += (char)(cc + (26-decrypt.cChange));
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
