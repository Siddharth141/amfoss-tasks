package main

import 
(
    "github.com/dghubble/go-twitter/twitter"
    "github.com/dghubble/oauth1"
    "os"
    "flag"
    "fmt"
	
)

func main(){
	var name string    
	fmt.Println("Enter the twitter handler whose data you want to know")
	fmt.Scanln(&name)
	tn:=flag.String("twitterHandler",name,"has twitter handler stored in it") 
	flag.Parse()
	config := oauth1.NewConfig("KFsnM7fE2qDApjcgCiHj2AfPM", "OQYp1bjGMETNSIAdvTTJbp4luGN2PT1gZjZZb8sFDxww4ihNTs")
	token := oauth1.NewToken("1218735748918042624-mqKWhntyp649WvYGPLkOrN1EMPF4AG", "i4Z6YAzWZG15TQpojWZH97TZZ7J0SeF9SKunCF3oUuunD")
	httpClient := config.Client(oauth1.NoContext, token)
	client := twitter.NewClient(httpClient)
	f, err := os.Create("output.txt")

	params := &twitter.FollowerListParams{
	        ScreenName: *tn,
    }
    
	followers, resp, err := client.Followers.List(params)
	var count int = 0;
	fmt.Println(resp, err)
	f.WriteString("Followers - " + *tn)
	for _, follower := range followers.Users {
		count++
		f.WriteString("\n" + follower.ScreenName)
	}
	f.WriteString("\n")
	f.WriteString(fmt.Sprintf("\n", count))
	f.Close()
}
