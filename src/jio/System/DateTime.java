package jio.System;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import jio.System.Globalization.*;public class DateTime {public NObject javonetHandle; public DateTime (java.lang.Long ticks){ try {  javonetHandle = Javonet.New("DateTime",ticks);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DateTime (java.lang.Long ticks,DateTimeKind kind){ try {  javonetHandle = Javonet.New("DateTime",ticks,NEnum.fromJavaEnum(kind));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DateTime (java.lang.Integer year,java.lang.Integer month,java.lang.Integer day){ try {  javonetHandle = Javonet.New("DateTime",year,month,day);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DateTime (java.lang.Integer year,java.lang.Integer month,java.lang.Integer day,Calendar calendar){ try {  javonetHandle = Javonet.New("DateTime",year,month,day,calendar);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DateTime (java.lang.Integer year,java.lang.Integer month,java.lang.Integer day,java.lang.Integer hour,java.lang.Integer minute,java.lang.Integer second){ try {  javonetHandle = Javonet.New("DateTime",year,month,day,hour,minute,second);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DateTime (java.lang.Integer year,java.lang.Integer month,java.lang.Integer day,java.lang.Integer hour,java.lang.Integer minute,java.lang.Integer second,DateTimeKind kind){ try {  javonetHandle = Javonet.New("DateTime",year,month,day,hour,minute,second,NEnum.fromJavaEnum(kind));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DateTime (java.lang.Integer year,java.lang.Integer month,java.lang.Integer day,java.lang.Integer hour,java.lang.Integer minute,java.lang.Integer second,Calendar calendar){ try {  javonetHandle = Javonet.New("DateTime",year,month,day,hour,minute,second,calendar);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DateTime (java.lang.Integer year,java.lang.Integer month,java.lang.Integer day,java.lang.Integer hour,java.lang.Integer minute,java.lang.Integer second,java.lang.Integer millisecond){ try {  javonetHandle = Javonet.New("DateTime",year,month,day,hour,minute,second,millisecond);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DateTime (java.lang.Integer year,java.lang.Integer month,java.lang.Integer day,java.lang.Integer hour,java.lang.Integer minute,java.lang.Integer second,java.lang.Integer millisecond,DateTimeKind kind){ try {  javonetHandle = Javonet.New("DateTime",year,month,day,hour,minute,second,millisecond,NEnum.fromJavaEnum(kind));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DateTime (java.lang.Integer year,java.lang.Integer month,java.lang.Integer day,java.lang.Integer hour,java.lang.Integer minute,java.lang.Integer second,java.lang.Integer millisecond,Calendar calendar){ try {  javonetHandle = Javonet.New("DateTime",year,month,day,hour,minute,second,millisecond,calendar);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DateTime (java.lang.Integer year,java.lang.Integer month,java.lang.Integer day,java.lang.Integer hour,java.lang.Integer minute,java.lang.Integer second,java.lang.Integer millisecond,Calendar calendar,DateTimeKind kind){ try {  javonetHandle = Javonet.New("DateTime",year,month,day,hour,minute,second,millisecond,calendar,NEnum.fromJavaEnum(kind));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public DateTime(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}