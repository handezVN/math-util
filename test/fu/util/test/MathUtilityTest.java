/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.util.test;

import Handez.util.MathUtility;
import org.junit.Test;
import static Handez.util.MathUtility.*;
import java.sql.SQLException;
// chỉ có từ jdk 5
// tức là khi chơi trò import static , thì mọi hàm static trong class này 
// khi gọi thì ko cần tên class chấm , gọi như C
import static org.junit.Assert.*;

/**
 *
 * @author handez
 */
public class MathUtilityTest {
    // Class này là Class dùng để test code theo dạng xanh đỏ thay vì nhìn bằng mắt theo bên Main()
    // 2 File .jar đã đc add vào project này và ta thoải mái xài các hàm của nó
    // trong các hàm của thư viện này có n cái hàm đặc biết đều có tên xuất phát là assertX(expected và actual đưa vào)
    // Nếu nó thấy expected không có bằng actual , nó thẩy màu đỏ , nếu nó = nó thẩy màu xanh
    // Qua tắc xanh đỏ như sau : Nếu tất cả xanh thì kết luận xanh ,
    // Nếu có ít nhất 1 đỏ : kết luận đỏ
    @Test // bắt buộc có để chạy
    public void getFactorial_RensWell_IfValidArgument(){
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));
        assertEquals(24, getFactorial(4));
        assertEquals(6, getFactorial(3));
        assertEquals(1, getFactorial(0));
        
    }
    @Test(expected = IllegalArgumentException.class)
    public void getFactorial_ThrowsException_IfInvalidArgument(){
        // Ngoại lệ không phải là value để assert()
        // chỉ có thể chụp nó lại
        getFactorial(-5);
    }
    
}
