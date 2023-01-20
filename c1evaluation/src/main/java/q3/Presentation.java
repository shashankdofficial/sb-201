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
        System.out.println("Area of Circle : "+arr[0]);
        System.out.println("Area of Triangle : "+arr[1]);
        System.out.println("Area of Rectangle : "+arr[2]);
        System.out.println("===================================");
    }
}
