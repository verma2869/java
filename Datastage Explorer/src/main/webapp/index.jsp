<!DOCTYPE 
html>
<html>
<head>
<title>Datastage Explorer</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="resources/script.js"></script>
<style>
* {
	box-sizing: border-box;
}

li {
	cursor: pointer;
}
/* Create four equal columns that floats next to each other */
.column {
	float: left;
	width: 24%;
	padding: 25px;
	height: 500px;
	border-style: solid;
	border-width: 2px;
	margin: 4px;
	overflow: auto;
	/* Should be removed. Only for demonstration */
}

table {
	width: 100%;
	border-collapse: collapse;
	table-layout: fixed;
}

table td {
	word-wrap: break-word;
	maxlength: "50";
}

.jobs {
	overflow: auto;
	height: 500px;
}
/* Clear floats after the columns */
.row:after {
	content: "";
	display: table;
	clear: both;
}
</style>
</head>

<body>
	<h2>Datastage Explorer</h2>
	<b>Input File Path:</b>
	<input type="text" id="inputFilePath">
	<button id="startButton">Process</button>
	<div class="row">
		<div class="column job-column" hidden="true">
			<h4>Job Names</h4>
			<div class="jobs">
				<ul class="jobList">
					<li onclick="activeSubList('j1')" id="j1">Job 1
						<ul hidden="true">
							<li onclick="activeStageList('j1')">Stage List</li>
							<li onclick="activeJobPropertiesTable('j1')">Properties</li>
							<li onclick="showGraph('j1')">Graph</li>
						</ul>
					</li>
					<li onclick="activeSubList('j2')" id="j2">Job 2
						<ul hidden="true">
							<li onclick="activeStageList('j2')">Stage List</li>
							<li onclick="activeJobPropertiesTable('j2')">Properties</li>
							<li onclick="showGraph('j2')">Graph</li>
						</ul>
					</li>
				</ul>
			</div>
		</div>
		<div class="column stage-column" hidden="true">
			<h4>Stage Names</h4>
			<div class="stages">
				<ul class="stageList">
					<li onclick="activeSubList('s1')" id="s1">Stage 1
						<ul hidden="true">
							<li onclick="activeInputList('s1')">Input Nodes</li>
							<li onclick="activeOutputList('s1')">Output Nodes</li>
							<li onclick="activeStagePropertiesTable('s1')">Properties</li>
						</ul>
					</li>
					<li onclick="activeSubList('s2')" id="s2">Stage 2
						<ul hidden="true">
							<li onclick="activeInputList('s2')">Input Nodes</li>
							<li onclick="activeOutputList('s2')">Output Nodes</li>
							<li onclick="activeStagePropertiesTable('s2')">Properties</li>
						</ul>
					</li>
				</ul>
			</div>
		</div>
		<div class="column job-properties-column" hidden="true">
			<h4>Properties</h4>
			<div class="properties job-properties-table">
				<table border="1">
					<tr>
						<th>Name</th>
						<th>Value</th>
					</tr>
					<tr>
						<td>Prop 1</td>
						<td>Val 1</td>
					</tr>
					<tr>
						<td>Prop 2</td>
						<td>Val 2</td>
					</tr>
					<tr>
						<td>Prop 3</td>
						<td>Val 3</td>
					</tr>
					<tr>
						<td>Prop 4</td>
						<td>Val 4</td>
					</tr>
				</table>
			</div>
		</div>
		<div class="column input-column" hidden="true">
			<h4>Input List</h4>
			<div class="inputs">
				<ul class="inputList">
					<li onclick="activeInputPropertiesTable('i1')">Input 1</li>
					<li onclick="activeInputPropertiesTable('i2')">Input 2</li>
				</ul>
			</div>
		</div>
		<div class="column output-column" hidden="true">
			<h4>Output List</h4>
			<div class="outputs">
				<ul class="outputList">
					<li onclick="activeOutputPropertiesTable('o1')">Output 1</li>
					<li onclick="activeOutputPropertiesTable('o2')">Output 2</li>
				</ul>
			</div>
		</div>
		<div class="column stage-properties-column" hidden="true">
			<h4>Properties</h4>
			<div class="properties stage-properties-table">
				<table border="1">
					<thead>
						<tr>
							<th>Name</th>
							<th>Value</th>
						</tr>
					</thead>
					<tr>
						<td>Stage Prop 1</td>
						<td>Stage Val 1</td>
					</tr>
					<tr>
						<td>Stage Prop 2</td>
						<td>Stage Val 2</td>
					</tr>
					<tr>
						<td>Stage Prop 3</td>
						<td>Stage Val 3</td>
					</tr>
					<tr>
						<td>Stage Prop 4</td>
						<td>Stage Val 4</td>
					</tr>
				</table>
			</div>
		</div>
		<div class="column input-properties-column" hidden="true">
			<h4>Properties</h4>
			<div class="properties input-properties-table">
				<table border="1">
					<tr>
						<th>Name</th>
						<th>Value</th>
					</tr>
					<tr>
						<td>Input Prop 1</td>
						<td>Input Val 1</td>
					</tr>
					<tr>
						<td>Input Prop 2</td>
						<td>Input Val 2</td>
					</tr>
					<tr>
						<td>Input Prop 3</td>
						<td>Input Val 3</td>
					</tr>
					<tr>
						<td>Input Prop 4</td>
						<td>Input Val 4</td>
					</tr>
				</table>
			</div>
		</div>
		<div class="column output-properties-column" hidden="true">
			<h4>Properties</h4>
			<div class="properties output-properties-table">
				<table border="1">
					<tr>
						<th>Name</th>
						<th>Value</th>
					</tr>
					<tr>
						<td>Output Prop 1</td>
						<td>Output Val 1</td>
					</tr>
					<tr>
						<td>Output Prop 2</td>
						<td>Output Val 2</td>
					</tr>
					<tr>
						<td>Output Prop 3</td>
						<td>Output Val 3</td>
					</tr>
					<tr>
						<td>Output Prop 4</td>
						<td>Output Val 4</td>
					</tr>
				</table>
			</div>
		</div>
	</div>
</body>
</html>