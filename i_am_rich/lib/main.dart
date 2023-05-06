import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
      home: Scaffold(
    appBar: AppBar(
      backgroundColor: Colors.blueGrey[900],
      title: Center(
        child: Text('f*ck u tony'),
      ),
    ),
    body: Center(child: Image(image: AssetImage('images/im.png'))),
  )));
}
