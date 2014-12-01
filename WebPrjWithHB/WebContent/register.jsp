<%@page import="dao.UserDAO"%>  
<jsp:useBean id="obj" class="persistentObject.User">  
</jsp:useBean>  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
int i=UserDAO.register(obj);  
if(i>0)  
out.print("You are successfully registered");  
  
%>  