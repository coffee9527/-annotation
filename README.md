# -annotation
注解开发
掌握java annotation特性与使用方式  
annotation的由来  
annotation的定义方式  
annotation的使用方式  
jdk5内建annotation详解  
annotation的高级特性  
  
  ### 为什么使用annotation  
  在java应用中，我们常遇到一些需要使用模板代码的情况，例如，为了编写一个web service，我们必须提供一对接口和实现作为模板代码。  
  如果使用annotation对远程访问的方法代码进行修饰的话，这个模板就能够使用工具自动生成。  
  另外，一些api需要使用与程序代码同时维护的附属文件，例如ejb需要一个部署描述符。此时在程序中使用annotation来维护这些附属文件的  
  信息将十分便利而且减少了错误。  
  ### annotation工作方式  
  从java5.0版本发布以来，5.0平台提供了一个正式的annotation功能：允许开发者定义、使用自己的annotation类型。此功能由一个定义annotation类型的语法和  
  一个描述annotation声明的语法，读取annotation的api，一个使用annotation修饰class文件，一个annotation处理工具（apt）组成。  
  ### annotation工作方式  
  annotation并不直接影响代码语义，但是它能够工作的方式被看做类似程序的工具或者类库，它会反过来对正在运行的程序语义有所影响。annotation可以从  
  源文件、class文件或者以运行时反射的多种方式被读取。  
  当然annotaion在某种程度上使javadoc tag更加完整。一般情况下，如果这个标记对java文档产生影响或者用于生成java文档的话，它应该作为一个javadoc tag；  
  否则将作为一个annotation。  
  ## 使用jdk5内建annotation  
  override  
  deprecated  
  suppressWarnings  
 ### 限定Override父类方法@Override    
 java.lang.Override是个Marker annotation  
 用于标示的Annotation,Annotation名称本身即表示了要给工具程序的信息  
### 标示方法为Deprecated #Deprectated  
对编译程序说明某个方法已经不建议使用，即该方法是过时的。
java.lang.Deprecated也是个Marker annotation  
Deprecated这个名称在告知编译程序，被@Deprecated标示的方法是一个不建议被使用的方法  
### 抑制编译程序警告@SuppressWarnings  
对编译程序说明某个方法中若有警告讯息，则加以抑制  
### 自定义annotation类型  
定义marker annotation，也就是annotation名称本身即提供信息对于程序分析工具来说，主要是检查是否有MarkerAnnotation的出现，并作出对应的动作  
参见程序范例  
### Single-value annotation  
value成员定义默认值，用“default”关键词  
数组方式的使用  
枚举在annotation中的应用  
### 定义annotation类型  
使用@interface自行定义annotation形态时，实际上是自动继承了java.lang.annotation.Annotation接口  
由编译程序自动为您完成其他产生的细节  
在定义Annotation形态时，不能继承其他的Annotation形态或是接口  
### 自定义Annotation类型  
定义Annotation形态时也可以使用包来管理类别  
方式类同于类的导入功能  
### 告知编译程序如何处理@Retention  
java.lang.annotation.Retention形态可以在你定义Annotation形态时，指示编译程序该如何对待你的自定义的Annotation形态  
预设上编译程序会将Annotation信息留在.class档案中，但不被虚拟机读取，而仅用于编译程序或工具程序运行时提供信息   
在使用Retention形态时，需要提供  
java.lang.annotation.RetentionPolicy的枚举型态  
package java.lang.annotation:  
public enum RetentionPolicy {
  SOURCE,//编译程序处理完Annotation信息后就完成任务  
  CLASS,//编译程序将Annotation存储于class档中，缺省  
  RUNTIME,//编译程序将Annotation存储于class档中，可由vm读入  
  RetentioPolicy为SOURCE的例子是@SupperssWarnings  
}  
仅在编译时期告知编译程序来抑制警告，所以不必将这个信息存储于.class档案  
RetentionPolicy为RUNTIME的时机，可以像是您使用java设计一个程序代码分析工具，您必须让vm能读出annotation信息，一边在分析程序时使用  
搭配反射（Reflection）机制，就可以达到这个目的  
java.lang.reflect.AnnotatedElement接口  
public Annotation getAnnotation(Class annotationType);  
public Annotation[] getAnnotation();  
public Annotation[] getDeclaredAnnotation();  
public boolean isAnnotationPresent(Class annotationType);  
Class,Constructor,Field,Method,Package等类别，都实现了AnnotatedElement接口  
  
定义Annotation时必须定义RetentionPolicy为RUNTIME,,也就是可以在VM中读取Annotation信息  参见程序  
  
### 限定annottion使用对象@Target  
使用java.lang.annotation.Target可以定义其他使用之时机  
在定义时要指定java.lang.annotation.ElementType的枚举值之一  
package java.lang.annotation;  
public enum ElementType {
  TYPE,//试用class,interface,enum  
  FLELD,//使用field  
  METHOD,//适用method  
  PARAMETER,//适用method上之parameter  
  CONSTRUCTOR,//适用constructor  
  LOCAL_VARIABLE,//适用局部变量  
  ANNOTATION_TYPE,  //适用annotation型态  
  PACKAGE,//适用package  
    
  ### 要求为API文件@Documented  
  想要在使用者制作JavaDoc文件的同时，也一并将Annotation的讯息加入到API文件中  
  使用java.lang.annotation.Documented  
    
  ### 子类是否继承父类@Inherited  
  预设上父类别中的Annotation并不会被继承至子类别中  
  可以在定义Annotation型态时加上java.lang.annotation.Inherited型态的Annotation  
  事实上，Inherated在JDK5中还没有发生作用
}
