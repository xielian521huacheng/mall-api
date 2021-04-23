package online.danbao.mall.api.common;

/**
 * @author jingjing
 * @data 2021/4/23 8:52
 * @description 自定义异常
 **/
public class MallException extends RuntimeException{
    public MallException() {
    }

    public MallException(String message) {
        super(message);
    }

    /**
     * 抛出异常     *     * @param message 消息
     */
    public static void fail(String message) {
        throw new MallException(message);
    }
}
