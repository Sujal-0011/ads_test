class test{
    public static char find(String str){
        for(int i = 0 ; i < str.length() ; i++){
            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
                return str.charAt(i);
            }
        }
        return '0';
    }
    public static void main(String[] args) {
        String str = "aabbccdde";
        System.out.println("The word is: " + find(str));
    }
}