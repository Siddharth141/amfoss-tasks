extern crate regex;
use regex :: Regex;


fn main() 
{
	let re = Regex::new(r"/^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}$.").unwrap();

	let email = String::new();
    println!("Enter the email :");

    println!("valid email {}", re.is_match(email));
   
   
	
}