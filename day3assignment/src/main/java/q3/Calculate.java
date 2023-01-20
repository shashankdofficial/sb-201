package q3;

import org.springframework.stereotype.Service;

@Service
public class Calculate implements CalculateDao {
    private int num1=10;
    private int num2=20;

    public int add(){
        int sum=num1+num2;
        return  sum;
    }

    public int subtract(){
        int sub=num1-num2;
        return sub;
    }

    public int mul(){
        int m=num1*num2;
        return m;
    }

    @Override
    public int[] getResult() {
        int []arr=new int[3];
        arr[0]=add();
        arr[1]=subtract();
        arr[2]=mul();

        return arr;
    }
}
