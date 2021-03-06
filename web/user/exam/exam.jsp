<%@page import="org.json.simple.parser.JSONParser"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="row">
	<div class="col-lg-12">
		<h2 class="page-header">${exam.getExamTitle()}</h2>
	</div>
	<!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
	<div class="col-md-10">
		<div class="panel panel-default">
			<div class="panel-body">
				<% int x = 1; %>
				<c:forEach items="${examQ}" var="q">
					<div class="row">
						<div class="col-md-4">
							<strong>Question #<%=x%></strong>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<h6>${q.get(0)}</h6>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<% int y = 0; %>
							<c:forEach items="${q.get(1)}" var="cho">
								<div class="radio">
									<label>
										<input type="radio" name="radio1" value="option1">
										${cho.get(y)}
									</label>
								</div>
								<% y++; %>
							</c:forEach>
						</div>
					</div>
					<% x++; %>
				<hr/>
				</c:forEach>
			</div>
			<div class="row">
				<div class="col-md-4 pull-right">
					<ul class="pagination">
					<li><a href="#" class="disabled">&laquo;</a></li>
					<li><a href="#" class="active">1</a></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">&raquo;</a></li>
				</ul>
				</div>
			</div>
		</div>
	</div>
	<div class="col-md-2">
		<div class="panel panel-default">
			<div class="panel-heading">
				Time
			</div>
			<div class="panel-body">
				<h6>56 mins</h6>
			</div>
		</div>
	</div>
	<div class="col-md-2">
		<div class="panel panel-default">
			<div class="panel-heading">
				Questions Answered
			</div>
			<div class="panel-body">
				<h6>0/20</h6>
			</div>
		</div>
	</div>
</div>
