<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>   
    <script>
      $(document).ready(function(){
        $('ul.first').bsPhotoGallery({
          "classes" : "col-lg-2 col-md-4 col-sm-3 col-xs-4 col-xxs-12",
          "hasModal" : true,
          "fullHeight" : true
        });
      });
    </script>
 
  <div class="container" style="margin-top: 20px;">
  	<legend>${pictureVO.keyword}</legend>
        <ul class="row first">
               <c:forEach items="${requestScope.searchPicture}" var ="pictureVO">
            <li>
           <div class="thumbnail">

		<img alt="${pictureVO.authorComment}" src="${pageContext.request.contextPath}/resources/img/${pictureVO.path}">
		<div class="text"><a href="${pageContext.request.contextPath}/searchDetailPicture.do?pictureDate=${pictureVO.pictureDate}&keyword=${pictureVO.keyword}">상세보기</a></div>
           <div>${pictureVO.pictureDate}</div>
       		<div>${pictureVO.authorComment}</div>	
           </div>
           
        
           </div>
           </li>
        </c:forEach>
           </ul>
  </div>
