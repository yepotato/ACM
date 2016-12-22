function debug(msg){
	alert(msg);
  		var log = document.getElementById("debugLog");
  		if(!log){
  			log = document.createElement("div");
  			log.id="debugLog";
  			log.innerHTML="<h1>Debug Log</h1>";
  			document.body.appendChild(log);
  		}
  		var pre = document.createElement("pre");
  		var text = document.createTextNode(msg);
  		log.appendChild(text);
  		log.appendChild(pre);
  	}