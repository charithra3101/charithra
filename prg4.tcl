# This script is created by NSG2 beta1
# <http://wushoupong.googlepages.com/nsg>

#===================================
#     Simulation parameters setup
#===================================
set val(stop)   10.0                         ;# time of simulation end

#===================================
#        Initialization        
#===================================
#Create a ns simulator
set ns [new Simulator -multicast on]

#Open the NS trace file
set tracefile [open out.tr w]
$ns trace-all $tracefile

#Open the NAM trace file
set namfile [open out.nam w]
$ns namtrace-all $namfile

set group [Node allocaddr] ;
#===================================
#        Nodes Definition        
#===================================
#Create 5 nodes
set n0 [$ns node]
set n1 [$ns node]
set n2 [$ns node]
set n3 [$ns node]
set n4 [$ns node]

#===================================
#        Links Definition        
#===================================
#Createlinks between nodes
$ns duplex-link $n1 $n0 100.0Mb 10ms DropTail
$ns queue-limit $n1 $n0 50
$ns duplex-link $n0 $n2 100.0Mb 10ms DropTail
$ns queue-limit $n0 $n2 50
$ns duplex-link $n3 $n0 100.0Mb 10ms DropTail
$ns queue-limit $n3 $n0 50
$ns duplex-link $n4 $n0 100.0Mb 10ms DropTail
$ns queue-limit $n4 $n0 50

set mproto DM ;#configure multicast protocol
set mrthandle [$ns mrtproto $mproto] ;#all nodes contain multicast agents

#Give node position (for NAM)
$ns duplex-link-op $n1 $n0 orient right-down
$ns duplex-link-op $n0 $n2 orient right
$ns duplex-link-op $n3 $n0 orient right-up
$ns duplex-link-op $n4 $n0 orient right

#===================================
#        Agents Definition        
#===================================
set udp [new Agent/UDP]
$ns attach-agent $n0 $udp
#===================================
#        Applications Definition        
#===================================
#Setup a CBR Application over UDP connection
set cbr0 [new Application/Traffic/CBR]
$cbr0 attach-agent $udp

$udp set dst_addr_ $group
$udp set dst_port_ 0
set rcvr1 [new Agent/LossMonitor];
$ns attach-agent $n1 $rcvr1
$ns at 1.9 "$n1 join-group $rcvr1 $group" ;

set rcvr2 [new Agent/LossMonitor];
$ns attach-agent $n1 $rcvr2
$ns at 1.12 "$n2 join-group $rcvr2 $group" ;

set rcvr3 [new Agent/LossMonitor];
$ns attach-agent $n1 $rcvr3
$ns at 1.15 "$n3 join-group $rcvr3 $group" ; 

set rcvr4 [new Agent/LossMonitor];
$ns attach-agent $n1 $rcvr4
$ns at 1.9 "$n4 join-group $rcvr4 $group" 
$ns at 3.3 "$n4 leave-group $rcvr4 $group" ;


$cbr0 set packetSize_ 1000
$cbr0 set rate_ 1.0Mb
$cbr0 set random_ null
$ns at 1.0 "$cbr0 start"
$ns at 2.0 "$cbr0 stop"


#===================================
#        Termination        
#===================================
#Define a 'finish' procedure
proc finish {} {
    global ns tracefile namfile
    $ns flush-trace
    close $tracefile
    close $namfile
    exec nam out.nam &
    exit 0
}
$ns at $val(stop) "$ns nam-end-wireless $val(stop)"
$ns at $val(stop) "finish"
$ns at $val(stop) "puts \"done\" ; $ns halt"
$ns run
