public class Car {
    int gas;
    String carName;

    Car(){}
    Car(String carName){}
    Car(int gas){}
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
        if(gas>=5){
            gas -= 5;
            System.out.println(carName + " move, resume gas: " + gas);
            
        } else {
            System.out.println(carName + " out of gas. resume gas: " + gas); //결과창은 음수가 아니라 그냥 그대로 나오는데..
        }

    }
    int refuel(int amount) {
        amount += 10;
        gas += amount; //가스추가
        System.out.println("fuel amount: " + amount + ", resume fuel:" + gas);
        return gas;
        
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
                for (int j=0; j<??; j++) {
                    if () {
                        
                    }
                    System.out.println();
                }
            }
        }
    }
    
    
}
