<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<title>Reservation not available</title>
</head>
<body>
Your reservation for ${ex.courtName} is not available on
<fmt:formatDate value="${ex.date}" pattern="dd-MMM-yyyy"/>at ${ex.hour}:00.
</body>
</html>