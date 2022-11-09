import com.hong.codec.core.Decoder;
import com.hong.codec.core.Encoder;
import com.hong.codec.core.JSONDecoder;
import com.hong.codec.core.JSONEncoder;
import org.junit.Assert;
import org.junit.Test;

/**
 * @ClassName TestCodec
 * @Description TODO类
 * @Author wangweihong
 * @Date 2022/11/9 10:51
 * @Version 1.0
 */
public class TestCodec {
    @Test
    public void encode(){
        Encoder encoder=new JSONEncoder();
        TestBean bean=new TestBean();
        bean.setName("nonbioclock");
        bean.setAge(18);
        byte[] bytes=encoder.encode(bean);
        Assert.assertNotNull(bytes);
    }

    @Test
    public void decode(){
        Decoder decoder = new JSONDecoder();
        Encoder encoder = new JSONEncoder();
        TestBean bean = new TestBean();
        bean.setName("nonbioclock");
        bean.setAge(19);
        byte[] bytes = encoder.encode(bean);
        TestBean decode = decoder.decode(bytes, TestBean.class);
        System.out.println(decode.toString());
        System.out.println(bean.equals(decode));
    }
}
