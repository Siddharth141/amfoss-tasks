import pytesseract as tess
from PIL import Image
img = Image.open('text1.png')
text = tess.image_to_string(img)

if text[1]=='+':
	print(int(list[0])+int(list[2]))
if text[1]=='-':
	print(int(list[0])-int(list[2]))
if text[1]=='*':
	print(int(list[0])*int(list[2]))
if text[1]=='/':
	print(int(list[0])/(list[2]))
else:
	print("not possible")

