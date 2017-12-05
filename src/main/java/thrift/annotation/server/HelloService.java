package thrift.annotation.server;

import com.facebook.swift.codec.ThriftField;
import com.facebook.swift.service.ThriftMethod;
import com.facebook.swift.service.ThriftService;

/**
 * @author flytoyou
 * @version 1.0.0
 * 接口
 * 通过@ThriftService注释定义Thrift服务接口，对于Thrift IDL中的Service定义
 * @ThriftService注解在方法定义上，对应于Thrift IDL service中的方法定义
 * 其中方法参数需要使用@ThriftField来标注
 */
@ThriftService("HelloService")
public interface HelloService {

    @ThriftMethod
    public String sayHello(@ThriftField(name = "user") User user);
}
