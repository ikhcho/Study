/**
 * 
 */

var timer;
var istrue = false;
var delay = 500; // how much long u have to hold click in MS


//mousedown for mobile
function holdCheck(id)
{
	if(device == 'mobile'){
		istrue = true;
		timer = setTimeout(function(){ 
			if(timer){
				clearTimeout(timer);
			}
			if(istrue){
				checkFlag(id);
			}
		},delay);
	}
}

//mousedbclick
function quickCheck(id)
{
	var perfect = true;
	var row = Number(id.split('/')[0]);
	var col = Number(id.split('/')[1]);
	//perfect check
	for(var i=(row-1); i<=(row+1); i++){
		for(var j = (col-1); j<=(col+1); j++){
			if (i < 0 || j < 0 || i >= size || j >= size){
				continue;
			}else{
				btnId = i+'/'+j;
				if(answerField[i][j] == 9 && document.getElementById(btnId).getAttribute("class") !='flag'){
					perfect = false;
				}
			}
		}
	}
	
	//confirm
	if(perfect){
		sweeper++; //중복
		correctCount++; //중복
		nonMine(row,col);
	}
}

//mouseup
function mouseCheck(id){
	istrue =false;
	var timer;
	var btn = event.button;
	if(btn == 2){
		checkFlag(id);
	}else{
		if(document.getElementById(id).getAttribute("class")=='flag'){
			function prevent(event){
				 event.preventDefault()
			};
		}else{
			checkMine(id);
		}
	}
}

function checkFlag(id){
	
	if(document.getElementById(id).getAttribute("class")=='flag'){
		blankField(id);
	}else{
		flagField(id);
	}
	endCheck();
}

function checkMine(id){
	var row = Number(id.split('/')[0]);
	var col = Number(id.split('/')[1]);
	
	switch(answerField[row][col]){
		case 0:
			nonMine(row,col);
			break;
		case 9:
			answer();
			break;
		default :
			numberField(id);
	}
	endCheck();
}

function nonMine(row, col){
	var btnId = row + '/' + col;
	document.getElementById(btnId).disabled='disabled';
	sweeper--;
	correctCount--;
	for (var i = (row - 1); i <= (row + 1); i++) {
		for (var j = (col - 1); j <= (col + 1); j++) {
			btnId = i+'/'+j;
			if ((i == row && j == col) || i < 0 || j < 0 || i >= size || j >= size || answerField[i][j] == 10){
				continue;
			}else{
				if(answerField[i][j] == 0 && document.getElementById(btnId).disabled == false){
					nonMine(i,j);
				}else if(answerField[i][j] != 0 && answerField[i][j] != 9 && document.getElementById(btnId).getAttribute("class") !='confirm'){
					numberField(btnId);
				}
			}
		}
	}
	document.getElementById("leftSweeper").innerHTML = sweeper;
	document.getElementById("leftMine").innerHTML = leftMine;
	endCheck();
}

function endCheck(){
	if(correctCount == 0){
		alert('종료');
		answer();
	}
}
