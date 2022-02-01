
public class BMI { //set variables to private 
    private Double weight;
    private Double height;
    private Double calBMI;

    public BMI(Double weight, Double height){
        this.weight = weight * 0.45359237;
        this.height = height * 0.0254;
    }

    public Double getWeight(){ //get weight input
        return weight;
    }
    public Double getHeight(){ //get height input
        return height;
    }
    public void setWeight(Double weight){ //set weight input
        this.weight = weight;
    }
    public void setHeight(Double height){ //set height input
        this.height = height;
    }
    public Double calBMI(){ 
        //calculate the BMI, given formula by taking your weight in kilogram 
        //and dividing it by the square of your height in meters.
        calBMI = this.weight/Math.pow(this.height, 2);
        return calBMI;

    }

    public void Interpretation(){
        if (calBMI < 18.5){
            System.out.println("Underweight");
        }
        else if (calBMI >= 18.5 && calBMI < 25){
            System.out.println("Normal");
        }
        else if (calBMI >= 25 && calBMI < 30){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }
        
    }
}