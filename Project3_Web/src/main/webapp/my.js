async function login()
{
	let response = await fetch('main', {method:'get'});
	console.log(response);
}