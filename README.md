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
 -Reciclam datele pe care le avem deja
  View convertView
  if (convertView == null)
