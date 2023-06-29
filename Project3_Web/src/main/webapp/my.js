async function login()
{
	let data = JSON.stringify({action:'login'});
	let response = await fetch('main', {method:'post', body:data});
	let responseText = await response.text();
	console.log(responseText);
	
	document.getElementById('loginDiv').innerHTML=responseText;
}

async function signUp()
{
	let data = JSON.stringify({action:'signUp'});
	let response = await fetch('main', {method:'post', body:data});
	let responseText = await response.text();
	console.log(responseText);
	
	document.getElementById('loginDiv').innerHTML=responseText;
}