package course;


import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.Pattern;

public class FormatText{

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] testData = new double[] { 100.123D, 1234567.897D, 100.0052D,  
                80.00D };  
  
        for (double value : testData) {  
            System.out.println(PrecisionTest.format1(value));  
            System.out.println(PrecisionTest.format2(value));  
            System.out.println(PrecisionTest.format3(value));  
            System.out.println(PrecisionTest.format4(value));  
            System.out.println(PrecisionTest.format5(value));  
        }  
				

	}
	

}


class PrecisionTest {  
	  
    
  
    /** 
     * ʹ��BigDecimal������С�������λ 
     */  
    public static String format1(double value) {  
  
        BigDecimal bd = new BigDecimal(value);  
        bd = bd.setScale(2, RoundingMode.HALF_UP);  
        return bd.toString();  
    }  
  
    /** 
     * ʹ��DecimalFormat,����С�������λ 
     */  
    public static String format2(double value) {  
  
        DecimalFormat df = new DecimalFormat("0.00");  
        df.setRoundingMode(RoundingMode.HALF_UP);  
        return df.format(value);  
    }  
  
    /** 
     * ʹ��NumberFormat,����С�������λ 
     */  
    public static String format3(double value) {  
  
        NumberFormat nf = NumberFormat.getNumberInstance();  
        nf.setMaximumFractionDigits(2);  
        /* 
         * setMinimumFractionDigits���ó�2 
         *  
         * �������ô������ô��value��ֵ��100.00��ʱ�򷵻�100 
         *  
         * ������100.00 
         */  
        nf.setMinimumFractionDigits(2);  
        nf.setRoundingMode(RoundingMode.HALF_UP);  
        /* 
         * ���������ĸ�ʽ�ö��Ÿ������������ó�true 
         */  
        nf.setGroupingUsed(false);  
        return nf.format(value);  
    }  
  
    /** 
     * ʹ��java.util.Formatter,����С�������λ 
     */  
    public static String format4(double value) {  
        /* 
         * %.2f % ��ʾ С����ǰ����λ�� 2 ��ʾ��λС�� ��ʽ��Ľ��Ϊ f ��ʾ������ 
         */  
        return new Formatter().format("%.2f", value).toString();  
    }  
  
    /** 
     * ʹ��String.format��ʵ�֡� 
     *  
     * ���������ʵ��format4��һ���� 
     */  
    public static String format5(double value) {  
  
        return String.format("%.2f", value).toString();  
    }  
}
