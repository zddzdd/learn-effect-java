package 适配器模式.国际接口;

public class GBSocket implements GBSocketInterface{

    @Override
    public void powerWithThreeFlat() {
        System.out.println("使用三项扁头插孔供电");
    }
}
