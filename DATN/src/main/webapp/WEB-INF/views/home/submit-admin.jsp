<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!-- Breadcrumb Section Begin -->
<div class="breacrumb-section">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="breadcrumb-text">
					<a href="#"><i class="fa fa-home"></i> Home</a> <span>Change
						Password</span>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- Breadcrumb Form Section Begin -->

<!-- Register Section Begin -->
<div class="register-login-section spad">
	<div class="container">
		<div class="row">
			<div class="col-lg-6 offset-lg-3">
				<div class="login-form">
					<h2>Confirm admin</h2>
					<form method="post">
						<h5 class="text-danger">${message}</h5>
						<div class="group-input">
							Role:
							<form:select path="staffadmin" cssClass="form-control">
								<c:forEach items="${sizeList}" var="s" varStatus="status">
									<c:choose>
										<form:option value="${s.name}"/>${s.name}
									</c:choose>
								</c:forEach>
								
							</form:select>
							<button type="submit" class="site-btn login-btn">For</button>
						</div>
						<div class="group-input">
							<label for="con-pass">Mã Xác Nhận *</label> <input type="text"
								id="Conficode" name="Conficode">
						</div>
						<button type="submit" class="site-btn login-btn">Confirm</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- Register Form Section End -->