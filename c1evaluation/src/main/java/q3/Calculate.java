package q3;

import org.springframework.stereotype.Service;

@Service
public class Calculate implements CalculateDao {

    public int areaOfCircle(int radius){
        double area = 3.14*(radius*radius);
        int area2 = (int)area;
        return  area2;
    }

    public int areaOfTriangle(int height, int base){
        int area = (height*base)/2;
        return area;
    }

    public int areaOfrectangle(int length, int width){
        int area = length*width;
        return area;
    }

    @Override
    public int[] getResult() {
        int[] arr = new int[3];
        
        arr[0] = areaOfCircle(5);
        arr[1] = areaOfTriangle(5, 7);
        arr[2] = areaOfrectangle(5, 8);
        
        return arr;
    }
}
