/*  1:   */ package http.webxml;
/*  2:   */ 
/*  3:   */ import javax.xml.bind.annotation.XmlAccessType;
/*  4:   */ import javax.xml.bind.annotation.XmlAccessorType;
/*  5:   */ import javax.xml.bind.annotation.XmlRootElement;
/*  6:   */ import javax.xml.bind.annotation.XmlType;
/*  7:   */ 
/*  8:   */ @XmlAccessorType(XmlAccessType.FIELD)
/*  9:   */ @XmlType(name="", propOrder={"getDatabaseInfoResult"})
/* 10:   */ @XmlRootElement(name="getDatabaseInfoResponse")
/* 11:   */ public class GetDatabaseInfoResponse
/* 12:   */ {
/* 13:   */   protected ArrayOfString getDatabaseInfoResult;
/* 14:   */   
/* 15:   */   public ArrayOfString getGetDatabaseInfoResult()
/* 16:   */   {
/* 17:47 */     return this.getDatabaseInfoResult;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setGetDatabaseInfoResult(ArrayOfString paramArrayOfString)
/* 21:   */   {
/* 22:59 */     this.getDatabaseInfoResult = paramArrayOfString;
/* 23:   */   }
/* 24:   */ }



/* Location:           C:\Users\Administrator\Desktop\test.jar

 * Qualified Name:     Users.Administrator.Desktop.cn.com.webxml.GetDatabaseInfoResponse

 * JD-Core Version:    0.7.0.1

 */