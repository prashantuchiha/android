import 'package:flutter/material.dart';

void main() {
  runApp(
    MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        backgroundColor: Colors.blueGrey,
        appBar: AppBar(
          title: const Center(
            child: Text('our app'),
          ),
          backgroundColor: Colors.blueGrey[900],
        ),
        body: Center(
          child: Image(
            image: AssetImage('images/love.png'),

            //   image: NetworkImage(
            //       'https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/733b5da9-efe6-4697-a4f9-9e9d4975f828/de8g74b-0127ef26-febe-4074-8ac3-b74dbde3b0a3.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzczM2I1ZGE5LWVmZTYtNDY5Ny1hNGY5LTllOWQ0OTc1ZjgyOFwvZGU4Zzc0Yi0wMTI3ZWYyNi1mZWJlLTQwNzQtOGFjMy1iNzRkYmRlM2IwYTMuanBnIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.mN0QqkKs8ZgCGC6w5chXHPUgjd7Yi3z1m6Of2x-serc'),
          ),
        ),
      ),
    ),
  );
}
