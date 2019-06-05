package http.webxml;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name="MobileCodeWSSoap", targetNamespace="http://WebXml.com.cn/")
@XmlSeeAlso({ObjectFactory.class})
public abstract interface MobileCodeWSSoap
{
  @WebMethod(action="http://WebXml.com.cn/getMobileCodeInfo")
  @WebResult(name="getMobileCodeInfoResult", targetNamespace="http://WebXml.com.cn/")
  @RequestWrapper(localName="getMobileCodeInfo", targetNamespace="http://WebXml.com.cn/", className="cn.com.webxml.GetMobileCodeInfo")
  @ResponseWrapper(localName="getMobileCodeInfoResponse", targetNamespace="http://WebXml.com.cn/", className="cn.com.webxml.GetMobileCodeInfoResponse")
  public abstract String getMobileCodeInfo(@WebParam(name = "mobileCode", targetNamespace = "http://WebXml.com.cn/") String paramString1, @WebParam(name = "userID", targetNamespace = "http://WebXml.com.cn/") String paramString2);
  
  @WebMethod(action="http://WebXml.com.cn/getDatabaseInfo")
  @WebResult(name="getDatabaseInfoResult", targetNamespace="http://WebXml.com.cn/")
  @RequestWrapper(localName="getDatabaseInfo", targetNamespace="http://WebXml.com.cn/", className="cn.com.webxml.GetDatabaseInfo")
  @ResponseWrapper(localName="getDatabaseInfoResponse", targetNamespace="http://WebXml.com.cn/", className="cn.com.webxml.GetDatabaseInfoResponse")
  public abstract ArrayOfString getDatabaseInfo();
}



/* Location:           C:\Users\Administrator\Desktop\test.jar

 * Qualified Name:     Users.Administrator.Desktop.cn.com.webxml.MobileCodeWSSoap

 * JD-Core Version:    0.7.0.1

 */