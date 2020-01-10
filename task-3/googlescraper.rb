require 'nokogiri'
require 'open-uri'
 
puts 'enter your query'
question = gets
url = open('https://www.google.com/search?q=' + question)

content = Nokogiri::HTML(url)

content.xpath('(//div/a/div[text()])').each do |give|
	puts give.content
end