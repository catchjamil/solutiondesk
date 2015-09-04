<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Bootstrap 2 Form Builder</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<link href="assets/css/lib/bootstrap.min.css" rel="stylesheet">
<link href="assets/css/lib/bootstrap-responsive.min.css"
	rel="stylesheet">
<link href="assets/css/custom.css" rel="stylesheet">
<!--[if lt IE 9]>
    <script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

<link rel="shortcut icon" href="images/favicon.ico">
<link rel="apple-touch-icon" href="images/apple-touch-icon.png">
<link rel="apple-touch-icon" sizes="72x72"
	href="images/apple-touch-icon-72x72.png">
<link rel="apple-touch-icon" sizes="114x114"
	href="images/apple-touch-icon-114x114.png">
</head>

<body >

	<form class="form-horizontal">
		<fieldset>

			<!-- Form Name -->
			<legend>Add Quotation</legend>
<center>
			<!-- Select Basic -->
			<table border="1"  >
				<tr>
					<td>
						<div class="control-group">
							<label class="control-label" for="selectbasic">Unit</label>
							<div class="controls">
								<select id="selectbasic" name="selectbasic" class="input-large">
									<option>Option one</option>
									<option>Option two</option>
								</select>
							</div>
						</div>
					</td>
				
					<td>
						<!-- Text input-->
						<div class="control-group">
							<label class="control-label" for="qnocode">Quotation No</label>
							<div class="controls">
								<input id="qnocode" name="qnocode" type="text" placeholder=""
									class="input-mini"> <input id="qnumber" name="qnumber"
									type="text" placeholder="" class="input-small"> Date
							</div>
						</div>
					</td>
				
				</tr>
				<tr>
					<td>
						<!-- Select Basic -->
						<div class="control-group">
							<label class="control-label" for="qtype">Quotation Type</label>
							<div class="controls">
								<select id="qtype" name="qtype" class="input-medium">
									<option>Option one</option>
									<option>Option two</option>
								</select>
							</div>
						</div>
					</td>
					<td>
						<!-- Select Basic -->
						<div class="control-group">
							<label class="control-label" for="partyName">Party Name</label>
							<div class="controls">
								<select id="partyName" name="partyName" class="input-xlarge">
									<option>Option one</option>
									<option>Option two</option>
								</select>
							</div>
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<!-- Textarea -->
						<div class="control-group">
							<label class="control-label" for="deliveryAddress">Delivery
								Address</label>
							<div class="controls">
								<textarea id="deliveryAddress" name="deliveryAddress"></textarea>
							</div>
						</div>
					</td>
					<td>
										
						<div class="control-group">
							<label class="control-label" for="bookedBy">Booked By</label>
							<div class="controls">
								<select id="bookedBy"
									name="bookedBy" class="input-medium">
									<option>Option one</option>
									<option>Option two</option>
							</div>
						</div>
						
						
					</td>
					
				</tr>
				<tr >
					<td colspan="2">
						<!-- Text input-->
						<div class="form-horizontal">
							<div class="control-group row-fluid form-inline">

								<label for="phoneNo">Phone No</label> <input id="phoneNo"
									name="phoneNo" type="text" class="input-medium"> <label
									for="prepairedBy">Preapaired By</label> <input id="prepairedBy"
									name="prepairedBy" type="text" class="input-medium"> <label
									for="currency">Currency</label> <select id="currency"
									name="currency" class="input-medium">
									<option>Option one</option>
									<option>Option two</option>
								</select> <label for="custRefNo">Cust Ref No</label> <input
									id="custRefNo" name="custRefNo" type="text"
									class="input-medium">
							</div>

						</div>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<div class="form-horizontal">
							<div class="control-group row-fluid form-inline">
								<label for="paymentMode">Payment Mode </label> <select
									id="paymentMode" name="paymentMode" class="input-medium">
									<option>Option one</option>
									<option>Option two</option>
								</select> <label for="encloser">Encloser</label> <select id="encloser"
									name="encloser" class="input-medium">
									<option>Option one</option>
									<option>Option two</option>
								</select> <label for="roadPermit">Road Permit</label> <select
									id="roadPermit" name="roadPermit" class="input-medium">
									<option>Option one</option>
									<option>Option two</option>
								</select> <label for="deleveryMode">Delevery Mode</label> <select
									id="deleveryMode" name="deleveryMode" class="input-medium">
									<option>Option one</option>
									<option>Option two</option>
								</select>

							</div>
						</div>
					</td>
				</tr>
				
				<tr>
					<td colspan="2">
						<div class="form-horizontal">
							<div class="control-group row-fluid form-inline">
								<label for="application">Application </label> <select
									id="application" name="application" class="input-medium">
									<option>Option one</option>
									<option>Option two</option>
								</select> <label for="staxform">Stax Form</label> <select id="staxform"
									name="staxform" class="input-medium">
									<option>Option one</option>
									<option>Option two</option>
								</select>
							</div>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<div class="form-horizontal">
							<div class="control-group row-fluid form-inline">
								<label for="ratePer">Rate Per</label> <select id="ratePer"
									name="ratePer" class="input-medium">
									<option>Option one</option>
									<option>Option two</option>
								</select> <label for="showDiscount">Show Discount</label> <select
									id="showDiscount" name="showDiscount" class="input-medium">
									<option>Option one</option>
									<option>Option two</option>
								</select> <label for="discount">Discount %</label> <input id="discount"
									name="discount" type="text" placeholder="" class="input-small">

							</div>

						</div>

					</td>
				</tr>
				<tr>
					<td colspan="2">
						<div class="form-horizontal">
							<div class="control-group row-fluid form-inline">
								<label for="rTable">RTable</label> <select id="rTable"
									name="rTable" class="input-medium">
									<option>Option one</option>
									<option>Option two</option>
								</select> <label for="sTable">STable</label> <select id="sTable"
									name="sTable" class="input-medium">
									<option>Option one</option>
									<option>Option two</option>
								</select> <label for="exTable">EXTable</label> <select id="exTable"
									name="exTable" class="input-medium">
									<option>Option one</option>
									<option>Option two</option>
								</select>
							</div>
						</div>
					</td>
				</tr>
			</table>
			</center>
			
		</fieldset>
	</form>
</body>
</html>
