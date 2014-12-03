<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>All Items</title>
<style>
.table {
	width: 75%;
	margin-bottom: 20px;
}
</style>

<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script>



<script type=text/javascript>

var itemDialog,itemForm;

$(function() {
    var dialog, form,
 
      // From http://www.whatwg.org/specs/web-apps/current-work/multipage/states-of-the-type-attribute.html#e-mail-state-%28type=email%29
      emailRegex = /^[a-zA-Z0-9.!#$%&'*+\/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$/,
      name = $( "#name" ),
      email = $( "#email" ),
      password = $( "#password" ),
      allFields = $( [] ).add( name ).add( email ).add( password ),
      tips = $( ".validateTips" );
 
    function updateTips( t ) {
      tips
        .text( t )
        .addClass( "ui-state-highlight" );
      setTimeout(function() {
        tips.removeClass( "ui-state-highlight", 1500 );
      }, 500 );
    }
 
    function checkLength( o, n, min, max ) {
      if ( o.val().length > max || o.val().length < min ) {
        o.addClass( "ui-state-error" );
        updateTips( "Length of " + n + " must be between " +
          min + " and " + max + "." );
        return false;
      } else {
        return true;
      }
    }
 
    function checkRegexp( o, regexp, n ) {
      if ( !( regexp.test( o.val() ) ) ) {
        o.addClass( "ui-state-error" );
        updateTips( n );
        return false;
      } else {
        return true;
      }
    }
 
 /*    function addUser() {
    	
      debugger	
      var valid = true;
      allFields.removeClass( "ui-state-error" );
 
      valid = valid && checkLength( name, "username", 3, 16 );
      valid = valid && checkLength( email, "email", 6, 80 );
      valid = valid && checkLength( password, "password", 5, 16 );
 
      valid = valid && checkRegexp( name, /^[a-z]([0-9a-z_\s])+$/i, "Username may consist of a-z, 0-9, underscores, spaces and must begin with a letter." );
      valid = valid && checkRegexp( email, emailRegex, "eg. ui@jquery.com" );
      valid = valid && checkRegexp( password, /^([0-9a-zA-Z])+$/, "Password field only allow : a-z 0-9" );
 
      if ( valid ) {
        $( "#users tbody" ).append( "<tr>" +
          "<td>" + name.val() + "</td>" +
          "<td>" + email.val() + "</td>" +
          "<td>" + password.val() + "</td>" +
        "</tr>" );
        dialog.dialog( "close" );
      }
      return valid;
    } */
 
    dialog = $( "#dialog-form" ).dialog({
      autoOpen: false,
      height: 400,
      width: 550,
      modal: true,
      buttons: {
      //  "Create an account": addUser,
        Cancel: function() {
          dialog.dialog( "close" );
        }
      },
      close: function() {
        form[ 0 ].reset();
        allFields.removeClass( "ui-state-error" );
      }
    });
 
    form = dialog.find( "form" ).on( "submit", function( event ) {
      document.forms["saveAddress"].submit();
      dialog.dialog( "close" );
    });
    
 
    $( "#create-user" ).button().on( "click", function() {
      dialog.dialog( "open" );
    });
    
    
  
    
    itemDialog = $( "#dialog-item" ).dialog({
        autoOpen: false,
        height: 400,
        width: 550,
        modal: true,
        buttons: {
        //  "Create an account": addUser,
          Cancel: function() {
        	  itemDialog.dialog( "close" );
          }
        },
        close: function() {
          form[ 0 ].reset();
          allFields.removeClass( "ui-state-error" );
        }
      });
    
    

    $( "#add_item" ).button().on( "click", function() {
    		itemDialog.dialog( "open" );
    });
    
  
    
  });




function getItemList(itemId){

  if(itemId!=null){
	  
	  
	  
	  $.ajax({
		  url: '/ShopApp/viewItems?itemId='+itemId,
		  datatype : "json",
		  type: "GET", 
		  success:function(response){
			 
			  var html="";
			  $.each(response, function(key,value) {
				  html +='<tr><td>'+value.itemId+'</td><td>'+value.code+'</td><td>'+value.particulars+'</td><td>'+value.uom+'</td><td>'+value.type+'</td><td>Yes</td></tr>';
			  }); 
			  
			  if(html==''){
				  
				  $('#item_list_id').html("No Items Found...");
				  
			  }else{
				  $('#item_list_id').html(html);  
			  }
		  }
		
	});
  }	
	
}



  


function addNewItem(itemId){
	
	
	  debugger
	  itemDialog.dialog( "open" );
	 //document.forms["saveNewItem"].submit();
	
   /*  itemForm = itemDialog.find( "form" ).on( "submit", function( event ) {
        document.forms["saveNewItem"].submit();
        dialog.dialog( "close" );
      });
	     */
	    
	    
	
	
}


</script>
</head>
<body>
	<h3>
		<a class="btn btn-info" id="create-user">Add Group</a> <!-- <a class="btn btn-info" id="add_item">Add Item</a> -->
		<!-- - <button id="create-user"  class="btn btn-info">Add Item</button> -->
	</h3>



	<table class="table table-striped table-bordered" align="center">
		<tr>
			<td>

				<table class="table table-striped table-bordered" align="center">
					<caption>
						<h3>
							<b>Item Groups</b>
						</h3>
					</caption>
					<tr>
						<th>S No.</th>
						<th>Code</th>
						<th>Material Groups</th>
						<th>Glass Item</th>
						<th>Action</th>
					</tr>
					<tbody id="item_group_id">
						<c:if test="${!empty items}">
							<c:forEach items="${items}" var="item">
								<tr>
									<td><c:out value="${item.itemGroupId}" /></td>
									<td><c:out value="${item.groupCode}" /></td>
									<td><c:out value="${item.description}" /></td>
									<td><c:out value="${item.glassItem}" /></td>

									<td align="center"><a
										onclick="getItemList(${item.itemGroupId});" href="#">View
											Item</a> / <a onclick="addNewItem(${item.itemGroupId});" href="#"
										id="add_item">Add Item</a></td>
								</tr>
							</c:forEach>
						</c:if>
					</tbody>
				</table>
			</td>
			<td>

				<table class="table table-striped table-bordered" align="center">
					<caption>
						<h3>
							<b>Item List</b>
						</h3>
					</caption>
					<tr>
						<th>S No.</th>
						<th>IT Code</th>
						<th>Material Description</th>
						<th>UOM</th>
						<th>ExCode</th>
						<th>Glass</th>
					</tr>
					<tbody id="item_list_id">


					</tbody>
				</table>
			</td>
		</tr>

	</table>


	<div id="dialog-form" title="Add new Group">
		<p class="validateTips">All form fields are required.</p>
		<c:url var="add" value="saveItemGroup.html" />
		<form:form id="saveAddress" modelAttribute="ItemGroupBean"
			action="${add}">
			<table width="400px" height="150px">
				<tr>
					<td><form:label path="groupCode">Group Code</form:label></td>
					<td><form:input path="groupCode" /></td>
				</tr>

				<tr>
					<td><form:label path="glassItem">Glass Item</form:label></td>
					<td><form:select path="glassItem">
							<form:option value="" label="--- Select ---" />
							<form:options items="${glassList}" />
						</form:select></td>
				</tr>


				<tr>
					<td><form:label path="description">Description</form:label></td>
					<td><form:input path="description" /></td>
				</tr>

				<tr>
					<td></td>
					<td><input type="submit" value="Submit" name="submit" /></td>
				</tr>
			</table>
		</form:form>
	</div>


	<div id="dialog-item" title="Add new Item">
		<p class="validateTips">All form fields are required.</p>
		<c:url var="add" value="saveNewItem.html" />
		<form:form id="saveItem" modelAttribute="ItemsBean"
			action="${add}">
			<table width="400px" height="150px">
				<tr>
					<td><form:label path="type">Type</form:label></td>
					<td><form:input path="type" /></td>
				</tr>

				<%-- <tr>
					<td><form:label path="glassItem">Glass Item</form:label></td>
					<td><form:select path="glassItem">
							<form:option value="" label="--- Select ---" />
							<form:options items="${glassList}" />
						</form:select></td>
				</tr> --%>


				<tr>
					<td><form:label path="code">Code</form:label></td>
					<td><form:input path="code" /></td>
				</tr>
				
				<tr>
					<td><form:label path="particulars">Particulars</form:label></td>
					<td><form:input path="particulars" />
					
						<form:hidden path="itemId" />
					</td>
				</tr>
				

				<tr>
					<td></td>
					<td><input type="submit" value="Submit" name="submit" /></td>
				</tr>
			</table>
		</form:form>
	</div>


</body>
</html>