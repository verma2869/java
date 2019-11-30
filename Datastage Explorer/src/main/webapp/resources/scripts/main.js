/*global jQuery, d3, dagreD3, DAG */

(function () {
    'use strict';
    window.DAG = {
        displayGraph: function (graph, dagNameElem, svgElem) {
            dagNameElem.text(graph[0].name);
            this.renderGraph(graph[0], svgElem);
        },

        renderGraph: function (graph, svgParent) {
            var nodes = graph.nodes;
            var links = graph.links;

            var graphElem = svgParent.children('g').get(0);
            var svg = d3.select(graphElem);
            var renderer = new dagreD3.Renderer();
            var layout = dagreD3.layout().rankDir('LR');
            renderer.layout(layout).run(dagreD3.json.decode(nodes, links), svg.append('g'));

            // Adjust SVG height to content
            var main = svgParent.find('g > g');
            var h = main.get(0).getBoundingClientRect().height;
            var newHeight = h + 40;
            newHeight = newHeight < 500 ? 500 : newHeight;
            svgParent.height(newHeight);

            // Adjust SVG width to content
            var w = main.get(0).getBoundingClientRect().width;
            var newWidth = w + 40;
            newWidth = newWidth < 800 ? 800 : newWidth;
            svgParent.width(newWidth);

            // Zoom
            d3.select(svgParent.get(0)).call(d3.behavior.zoom().on('zoom', function () {
                var ev = d3.event;
                svg.select('g')
                    .attr('transform', 'translate(' + ev.translate + ') scale(' + ev.scale + ')');
            }));
        }
    };
})();

(function () {
    'use strict';
    var jobName = "";
    var params = window.location.search.slice(1).split("?");
    var id = params[0].split("=");
    if(id.length == 2){
    	jobName = id[1];
    }
    var data = {}
	data["jobName"] = jobName;
    $.ajax({
		type : "GET",
		url : "/DatastageExplorer/getGraphForJob",
		data : data,
		timeout : 600000,
		success : function(data) {
			DAG.displayGraph(JSON.parse(data), jQuery('#dag-name'), jQuery('#dag > svg'));
		},
		error : function(e) {
			alert("Error while preparing graph for job: " + jobName);
			var data = '[{ "name" :"dummy-job", "nodes": [{"id":"node1", "value" : {"label" : "node1"}},{"id" : "node2", "value" : {"label":"node2"}},{"id" : "node3", "value" : {"label":"node3"}},{"id" : "node4", "value" : {"label":"node4"}},{"id" : "node5", "value" : {"label":"node5"}},{"id" : "node6", "value" : {"label":"node6"}}], "links" : [{"u":"node1","v":"node2","value": {"label" : ""}}, {"u":"node3","v":"node4","value": {"label" : ""}}, {"u":"node2","v":"node5","value": {"label" : ""}}, {"u":"node4","v":"node5","value": {"label" : ""}}, {"u":"node5","v":"node6","value": {"label" : ""}}]}]';
		    DAG.displayGraph(JSON.parse(data), jQuery('#dag-name'), jQuery('#dag > svg'));
		}
	});
}());