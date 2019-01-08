# RIVERtools

RIVERtools is an IDE supporting the use of the "trace expressions" formalism by users that want to perform Runtime Verification of their own system.

# Tutorial: How to use RIVERtools

What you are going to install.
  • SWI-Prolog
  • Eclipse(with Xtext plugin) 
  • RIVERtools Eclipse plugin

# How to install SWI-Prolog

Installing SWI-Prolog is very easy:
  • On Linux:
    1. sudo apt-get install software-properties-common
    2. sudo apt-add-repository ppa:swi-prolog/stable
    3. sudo apt-get update
    4. sudo apt-get install swi-prolog
  • On Windows
    - Download either 32 bit or 64bit from http://www.swi-prolog.org/download/stable
  • On MacOSX (using Homebrew  http://mxcl.github.io/homebrew/) 
    – brew install swi-prolog
    
Now you are ready to define inside RIVERtools a variation of the ping pong example presented previously in this chapter. Specifically, in this example the number of ping is equal to the number of pong.

14 Development of a framework supporting trace expressions RV
2. Inside the created project, create a new file and call it pingpong.texp.
3. An Eclipse popup should ask you if you want to configure the project with Xtext: say yes. If Eclipse does not ask you, right-click on the project folder -> Configure -> Convert to Xtext project...
4. NowyoucandefinetraceexpressionswiththefullsupportoftheRIVER- tools plugin.
Now you are ready to define inside RIVERtools a variation of the ping pong example presented previously in this chapter. Specifically, in this example the number of ping is equal to the number of pong.

interaction_trace_expression { 
  id : pingpong
  target : jade 
  roles : alice$SenderAgent(’bob’, ’ping’, ’5’)$ bob$ReceiverAgent ( ’ alice ’ , ’pong ’ , ’5 ’)$
  types : 
    ping : { alice => bob : ping } 
    pong : { bob => alice : pong }
  body :
    main <− pingpong ∗ main 
    pingpong <−
        ( ping : ( pingpong \/ epsilon ) * pong : epsilon )
}

Since Eclipse is using the RIVERtools plugin to analyze the trace expression, all syntax and types errors are promptly indicated to the developer. As presented before in this chapter, we are interested in automatically generating the code that will be used for verifying our multiagent system. When no errors are found from RIVERtools, a new folder src-gen is created. Inside this folder we can find the Java and Prolog code that have been automatically generated through the compilation of the trace expression.

# How to verify a MAS implemented in JADE

1. Link for downloading ping pong MAS example: 
https://github.com/AngeloFerrando/website/raw/master/assets/rivertools/jadeconnector/example/pingpongmas.zip

2. Import the example into Eclipse:
  a) File -> Import... -> Existing Projects into Workspace.
  b) Select archive file and select pingpongmas.zip downloaded previously, then finish.
  
3. Inside the JADE project example you have two agents SenderAgent and ReceiverAgent. Note that you have already indicated these classes inside pingpong.texp.

4. Copy Pingpong.java from the MyPingPongExample project to this project.

5. Run it. An exception will be thrown ("SWI_LIB environment variable not defined").

6. How to set the SWI_LIB environment variable
  a) Right-click on Pingpong.java (the one inside MyPingPongMAS) -> Run as -> Run Configurations...
  b) Pass to the Environment tab and then New...
  c) Set the name to SWI_LIB
  d) Set the value to the path to the SWI-Prolog library. For instance, on MacOSX is something like: 
     /opt/local/lib/swipl-<version>/lib/x86_64- darwin15.0.0/
  
7. The last thing you need to do before running the MAS is to change the path to pingpong.pl (line 27 in Pingpong.java). You have to set it to the absolute path corresponding to the file generated in MyPingPongExample project.

8. You are now ready to execute the MAS with the automatically generated RV monitor.

9. Right-click on Pingpong.java (inside MyPingPongMAS) -> Run as -> Java Application

The SenderAgent and ReceiverAgent are parametric. In particular, the third parameter says how many messages the agent should send. In order to better observe if the monitor is working, you can introduce a wrong behaviour in the receiver agent. Instead of passing 5 as third argument to both the agents, you pass 5 to alice and 6 to bob. After that, you will observe the monitor printing an error message when the sixth pong will be observed.



