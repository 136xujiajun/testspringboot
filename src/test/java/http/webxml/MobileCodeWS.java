/*  1:   */ package http.webxml;
/*  2:   */ 
/*  3:   */ import java.net.MalformedURLException;
/*  4:   */ import java.net.URL;
/*  5:   */ import javax.xml.namespace.QName;
/*  6:   */ import javax.xml.ws.Service;
/*  7:   */ import javax.xml.ws.WebEndpoint;
/*  8:   */ import javax.xml.ws.WebServiceClient;
/*  9:   */ import javax.xml.ws.WebServiceException;
/* 10:   */ import javax.xml.ws.WebServiceFeature;
/* 11:   */ 
/* 12:   */ @WebServiceClient(name="MobileCodeWS", targetNamespace="http://WebXml.com.cn/", wsdlLocation="http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?WSDL")
/* 13:   */ public class MobileCodeWS
/* 14:   */   extends Service
/* 15:   */ {
/* 16:   */   private static final URL MOBILECODEWS_WSDL_LOCATION;
/* 17:   */   private static final WebServiceException MOBILECODEWS_EXCEPTION;
/* 18:29 */   private static final QName MOBILECODEWS_QNAME = new QName("http://WebXml.com.cn/", "MobileCodeWS");
/* 19:   */   
/* 20:   */   static
/* 21:   */   {
/* 22:32 */     URL localURL = null;
/* 23:33 */     WebServiceException localWebServiceException = null;
/* 24:   */     try
/* 25:   */     {
/* 26:35 */       localURL = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?WSDL");
/* 27:   */     }
/* 28:   */     catch (MalformedURLException localMalformedURLException)
/* 29:   */     {
/* 30:37 */       localWebServiceException = new WebServiceException(localMalformedURLException);
/* 31:   */     }
/* 32:39 */     MOBILECODEWS_WSDL_LOCATION = localURL;
/* 33:40 */     MOBILECODEWS_EXCEPTION = localWebServiceException;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public MobileCodeWS()
/* 37:   */   {
/* 38:44 */     super(__getWsdlLocation(), MOBILECODEWS_QNAME);
/* 39:   */   }
/* 40:   */   
/* 41:   */   public MobileCodeWS(WebServiceFeature... paramVarArgs)
/* 42:   */   {
/* 43:48 */     super(__getWsdlLocation(), MOBILECODEWS_QNAME, paramVarArgs);
/* 44:   */   }
/* 45:   */   
/* 46:   */   public MobileCodeWS(URL paramURL)
/* 47:   */   {
/* 48:52 */     super(paramURL, MOBILECODEWS_QNAME);
/* 49:   */   }
/* 50:   */   
/* 51:   */   public MobileCodeWS(URL paramURL, WebServiceFeature... paramVarArgs)
/* 52:   */   {
/* 53:56 */     super(paramURL, MOBILECODEWS_QNAME, paramVarArgs);
/* 54:   */   }
/* 55:   */   
/* 56:   */   public MobileCodeWS(URL paramURL, QName paramQName)
/* 57:   */   {
/* 58:60 */     super(paramURL, paramQName);
/* 59:   */   }
/* 60:   */   
/* 61:   */   public MobileCodeWS(URL paramURL, QName paramQName, WebServiceFeature... paramVarArgs)
/* 62:   */   {
/* 63:64 */     super(paramURL, paramQName, paramVarArgs);
/* 64:   */   }
/* 65:   */   
/* 66:   */   @WebEndpoint(name="MobileCodeWSSoap")
/* 67:   */   public MobileCodeWSSoap getMobileCodeWSSoap()
/* 68:   */   {
/* 69:74 */     return (MobileCodeWSSoap)super.getPort(new QName("http://WebXml.com.cn/", "MobileCodeWSSoap"), MobileCodeWSSoap.class);
/* 70:   */   }
/* 71:   */   
/* 72:   */   @WebEndpoint(name="MobileCodeWSSoap")
/* 73:   */   public MobileCodeWSSoap getMobileCodeWSSoap(WebServiceFeature... paramVarArgs)
/* 74:   */   {
/* 75:86 */     return (MobileCodeWSSoap)super.getPort(new QName("http://WebXml.com.cn/", "MobileCodeWSSoap"), MobileCodeWSSoap.class, paramVarArgs);
/* 76:   */   }
/* 77:   */   
/* 78:   */   private static URL __getWsdlLocation()
/* 79:   */   {
/* 80:90 */     if (MOBILECODEWS_EXCEPTION != null) {
/* 81:91 */       throw MOBILECODEWS_EXCEPTION;
/* 82:   */     }
/* 83:93 */     return MOBILECODEWS_WSDL_LOCATION;
/* 84:   */   }
/* 85:   */ }



/* Location:           C:\Users\Administrator\Desktop\test.jar

 * Qualified Name:     Users.Administrator.Desktop.cn.com.webxml.MobileCodeWS

 * JD-Core Version:    0.7.0.1

 */