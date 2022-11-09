package common;

import com.hong.common.utils.ReflectionUtils;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @ClassName ReflectionUtilsTest
 * @Description 反射工具类测试
 * @Author wangweihong
 * @Date 2022/11/9 9:42
 * @Version 1.0
 */
public class ReflectionUtilsTest {

    @Test
    public void newInstance(){
        TestClass clazz = ReflectionUtils.newInstance(TestClass.class);
        Assert.assertNotNull(clazz);
    }

    @Test
    public void getPublicMethod(){
        Method[] methods = ReflectionUtils.getPublicMethods(TestClass.class);
        Assert.assertEquals(1, methods.length);
        String name = methods[0].getName();
        Assert.assertEquals(name, "b");
    }

    @Test
    public void invoke(){
        Method[] methods = ReflectionUtils.getPublicMethods(TestClass.class);
        Method method = methods[0];
        TestClass obj = new TestClass();
        Object o = ReflectionUtils.invoke(obj, method);
        Assert.assertEquals(o, "b");
    }
}
