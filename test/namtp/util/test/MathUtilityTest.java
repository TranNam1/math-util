/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namtp.util.test;

import namtp.util.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nam
 */
public class MathUtilityTest {
    
    public MathUtilityTest() {
        //minh se test cac tinh huong xai ham getFactorial o day
        //tinh huong la cac tham so dua vao : am, duong trong,ngoai khoang
        //tinh huong test ham , xai ham goi la TEST CASES
        //thuong ta cos= tinh huong thnah cing va that bai
        //thanh cong : dua vao value hop le
        //that Bai : dua vao am , >20, ceht
        //ham phai bat aca tinh huong nay va gio ta test thu coi ham su ly dung khong
        //nhung ten ham bao gom ngu nghia ket qua tra ve , tinh trang test
        //khong giong quy tac dat ten ham khi viet app
        //minh dang viet code de test
        
        //minh muon test ham tra ve ngon neu dua tham so ngon
        
    }
    @Test // bien ham nay thnah public Static void main()
    public void getFatorial_RunsWell_IfValidArgument(){
        assertEquals(120, MathUtil.getFactorial(5));
        //tui muon check void co ddung la goi ham 5 giai thua thi trar ve 120 hay khong
        //co thi xanh khong thi do
        assertEquals(720, MathUtil.getFactorial(6));
        assertEquals(24, MathUtil.getFactorial(4));
        assertEquals(6, MathUtil.getFactorial(3));
        assertEquals(1, MathUtil.getFactorial(0));
        
        
        
    }
    
}
//MAC DING CODE TESST DOC LAP VOI CODE CHINH
//DOC LAP VOI VOI QUA TRING CLEAN AND BUILT , TUC LA DU CODE BAN XANH HAY DO
//MIEN LA KHONG BI ERROR CU PHAP
//BAN LUON CHAY DUOC CODE CHINH

//HOP LOGIC THI MAU XANH , TUC LA HAM CHUAN THI MOIW RA DUOC.JAR.WAR
//VAY TTA CAN CO 1 CACH GAI XANH DO VAO QUY TRINH BUILD .JAR,.WAR
//CACH KHAC : NEU CODE TEST DANG MAU DO THI DISABLE CAI NUT BAM CLEAN AND BUILD
