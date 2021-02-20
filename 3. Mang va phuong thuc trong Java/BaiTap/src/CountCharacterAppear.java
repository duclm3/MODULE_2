public class CountCharacterAppear {
    public static void main(String[] args) {
        String a = "Lêđ Minh Đứcđ đẹp traei đó";
        char x = 'e';
        int cout = 0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == x){//char là biến nguyên thuỷ chỉ ss = dấu ==
                cout++;
            }
        }
        System.out.println(cout);
    }
}
