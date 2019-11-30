var job = "";
function activeSubList(id) {
	$("#" + id + " ul").show();
}

function activeStageList(id) {
	$(".job-properties-column").hide();
	$(".input-column").hide();
	$(".output-column").hide();
	$(".input-properties-column").hide();
	$(".output-properties-column").hide();
	$(".stage-properties-column").hide();
	sendRequestForStageNames(id);
	$(".stage-column").show();
}

function activeJobPropertiesTable(id) {
	$(".stage-column").hide()
	$(".input-column").hide();
	$(".output-column").hide();
	$(".input-properties-column").hide();
	$(".output-properties-column").hide();
	$(".stage-properties-column").hide();
	sendRequestForJobProperties(id);
	$(".job-properties-column").show()
}

function showGraph(id){
	window.open().document.location.href = "resources/jobGraph.html?id=" + id;
}

function activeInputList(id) {
	$(".output-column").hide();
	$(".stage-properties-column").hide();
	$(".output-properties-column").hide();
	sendRequestForInputList(id);
	$(".input-column").show();
}

function activeOutputList(id) {
	$(".input-column").hide();
	$(".stage-properties-column").hide();
	$(".input-properties-column").hide();
	sendRequestForOutputList(id)
	$(".output-column").show();
}

function activeStagePropertiesTable(id) {
	$(".input-column").hide();
	$(".output-column").hide();
	$(".input-properties-column").hide();
	$(".output-properties-column").hide();
	sendRequestForStageProperties(id)
	$(".stage-properties-column").show();
}

function activeInputPropertiesTable(id) {
	$(".output-properties-column").hide();
	sendRequestForInputProperties(id);
	$(".input-properties-column").show();
}

function activeOutputPropertiesTable(id) {
	$(".input-properties-column").hide();
	sendRequestForOutputProperties(id);
	$(".output-properties-column").show();
}
$(function() {
	$("#startButton").click(function() {
		var data = {}
		data["filePath"] = $("#inputFilePath").val();
		$("#startButton").prop("disabled", true);
		$.ajax({
			type : "GET",
			url : "/DatastageExplorer/getJobs",
			data : data,
			timeout : 600000,
			success : function(data) {
				$(".job-column").show();
				$(".jobList").html(data);
			},
			error : function(e) {
				$("#startButton").prop("disabled", false);
				alert("Error while parsing input file.");
			}
		});
	});
});
function sendRequestForStageNames(jobName) {
	var data = {}
	data["filePath"] = $("#inputFilePath").val();
	data["jobName"] = jobName;
	job = jobName;
	$.ajax({
		type : "GET",
		url : "/DatastageExplorer/getStagesForJob",
		data : data,
		timeout : 600000,
		success : function(data) {
			$(".stageList").html(data);
		},
		error : function(e) {
			alert("Error reading records for job: " + jobName);
		}
	});
}

function sendRequestForJobProperties(jobName) {
	var data = {}
	data["filePath"] = $("#inputFilePath").val();
	data["jobName"] = jobName;
	job = jobName;
	$.ajax({
		type : "GET",
		url : "/DatastageExplorer/getPropertiesForJob",
		data : data,
		timeout : 600000,
		success : function(data) {
			$(".job-properties-table").html(data);
		},
		error : function(e) {
			alert("Error reading properties for Job: " + jobName);
		}
	});
}

function sendRequestForInputList(stageName) {
	var data = {}
	data["filePath"] = $("#inputFilePath").val();
	data["jobName"] = job;
	data["stageName"] = stageName;
	$.ajax({
		type : "GET",
		url : "/DatastageExplorer/getInputsForStage",
		data : data,
		timeout : 600000,
		success : function(data) {
			$(".inputList").html(data);
		},
		error : function(e) {
			alert("Error reading Inputs for stage: " + stageName);
		}
	});
}

function sendRequestForInputProperties(inputId) {
	var data = {}
	data["filePath"] = $("#inputFilePath").val();
	data["jobName"] = job;
	data["inputId"] = inputId;
	$.ajax({
		type : "GET",
		url : "/DatastageExplorer/getInputProperties",
		data : data,
		timeout : 600000,
		success : function(data) {
			$(".input-properties-table").html(data);
		},
		error : function(e) {
			alert("Error reading Properties for stage: " + stageName);
		}
	});
}

function sendRequestForOutputList(stageName) {
	var data = {}
	data["filePath"] = $("#inputFilePath").val();
	data["jobName"] = job;
	data["stageName"] = stageName;
	$.ajax({
		type : "GET",
		url : "/DatastageExplorer/getOutputsForStage",
		data : data,
		timeout : 600000,
		success : function(data) {
			$(".outputList").html(data);
		},
		error : function(e) {
			alert("Error reading Outputs for stage: " + stageName);
		}
	});
}

function sendRequestForOutputProperties(outputId) {
	var data = {}
	data["filePath"] = $("#inputFilePath").val();
	data["jobName"] = job;
	data["outputId"] = outputId;
	$.ajax({
		type : "GET",
		url : "/DatastageExplorer/getOutputProperties",
		data : data,
		timeout : 600000,
		success : function(data) {
			$(".output-properties-table").html(data);
		},
		error : function(e) {
			alert("Error reading Properties for Input: " + input);
		}
	});
}

function sendRequestForStageProperties(stageName) {
	var data = {}
	data["filePath"] = $("#inputFilePath").val();
	data["jobName"] = job;
	data["stageName"] = stageName;
	$.ajax({
		type : "GET",
		url : "/DatastageExplorer/getPropertiesForStage",
		data : data,
		timeout : 600000,
		success : function(data) {
			$(".stage-properties-table").html(data);
		},
		error : function(e) {
			alert("Error reading Properties for stage: " + stageName);
		}
	});
}

$(document).ready(function() {
	$("td").on("dblclick", function() {
		var content = $(this).val();
		var newWindow = window.open("");
		newWindow.documnet.body.text = content;
	});
});