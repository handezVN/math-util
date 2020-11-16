/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handez.util;

/**
 *
 * @author handez
 */
public class MathUtility {
    // fake class math giong nhu that
    // Math.sqrt() .abs() .pow() sin() .PI
    public static final double PI =3.1415;
    
    // Tinh n!=1.2.3.4.5....n
    // 21! tràn long , âm giai thừa không tính được , vô nghĩa 
    // 0! - 1! = 1;
    // bài này chỉ tính gia thừa từ 0 cho tới 20
    // nếu đưa n cà chớn bé hơn 0 hoặc > 20 , chửi , return ra chửi
    public static long getFactorial(int n){
        long result1 =1;
        if(n<0||n>20){
            throw  new IllegalArgumentException("n muse be between 0..20");
        }else
        for(int i=1 ;i<=n;i++){
        result1*=i;
    }
        return result1;
//        if(n==0||n==1)return 1;
//        // CPU chạy lệnh ở chỗ này , tức là n=2....20 , không xài esle , xài trừ điểm
//        long result =1;
//        for(int i =2;i<=n;i++){
//            result*=i;
//        }
//        return result;
    }
    // tự tin làm hầm chạy đúng như thiết kế
    // éo tin, phải test đã
    // có nhiều cách để test
    // VD: 5! = 120
    // case  n=5 hàm đúng
    // case  n=6 hàm trả về 720 hàm đúng
    //  n=0 trả về 1 thì là hàm đúng
    // làm các case mà mình nghĩ là người dùng sẽ xài hàm như thế
    // tao gọi là các tast cases
    // một hàm có nhiều test case ứng với nhiều tính huống xài hàm
    // đảm bảo hàm đúng cho các case thì mới release
    // ta bắt đầu thử nghiệm test hàm
    public static void main(String[] args) {
        // kĩ thuật test căn bản : nhìn bằng mắt các test case để đưa ra kết quả hàm
        // đúng sai
        long expected=120;
        long actual = getFactorial(5);
        System.out.println(actual);
        System.out.println(getFactorial(6));
        System.out.println(getFactorial(0));
        System.out.println(getFactorial(1));
        // tao kì vọng m ném về ngoại lệ nếu t ddauw về âm giai thừa
        // cần phải dùng mắt để so sánh trong trường hợp xài hàm 
        // nếu test nhiều tính huống , mắt đủ mệt mỏi vì phải dò từng người
        
        // cách nâng cao
        // gom cả đám test case lại , chạy cùng 1 lượt
        // máy so giùm ta luôn
        // sau đó
        // NẾU TẤT cả các CASE đều đúng  , thấy ra 1 màu xanh - đèn xanh - code ổn
        // NẾU TẤT cả các CASE đều đúng  , ngoại trừ 1, 2 thằng nào đó
        //                              Hàm đúng gần hết , mà sai 1 vài , không tin cậy xài hàm    
        // Đỏ : chỉ có ít nhất 1 cặp EXPECTED ACTUAL không bnagwf nhau m kết luận hàm sai
        // 
        // Thay vì nhìn tường case , ta sẽ chỉ nhìn màu xanh hoặc màu đỏ là đủ rồi
        // V thì ta cần thêm bộ thư viện để giúp t việc này
        // bô thư viện nó làm 2 việc : so sánh giùm ACTUAL  VS EXPECTED
        //      Tùy KHỚP => Thấy ra màu xanh
        //      Ko Khớp => thấy ra màu đỏ
        // Bộ thứ viện này chính là các FILE . JAR .DLL được ADD thêm vào PROJECT
        // Bộ thư viện này mang cái tên chung cho mọi ngôn ngữ lập trình =Unit Text
        // Riêng cho Java : JUnit , TestNG
        //              C#: NUnit
        //             PHP: PHPUnit
        //             ...: ....
        // Đưa code lên server
        
        
        
        getFactorial(-5);
    }
}
