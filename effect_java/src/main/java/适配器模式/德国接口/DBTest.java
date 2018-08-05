package 适配器模式.德国接口;

public class DBTest {
    public static void main(String[] args) {
        DBSocketInterface dbSocket = new DBSocket();
        Hotel hotel = new Hotel(dbSocket);
        hotel.charge();
    }
}
