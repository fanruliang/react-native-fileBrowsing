
# react-native-file-browsing

## Getting started

`$ npm install react-native-file-browsing --save`

### Mostly automatic installation

`$ react-native link react-native-file-browsing`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-file-browsing` and add `RNFileBrowsing.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNFileBrowsing.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.hengsoo.fileBrowsing.RNFileBrowsingPackage;` to the imports at the top of the file
  - Add `new RNFileBrowsingPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-file-browsing'
  	project(':react-native-file-browsing').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-file-browsing/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-file-browsing')
  	```


## Usage
```javascript
import RNFileBrowsing from 'react-native-file-browsing';

// TODO: What to do with the module?
RNFileBrowsing;
```
  