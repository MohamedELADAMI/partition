# Partition
## Get started

The project will split a list of object passed as parameters to multiple list of the same type and size also passed as parameters.

## Installation

To start using the functionalty you need to use one of the following method.

The library is used as Jar.

### Option 1

Importing the Jar as Maven dependency. To use this option we need to configure your maven settings as follow.

1. Open your local maven settings `settings.xml` and add the following configuration:

 - Settings.xml is not Empty:

      If you already have active profiles in your `settings` just add the following conf to one of the active profiles `<profile>` 
   

```xml
<repository>
    <id>github</id>
    <url>https://maven.pkg.github.com/mohamedeladami/*</url>
    <snapshots>
        <enabled>true</enabled>
    </snapshots>
</repository>
```
 And in servers `<server>` add

```xml
<server>
    <id>github</id>
    <username>Github_User</username>
    <password>Github_Token</password>
</server>
```
  - Settings.xml is Empty:

     If you have an empty `settings.xml` you can add this configuration:

```xml
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                      http://maven.apache.org/xsd/settings-1.0.0.xsd">

  <activeProfiles>
    <activeProfile>maven</activeProfile>
  </activeProfiles>

  <profiles>
    <profile>
      <id>maven</id>
      <repositories>
        <repository>
          <id>central</id>
          <url>https://repo1.maven.org/maven2</url>
        </repository>
        <repository>
          <id>github</id>
          <url>https://maven.pkg.github.com/mohamedeladami/*</url>
          <snapshots>
            <enabled>true</enabled>
          </snapshots>
        </repository>
      </repositories>
    </profile>
  </profiles>

  <servers>
    <server>
      <id>github</id>
      <username>Github_User</username>
      <password>Github_Token</password>
    </server>
  </servers>
</settings>
```

---
**NOTE**

To download the jar contact us to receive Github_User and Github_Token. [Email](mailto:mohamedeladami@gmail.com?subject=[GitHub]%20Partition%20Token)

---
 2. Now you can add the dependency to your `pom.xml`:

 ```xml
 <dependency>
  <groupId>com.ptc.skillstesting</groupId>
  <artifactId>partition</artifactId>
  <version>0.0.1</version>
</dependency>
 ```
 3. Run the following command:
 ```bash
 mvn install
 ```
### Option 2

Download and import the Jar manually:

[Download](https://github.com/MohamedELADAMI/partition/packages/994446) and add it to [Eclipse](https://wiki.eclipse.org/FAQ_How_do_I_add_an_extra_library_to_my_project%27s_classpath%3F) or [IntelliJ IDEA](https://www.jetbrains.com/help/idea/working-with-module-dependencies.html#add-a-new-dependency).

## Usage

This is an exemple on how to use the library.

```java
import java.util.ArrayList;
import java.util.List;

import com.ptc.skillstesting.list.ListActions;

public class Example {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		List<List<String>> result = ListActions.partition(list, 2);
		
		System.out.println(result);
		
	}
}
```
After the execution you will see the following result in console.

```
[[A, B], [C, D], [E]]
```