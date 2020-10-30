cd tradutor-braille-app
npm run build
cd ../tradutor-braille-service
./gradlew clean build
cd build/libs
java -jar tradutor-braille-1.0-SNAPSHOT.jar
