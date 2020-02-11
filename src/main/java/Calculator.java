public class Calculator {
    private int number;

    public Calculator(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    public void addOne(){
        this.number += 1;
    }

    public void subtractOne(){
        this.number -= 1;
    }

    public void multiply(){
        this.number = number * 2;
    }

    public void divide(){
        this.number = number / 2;
    }

}
