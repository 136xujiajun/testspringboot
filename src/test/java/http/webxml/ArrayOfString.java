/*  1:   */ package http.webxml;
/*  2:   */ 
/*  3:   */ import java.util.ArrayList;
/*  4:   */ import java.util.List;
/*  5:   */ import javax.xml.bind.annotation.XmlAccessType;
/*  6:   */ import javax.xml.bind.annotation.XmlAccessorType;
/*  7:   */ import javax.xml.bind.annotation.XmlElement;
/*  8:   */ import javax.xml.bind.annotation.XmlType;
/*  9:   */ 
/* 10:   */ @XmlAccessorType(XmlAccessType.FIELD)
/* 11:   */ @XmlType(name="ArrayOfString", propOrder={"string"})
/* 12:   */ public class ArrayOfString
/* 13:   */ {
/* 14:   */   @XmlElement(nillable=true)
/* 15:   */   protected List<String> string;
/* 16:   */   
/* 17:   */   public List<String> getString()
/* 18:   */   {
/* 19:63 */     if (this.string == null) {
/* 20:64 */       this.string = new ArrayList();
/* 21:   */     }
/* 22:66 */     return this.string;
/* 23:   */   }
/* 24:   */ }



/* Location:           C:\Users\Administrator\Desktop\test.jar

 * Qualified Name:     Users.Administrator.Desktop.cn.com.webxml.ArrayOfString

 * JD-Core Version:    0.7.0.1

 */