/*  1:   */ package http.webxml;
/*  2:   */ 
/*  3:   */ import javax.xml.bind.annotation.XmlAccessType;
/*  4:   */ import javax.xml.bind.annotation.XmlAccessorType;
/*  5:   */ import javax.xml.bind.annotation.XmlRootElement;
/*  6:   */ import javax.xml.bind.annotation.XmlType;
/*  7:   */ 
/*  8:   */ @XmlAccessorType(XmlAccessType.FIELD)
/*  9:   */ @XmlType(name="", propOrder={"mobileCode", "userID"})
/* 10:   */ @XmlRootElement(name="getMobileCodeInfo")
/* 11:   */ public class GetMobileCodeInfo
/* 12:   */ {
/* 13:   */   protected String mobileCode;
/* 14:   */   protected String userID;
/* 15:   */   
/* 16:   */   public String getMobileCode()
/* 17:   */   {
/* 18:50 */     return this.mobileCode;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void setMobileCode(String paramString)
/* 22:   */   {
/* 23:62 */     this.mobileCode = paramString;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public String getUserID()
/* 27:   */   {
/* 28:74 */     return this.userID;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setUserID(String paramString)
/* 32:   */   {
/* 33:86 */     this.userID = paramString;
/* 34:   */   }
/* 35:   */ }



/* Location:           C:\Users\Administrator\Desktop\test.jar

 * Qualified Name:     Users.Administrator.Desktop.cn.com.webxml.GetMobileCodeInfo

 * JD-Core Version:    0.7.0.1

 */