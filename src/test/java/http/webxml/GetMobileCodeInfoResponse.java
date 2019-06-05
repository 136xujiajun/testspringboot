/*  1:   */ package http.webxml;
/*  2:   */ 
/*  3:   */ import javax.xml.bind.annotation.XmlAccessType;
/*  4:   */ import javax.xml.bind.annotation.XmlAccessorType;
/*  5:   */ import javax.xml.bind.annotation.XmlRootElement;
/*  6:   */ import javax.xml.bind.annotation.XmlType;
/*  7:   */ 
/*  8:   */ @XmlAccessorType(XmlAccessType.FIELD)
/*  9:   */ @XmlType(name="", propOrder={"getMobileCodeInfoResult"})
/* 10:   */ @XmlRootElement(name="getMobileCodeInfoResponse")
/* 11:   */ public class GetMobileCodeInfoResponse
/* 12:   */ {
/* 13:   */   protected String getMobileCodeInfoResult;
/* 14:   */   
/* 15:   */   public String getGetMobileCodeInfoResult()
/* 16:   */   {
/* 17:47 */     return this.getMobileCodeInfoResult;
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void setGetMobileCodeInfoResult(String paramString)
/* 21:   */   {
/* 22:59 */     this.getMobileCodeInfoResult = paramString;
/* 23:   */   }
/* 24:   */ }



/* Location:           C:\Users\Administrator\Desktop\test.jar

 * Qualified Name:     Users.Administrator.Desktop.cn.com.webxml.GetMobileCodeInfoResponse

 * JD-Core Version:    0.7.0.1

 */