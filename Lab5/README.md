# Android- Andrei Ene 1241F

LAB 5:
In Ex0 doar am pus car_icon.png fara a genera un fisier XML
In Ex1 am adaugat activity_main.xml si l-am facut Linear Layout ca in Lab2 (pe verticala)
In Ex2 am facut un fisier list_item.xml (pe orizontala)
 -in linearlayout am adaugat un ImageView si un TextView
 Ex3
  -in MainActivity.java am facut 2 clase:
    -class Car (String + imageResource)
    -class TagCar (TextView name + ImageView image)
 Ex4
  -am facut un fisier CarAdapter care se duce in BaseAdapter unde am pus
       -un Activity object (context)
       -un ArrayList (cu numele masinilor)
       -iar apoi am adaugat functia addCar din lab
Ex5       
 element = layoutInflater.inflate(R.layout.list_item, null);
 - in cursul 4 avem mentionat ca ,creearea de obiecte nu este eficienta (folosim mai multa memorie for the same task)
 asa ca mai bine bolosim Buffers sau Liste 
 -Reciclam datele pe care le avem deja,nu ramanem fara memorie si va merge mult mai repede
  View convertView
  if (convertView == null)
Ex6  
 -am conectat xml-ul la ListView din java
 -am initializat obiectul carAdapter
 -l-am setat pt lista si am adaugat 4 maini
 Ex7
 -in activity_main.xml in LinearLayout am adaugat inca un LinearLayout in care am pus un EditText
 -si am adaugat un Button
 Ex8
 -am conectat Edittext si Button in functia onCreate
 -am pus un onClickListner la buton pt a lua textul din editText si a il face string
 -si am facut sa putem adauga new car cu numele din editText
 pentru imagini nu mi-am dat seama cum sa le fac rescale direct din android studio 
 asa ca le-am facut in ps pe toate de 64x64 ca ele sa se alinieze bine,si randurile la fel.
 
 Am invatat mai multe despre eficienta unui program,si despre layout-ul per total al android studio, 
 unde si cum sa gasesc ce am nevoie
