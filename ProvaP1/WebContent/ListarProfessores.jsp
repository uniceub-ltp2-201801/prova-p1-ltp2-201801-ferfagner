<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="Model.Disciplina" %>
      <%@page import="Model.Professor" %>
       <%@page import="Dao.DisciplinaDao" %>
        <%@page import="Dao.ProfessorDao" %>
         
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Professores:</h2>
 <% ArrayList <Disciplina> disci = (ArrayList<Disciplina>) request.getAttribute("disciplina");
          for(int i = 0; i < disci.size(); i++) {%>
        
         <%=disci.get(i).getNome() %>
         <%=disci.get(i).getIddisciplina()%>
         <%=disci.get(i).getIdprofessor() %>
         <%=disci.get(i).getCargahoraria() %>
         <%=disci.get(i).getCurso() %>
          

<%} %>
</body>
</html>