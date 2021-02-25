package com.baitap;

public class FizzBuzz {
    public static String docSoThanhChu(int so){
        final String[] DANH_SACH_SO_DANG_CHU = {"Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "" +
                "Chín"};
        if (so < 10) {
            return DANH_SACH_SO_DANG_CHU[so];
        }else if( so >= 100){
            return "Chưa thể đọc số này thành chữ.";
        }
        int hangChuc = so / 10;
        int hangDonVi = so % 10;
        if (hangChuc == 1) {
            if (hangDonVi == 0) {
                return "Mười";
            } else if (hangDonVi == 5) {
                return "Mười lăm";
            } else {
               return "Mười " + DANH_SACH_SO_DANG_CHU[hangDonVi].toLowerCase();
            }
        } else {
            if (hangDonVi == 0) {
                return DANH_SACH_SO_DANG_CHU[hangChuc] + " mươi";
            }else if(hangDonVi == 1){
                return DANH_SACH_SO_DANG_CHU[hangChuc] + " mốt";
            }else if (hangDonVi == 5){
                return DANH_SACH_SO_DANG_CHU[hangChuc] + " lăm";
            }else if(hangDonVi == 4){
                return DANH_SACH_SO_DANG_CHU[hangChuc] + " tư";
            }
        }
        return DANH_SACH_SO_DANG_CHU[hangChuc] + " " + DANH_SACH_SO_DANG_CHU[hangDonVi].toLowerCase();
    }
    public static String fizzBuzz(int so){
        if(so % 3 == 0 && so % 5 ==0){
            return "FizzBuzz";
        }else if(so % 3 == 0){
            return "Fizz";
        }else if(so % 5 == 0){
            return "Buzz";
        }
        String soDangKiTu = String.valueOf(so);
        for (int i = 0; i < soDangKiTu.length(); i++) {
            if(soDangKiTu.charAt(i) == '3'){
                return "Fizz";
            }
            if(soDangKiTu.charAt(i) == '5'){
                return "Buzz";
            }
        }
        return docSoThanhChu(so);
    }
}
