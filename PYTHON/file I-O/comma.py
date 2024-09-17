with open("comma2.txt","w") as f:
    f.write("this is my name and my name is rohan yadav ")

def comma():
    
        with open("D:\SIGMA\comma2.txt", "r") as f:
            data = f.read()
            newdata= ','.join(data)

            print(newdata)


          

        


comma()