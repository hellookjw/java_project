public class Car {
    int gas;
    String carName;

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
    void setcarName(String carName) {
        this.carName=carName;

    }
    String getcarName() {
        return carName;
    } //어떻게 하는거지
    
    int move(int gas){
        if(gas <= this.gas){
            this.gas-=gas;
            System.out.println(getcarName() + " move, resume gas: " + getGas());
            return this.gas;
            
        } else {
            
            System.out.println(getcarName() + " out of gas. resume gas: " + this.gas); 
            
        }
        return this.gas;
        

    }
    int refuel(int amount) {
        gas += amount; //가스추가
        System.out.println("fuel amount: " + amount + ", resume fuel:" + gas);
        return gas;
        
    }

    
        public static void main(String[] args) {
            Car[] cars = new Car[4];
            String[] carNames = {"kia", "ferrari", "bmw", "toyota"};
            int[] carGas = {10, 20, 15, 17};
    
            for (int i = 0; i < cars.length; i++) {
                cars[i] = new Car(carNames[i], carGas[i]);
            }
    
            for (int i = 0; i < 7; i++) {   //반복이 7번
                for (Car car: cars) {
                    if (car.move(5)<5){
                        car.refuel(10);
                    }
                    System.out.println();
                }
            }
        }
    // 결과값이 kia move, resume gas: 0 fuel amount: 10, resume fuel:10 이렇게 나오는데 왜인지 모르겠습니다


    
    
}
