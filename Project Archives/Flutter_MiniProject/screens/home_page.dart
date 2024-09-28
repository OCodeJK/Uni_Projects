import 'package:flutter/material.dart';
import 'package:location/location.dart';
import 'detail_page.dart';


class HomePage extends StatefulWidget {

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {

  var location = new Location();
  LocationData userLocation;

  Future<LocationData>_getLocation() async{
    LocationData currentLocation;

    try {
      currentLocation = await location.getLocation();
    } catch (e){
      currentLocation = null;
    }
    return currentLocation;
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar:AppBar(
        leading: Icon(Icons.menu),
        actions: [
          IconButton(onPressed: (){}, icon: Icon(Icons.search)),
        ],
        title: Text('Home'),
      ),
      body: GridView.count(
        crossAxisCount: 2,
        children: [
          Card(
            elevation: 5,
            shape: RoundedRectangleBorder(
              borderRadius: BorderRadius.circular(10)
            ),
            child: Column(
              children: [
                Container(
                  width: 130,
                  height: 130,
                  child: Image(image: AssetImage('images/canopy_bishan.jpg'),),
                ),
                Text('Canopy Bishan'),
                IconButton(
                  onPressed: (){
                    _getLocation().then((value){
                      setState(() {
                        userLocation = value;
                      });
                    }).catchError((e)=>print('${e.error}'));
                    userLocation != null ? 
                    Navigator.push(
                      context,
                      MaterialPageRoute(
                        builder: (context)=>
                          DetailPage(userLocation: userLocation)
                      ),
                    ):DoNothingAction();
                }, 
                icon: Icon(Icons.directions),
                ),
              ],
            ),
          ),
          Card(
            elevation: 5,
            shape: RoundedRectangleBorder(
              borderRadius: BorderRadius.circular(10)
            ),
            child: Column(
              children: [
                Container(
                  width: 130,
                  height: 130,
                  child: Image(image: AssetImage('images/corner_house.jpg'),),
                ),
                Text('Corner House'),
                IconButton(
                  onPressed: (){
                  _getLocation().then((value){
                      setState(() {
                        userLocation = value;
                      });
                    }).catchError((e)=>print('${e.error}'));
                    userLocation != null ? 
                    Navigator.push(
                      context,
                      MaterialPageRoute(
                        builder: (context)=>
                          DetailPage(userLocation: userLocation)
                      ),
                    ):DoNothingAction();
                }, 
                icon: Icon(Icons.directions),
                ),
              ],
            ),
          ),
          Card(
            elevation: 5,
            shape: RoundedRectangleBorder(
              borderRadius: BorderRadius.circular(10)
            ),
            child: Column(
              children: [
                Container(
                  width: 130,
                  height: 130,
                  child: Image(image: AssetImage('images/dragon_chamber.jpg'),),
                ),
                Text('Dragon Chamber'),
                IconButton(
                  onPressed: (){
                  _getLocation().then((value){
                      setState(() {
                        userLocation = value;
                      });
                    }).catchError((e)=>print('${e.error}'));
                    userLocation != null ? 
                    Navigator.push(
                      context,
                      MaterialPageRoute(
                        builder: (context)=>
                          DetailPage(userLocation: userLocation)
                      ),
                    ):DoNothingAction();
                }, 
                icon: Icon(Icons.directions),
                ),
              ],
            ),
          ),
          Card(
            elevation: 5,
            shape: RoundedRectangleBorder(
              borderRadius: BorderRadius.circular(10)
            ),
            child: Column(
              children: [
                Container(
                  width: 130,
                  height: 130,
                  child: Image(image: AssetImage('images/dusk_restaurant.jpg'),),
                ),
                Text('Dusk Restaurant'),
                IconButton(
                  onPressed: (){
                  _getLocation().then((value){
                      setState(() {
                        userLocation = value;
                      });
                    }).catchError((e)=>print('${e.error}'));
                    userLocation != null ? 
                    Navigator.push(
                      context,
                      MaterialPageRoute(
                        builder: (context)=>
                          DetailPage(userLocation: userLocation)
                      ),
                    ):DoNothingAction();
                }, 
                icon: Icon(Icons.directions),
                ),
              ],
            ),
          ),
          Card(
            elevation: 5,
            shape: RoundedRectangleBorder(
              borderRadius: BorderRadius.circular(10)
            ),
            child: Column(
              children: [
                Container(
                  width: 130,
                  height: 130,
                  child: Image(image: AssetImage('images/mustard_seed.jpg'),),
                ),
                Text('Mustard Seed'),
                IconButton(
                  onPressed: (){
                  _getLocation().then((value){
                      setState(() {
                        userLocation = value;
                      });
                    }).catchError((e)=>print('${e.error}'));
                    userLocation != null ? 
                    Navigator.push(
                      context,
                      MaterialPageRoute(
                        builder: (context)=>
                          DetailPage(userLocation: userLocation)
                      ),
                    ):DoNothingAction();
                }, 
                icon: Icon(Icons.directions),
                ),
              ],
            ),
          ),
          Card(
            elevation: 5,
            shape: RoundedRectangleBorder(
              borderRadius: BorderRadius.circular(10)
            ),
            child: Column(
              children: [
                Container(
                  width: 130,
                  height: 130,
                  child: Image(image: AssetImage('images/positano_risto.jpg'),),
                ),
                Text('Positano_risto'),
                IconButton(
                  onPressed: (){
                  _getLocation().then((value){
                      setState(() {
                        userLocation = value;
                      });
                    }).catchError((e)=>print('${e.error}'));
                    userLocation != null ? 
                    Navigator.push(
                      context,
                      MaterialPageRoute(
                        builder: (context)=>
                          DetailPage(userLocation: userLocation)
                      ),
                    ):DoNothingAction();
                }, 
                icon: Icon(Icons.directions),
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }
}