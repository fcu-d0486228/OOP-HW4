package fcu.iecs.oop.password;

public class PasswordEncorder{
	public String encode(String password){
		String encoded = "";
		char temp;
		
		for(int i=0; i<password.length(); i++){
			temp = password.charAt(i);
			
			// or use switch
			if(temp == 'A' || temp == 'a'){
				encoded += 4;
			}
			else if(temp == 'E' || temp == 'e'){
				encoded += 3;
			}
			else if(temp == 'I' || temp == 'i'){
				encoded += 1;
			}
			else if(temp == 'O' || temp == 'o'){
				encoded += 0;
			}
			else if(temp == 'T' || temp == 't'){
				encoded += 7;
			}
			else{
				encoded += temp;
			}
		}
		return encoded;
	}
}
