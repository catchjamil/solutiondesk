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
			<legend>General</legend>
<center>
			<!-- Select Basic -->
			<table border="1"  >
				<tr>
					<td>
						<!-- Text input-->
						<div class="control-group">
							<label class="control-label" for="qnocode">Name</label>
								<input id="name" name="name" type="text" placeholder=""	class="input-mini" /> 
						</div>
						
						
					</td>
				
					<td>
						<!-- Text input-->
						<div class="control-group">
							<label class="control-label" for="qtype">Class</label>
								<select id="cClass" name="cClass" class="input-medium">
									<option>Option one</option>
									<option>Option two</option>
								</select>
							
							<label class="control-label" for="zone">Zone</label>
								<select id="zone" name="zone" class="input-medium">
									<option>Option one</option>
									<option>Option two</option>
								</select>
							
							
						</div>
					</td>
				
				</tr>
				<tr>
					<td>
						<!-- Textarea -->
						<div class="control-group">
							<label class="control-label" for="billingAddress">Billing Address</label>
							<div class="controls">
								<textarea id="billingAddress" name="billingAddress"></textarea>
							</div>
						</div>
					</td>
					<td>
						<!-- Textarea -->
						<div class="control-group">
							<label class="control-label" for="permanentAddress">Permanent Address</label>
							<div class="controls">
								<textarea id="permanentAddress" name="permanentAddress"></textarea>
							</div>
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div class="control-group">
							<label class="control-label" for="cityB">City</label>
								<select id="cityB"	name="cityB" class="input-medium">
									<option>Option one</option>
									<option>Option two</option>
								</select>	
						
						
						
							<label class="control-label" for="stateB">State</label>
								<select id="stateB"	name="stateB" class="input-medium">
									<option>Option one</option>
									<option>Option two</option>
					        </select>
						
							<label class="control-label" for="countryB">Country</label>
								<select id="countryB"
									name="countryB" class="input-medium">
									<option>Option one</option>
									<option>Option two</option>
					         	</select>
					        </div> 	
					        <div class="control-group">
							<label class="control-label" for="pinZipB">Pin/Zip</label>
								<input id="pinZipB" name="pinZipB" type="text" placeholder=""	class="input-mini" /> 
						</div>
					</td>
					<td>
										
						<div class="control-group">
							<label class="control-label" for="cityp">City</label>
								<select id="cityP"	name="cityP" class="input-medium">
									<option>Option one</option>
									<option>Option two</option>
								</select>	
						
						
						
							<label class="control-label" for="stateP">State</label>
								<select id="stateP"	name="stateP" class="input-medium">
									<option>Option one</option>
									<option>Option two</option>
					        </select>
						
							<label class="control-label" for="countryP">Country</label>
								<select id="countryP"
									name="countryP" class="input-medium">
									<option>Option one</option>
									<option>Option two</option>
					         	</select>
					        </div> 	
						<div class="control-group">
							<label class="control-label" for="pinZip">Pin/Zip</label>
								<input id="pinZip" name="pinZip" type="text" placeholder=""	class="input-mini" /> 
						</div>
					
					</td>
					
				</tr>
				<tr >
					<td colspan="2">
						<!-- Text input-->
								<div class="control-group">
							<label class="control-label" for="phoneNo">Phone No</label>
								<input id="phoneNo" name="phoneNo" type="text" placeholder=""	class="input-mini" /> 
						
							<label class="control-label" for="pinZip">Email</label>
								<input id="email" name="email" type="text" placeholder=""	class="input-mini" /> 
						
							<label class="control-label" for="website">Website</label>
								<input id="website" name="website" type="text" placeholder=""	class="input-mini" /> 
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
				
				<tr>
					<td colspan="2">
						<div class="control-group">
							<label class="control-label" for="notes">Notes</label>
							<div class="controls">
								<textarea id="notes" name="notes"></textarea>
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
