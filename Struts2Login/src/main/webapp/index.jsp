<%@ taglib prefix="s" uri="/struts-tags"%>
<HTML>
	<BODY>
	<h1>Student Login Application</h1>
<s:form action="verify" >
<s:textfield name="uname" label="Enter User Name" />
<s:textfield name="password" label="Enter Password" />
<s:submit value="Login" align="center"/>
</s:form>
</BODY>
</HTML>


