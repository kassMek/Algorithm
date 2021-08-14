package enums;

public enum Transport {
    PLANE(450),TRAIN(80),AUTOMOBILE(50);

    int speed;
    Transport( int limit){
        speed=limit;
    }

    public int getSpeed(){
        return speed;
    }
}
