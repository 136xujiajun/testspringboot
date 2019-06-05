/*  1:   */ package http.webxml;
/*  2:   */ 
/*  3:   */ import javax.xml.bind.JAXBElement;
/*  4:   */ import javax.xml.bind.annotation.XmlElementDecl;
/*  5:   */ import javax.xml.bind.annotation.XmlRegistry;
/*  6:   */ import javax.xml.namespace.QName;
/*  7:   */ 
/*  8:   */ @XmlRegistry
/*  9:   */ public class ObjectFactory
/* 10:   */ {
/* 11:27 */   private static final QName _String_QNAME = new QName("http://WebXml.com.cn/", "string");
/* 12:28 */   private static final QName _ArrayOfString_QNAME = new QName("http://WebXml.com.cn/", "ArrayOfString");
/* 13:   */   
/* 14:   */   public GetDatabaseInfoResponse createGetDatabaseInfoResponse()
/* 15:   */   {
/* 16:42 */     return new GetDatabaseInfoResponse();
/* 17:   */   }
/* 18:   */   
/* 19:   */   public ArrayOfString createArrayOfString()
/* 20:   */   {
/* 21:50 */     return new ArrayOfString();
/* 22:   */   }
/* 23:   */   
/* 24:   */   public GetMobileCodeInfo createGetMobileCodeInfo()
/* 25:   */   {
/* 26:58 */     return new GetMobileCodeInfo();
/* 27:   */   }
/* 28:   */   
/* 29:   */   public GetDatabaseInfo createGetDatabaseInfo()
/* 30:   */   {
/* 31:66 */     return new GetDatabaseInfo();
/* 32:   */   }
/* 33:   */   
/* 34:   */   public GetMobileCodeInfoResponse createGetMobileCodeInfoResponse()
/* 35:   */   {
/* 36:74 */     return new GetMobileCodeInfoResponse();
/* 37:   */   }
/* 38:   */   
/* 39:   */   @XmlElementDecl(namespace="http://WebXml.com.cn/", name="string")
/* 40:   */   public JAXBElement<String> createString(String paramString)
/* 41:   */   {
/* 42:83 */     return new JAXBElement(_String_QNAME, String.class, null, paramString);
/* 43:   */   }
/* 44:   */   
/* 45:   */   @XmlElementDecl(namespace="http://WebXml.com.cn/", name="ArrayOfString")
/* 46:   */   public JAXBElement<ArrayOfString> createArrayOfString(ArrayOfString paramArrayOfString)
/* 47:   */   {
/* 48:92 */     return new JAXBElement(_ArrayOfString_QNAME, ArrayOfString.class, null, paramArrayOfString);
/* 49:   */   }
/* 50:   */ }



/* Location:           C:\Users\Administrator\Desktop\test.jar

 * Qualified Name:     Users.Administrator.Desktop.cn.com.webxml.ObjectFactory

 * JD-Core Version:    0.7.0.1

 */