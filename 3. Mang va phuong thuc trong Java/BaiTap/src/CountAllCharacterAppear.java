public class CountAllCharacterAppear {
    public static void main(String[] args) {
        String a = "Lêđ Minh Đứcđ đẹp traei đó";
        char x = 'e';
        String character="";
        String count = "";
        int count1 = 0;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                if(a.charAt(i)==a.charAt(j)){
                    count1++;
                }
            }
            if(character.indexOf(a.charAt(i)) == -1){
                character+=a.charAt(i);
                count+=count1;
            }
            count1=0;
        }
        System.out.println(character);
        System.out.println(count);
    }
}
