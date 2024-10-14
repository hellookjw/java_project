//다 해결 못했습니다..

public class Car {
    private int gas;
    private String carName;

   
    Car(){}
    Car(String carName){this.carName=carName;}
    Car(int gas){this.gas=gas;}
    Car(String carName, int gas){
        this.gas=gas;
        this.carName=carName;
    }

    void setGas(int gas) {
        this.gas=gas;
    }
    int getGas() {
        return gas;
    }
    void setCasName(String carName) {
        this.carName=carName;
   }
    String getCarName() {
        return carName;
    } //어떻게 하는거지
    
    int move(int gas){
        if(this.gas <= 5){
            System.out.println(getCarName() + " move, resume gas: " + getGas());
            
        } else {
        	this.gas-=gas;
            System.out.println(getCarName() + " out of gas. resume gas: " + getGas()); 
        }
		return 
		
    }
    int refuel(int amount) {
        amount += 10;
        this.gas += amount; //가스추가???
        System.out.println("fuel amount: " + amount + ", resume fuel:" + getGas());
        return ; 
        
    }

    class Main {
        public static void main(String[] args) {
            Car[] cars = new Car[4];
            String[] carNames = {"kia", "ferrari", "bmw", "toyota"};
            int[] carGas = {10, 20, 15, 17};
    
            for (int i = 0; i < cars.length; i++) {
                cars[i] = new Car(carNames[i], carGas[i]);
            }
    
            for (int i = 0; i < 7; i++) {   //반복이 7번
                for () {
                    if () {
                        
                    }
                    System.out.println();
                }
            }
        }
    }
    
    
}
