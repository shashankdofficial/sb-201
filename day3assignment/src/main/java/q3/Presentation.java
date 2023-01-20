package q3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Presentation {
    @Autowired
    private  CalculateDao dao;

    public void setDao(CalculateDao dao) {
        this.dao = dao;
    }

    public void displayResult(){
        int []arr= dao.getResult();
        System.out.println("===================================");
        System.out.println("Sum of both number : "+arr[0]);
        System.out.println("Difference of both number : "+arr[2]);
        System.out.println("Multiplication of both number : "+arr[1]);
        System.out.println("===================================");
    }
}
