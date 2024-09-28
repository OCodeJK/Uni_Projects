import 'package:flutter/material.dart';
import 'package:location/location.dart';
import 'dart:async';
import 'package:google_maps_flutter/google_maps_flutter.dart';

class DetailPage extends StatefulWidget {
  final LocationData userLocation;
  DetailPage({Key key, this.userLocation}) : super(key: key);

  @override
  State<DetailPage> createState() => _DetailPageState();
}

class _DetailPageState extends State<DetailPage> {

  Completer<GoogleMapController>_controller = Completer();

  BitmapDescriptor _locIcon;
  final Set<Marker> listMarkers = {};

  Future<BitmapDescriptor> _setLocCustomMarker() async {
    BitmapDescriptor bIcon = await BitmapDescriptor.fromAssetImage(ImageConfiguration(devicePixelRatio: 2.5), 'images/loc-map-pin.png');

    return bIcon;
  }

  @override
  void initState(){
    super.initState();

    _setLocCustomMarker().then((value){
      _locIcon = value;
      _locIcon != null? setState((){
        listMarkers.add(Marker(
          markerId: MarkerId('1'),
          position: LatLng(widget.userLocation.latitude, widget.userLocation.longitude),
          infoWindow: InfoWindow(title: 'Current Location'),
          icon: _locIcon
        ));
      }): DoNothingAction();
    });
  }

  @override
  Widget build(BuildContext context) {
    CameraPosition _currentPos = CameraPosition(
      bearing: 0.0,
      target: LatLng(widget.userLocation.latitude, widget.userLocation.longitude),
      tilt: 60.0,
      zoom: 17
    );
    return Scaffold(
      appBar: AppBar(
        title: Text('Location Map Details'),
      ),
      body: GoogleMap(
        markers: Set.from(listMarkers),
        myLocationEnabled: true,
        initialCameraPosition: _currentPos,
        onMapCreated: (GoogleMapController controller){
          _controller.complete(controller);
        },
      ),
    );
  }
}