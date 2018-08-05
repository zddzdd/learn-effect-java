package 适配器模式.国际接口;


/**
 *  * 德国宾馆
 */
public class Hotel {
    //得标接口
    public DBSocketInterface dbSocket;

    public Hotel() {
    }

    public Hotel(DBSocketInterface dbSocket) {
        this.dbSocket = dbSocket;
    }

    public void setDbSocket(DBSocketInterface dbSocket) {
        this.dbSocket = dbSocket;
    }

    //旅馆中有一个充电的功能
    public void charge(){
        //使用德标插口充电
        dbSocket.powerWithTwoRound();
    }
}
