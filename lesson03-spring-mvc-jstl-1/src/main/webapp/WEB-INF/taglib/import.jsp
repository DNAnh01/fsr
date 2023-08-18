<!--  
Dòng này khai báo việc sử dụng thư viện JSTL Core.
prefix="c": Đây là tiền tố mà bạn sẽ sử dụng để gọi các thẻ JSTL Core trong mã JSP.
uri="http://java.sun.com/jsp/jstl/core": Đây là địa chỉ URL mà JSTL Core được định nghĩa.
-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- 
Dòng này khai báo việc sử dụng thư viện Spring Form.
prefix="form": Đây là tiền tố mà bạn sẽ sử dụng để gọi các thẻ Spring Form trong mã JSP.
uri="http://www.springframework.org/tags/form": Đây là địa chỉ URL mà Spring Form được định nghĩa.
 -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- 
${pageContext.request.contextPath} là một biểu thức EL (Expression Language) được sử dụng để lấy đường dẫn gốc của ứng dụng web (context path).
 -->
<c:set var="contextPath" value="${pageContext.request.contextPath }"></c:set>

