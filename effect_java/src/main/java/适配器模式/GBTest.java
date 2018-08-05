package 适配器模式.国际接口;

public class GBTest {
    public static void main(String[] args) {
        GBSocketInterface gbSocket =  new GBSocket();
        SocketAdapter socketAdapter = new SocketAdapter(gbSocket);
        Hotel hotel = new Hotel();
        hotel.setDbSocket(socketAdapter);
        hotel.charge();
    }
}
