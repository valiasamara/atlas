import  'package:flutter/material.dart';
import 'package:firebase_core/firebase_core.dart';
import 'firebase_options.dart';
 

 Future <void> main() async{
  WidgetsFlutterBinding.ensureInitialized();
  await Firebase.initializeApp(
 demoProjectId: "demo-project-id",
);
  runApp(
    const MaterialApp(
    home: Center(
    child: Text("hello World!"),




    ),
  ),
  );
 }
 