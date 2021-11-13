EESchema Schematic File Version 4
EELAYER 30 0
EELAYER END
$Descr A4 11693 8268
encoding utf-8
Sheet 1 1
Title ""
Date ""
Rev ""
Comp ""
Comment1 ""
Comment2 ""
Comment3 ""
Comment4 ""
$EndDescr
$Comp
L MCU_Module:Arduino_Nano_v2.x A1
U 1 1 618B2996
P 3750 3350
F 0 "A1" H 3750 2261 50  0000 C CNN
F 1 "Arduino_Nano_v2.x" H 3750 2170 50  0000 C CNN
F 2 "Module:Arduino_Nano" H 3750 3350 50  0001 C CIN
F 3 "https://www.arduino.cc/en/uploads/Main/ArduinoNanoManual23.pdf" H 3750 3350 50  0001 C CNN
	1    3750 3350
	0    1    1    0   
$EndComp
$Comp
L Device:C C1
U 1 1 618AB41B
P 2350 4950
F 0 "C1" H 2465 4996 50  0000 L CNN
F 1 "0.22uF" H 2465 4905 50  0000 L CNN
F 2 "" H 2388 4800 50  0001 C CNN
F 3 "~" H 2350 4950 50  0001 C CNN
	1    2350 4950
	1    0    0    -1  
$EndComp
$Comp
L Device:C C2
U 1 1 618ABDFE
P 2950 4950
F 0 "C2" H 3065 4996 50  0000 L CNN
F 1 "0.1uF" H 3065 4905 50  0000 L CNN
F 2 "" H 2988 4800 50  0001 C CNN
F 3 "~" H 2950 4950 50  0001 C CNN
	1    2950 4950
	1    0    0    -1  
$EndComp
$Comp
L Device:C C3
U 1 1 618ACBDA
P 3950 4950
F 0 "C3" H 4065 4996 50  0000 L CNN
F 1 "10uF" H 4065 4905 50  0000 L CNN
F 2 "" H 3988 4800 50  0001 C CNN
F 3 "~" H 3950 4950 50  0001 C CNN
	1    3950 4950
	1    0    0    -1  
$EndComp
$Comp
L Device:C C4
U 1 1 618AD28F
P 4450 4950
F 0 "C4" H 4565 4996 50  0000 L CNN
F 1 "0.1uF" H 4565 4905 50  0000 L CNN
F 2 "" H 4488 4800 50  0001 C CNN
F 3 "~" H 4450 4950 50  0001 C CNN
	1    4450 4950
	1    0    0    -1  
$EndComp
Wire Wire Line
	3750 4800 3950 4800
Wire Wire Line
	5100 4800 5100 3250
Wire Wire Line
	5100 3250 4750 3250
Wire Wire Line
	4450 4800 5100 4800
$Comp
L Connector:Conn_01x02_Male J1
U 1 1 618B3DDF
P 1650 4300
F 0 "J1" H 1758 4481 50  0000 C CNN
F 1 "12V" H 1758 4390 50  0000 C CNN
F 2 "" H 1650 4300 50  0001 C CNN
F 3 "~" H 1650 4300 50  0001 C CNN
	1    1650 4300
	1    0    0    -1  
$EndComp
$Comp
L power:GND #PWR?
U 1 1 618B4DDA
P 2000 5250
F 0 "#PWR?" H 2000 5000 50  0001 C CNN
F 1 "GND" H 2005 5077 50  0000 C CNN
F 2 "" H 2000 5250 50  0001 C CNN
F 3 "" H 2000 5250 50  0001 C CNN
	1    2000 5250
	1    0    0    -1  
$EndComp
Connection ~ 3450 5100
Wire Wire Line
	3450 5100 3950 5100
Wire Wire Line
	2000 5250 2000 5100
Wire Wire Line
	2000 5100 2350 5100
Connection ~ 2350 5100
Wire Wire Line
	2000 4400 1850 4400
Wire Wire Line
	2000 4400 2000 5100
Connection ~ 2000 5100
Wire Wire Line
	2000 4400 2350 4400
Connection ~ 2000 4400
Wire Wire Line
	3750 4350 3750 4800
Wire Wire Line
	3450 4650 3450 5100
$Comp
L Regulator_Linear:L7806 U1
U 1 1 618AA4EC
P 3450 4350
F 0 "U1" H 3450 4592 50  0000 C CNN
F 1 "L7806" H 3450 4501 50  0000 C CNN
F 2 "" H 3475 4200 50  0001 L CIN
F 3 "http://www.st.com/content/ccc/resource/technical/document/datasheet/41/4f/b3/b0/12/d4/47/88/CD00000444.pdf/files/CD00000444.pdf/jcr:content/translations/en.CD00000444.pdf" H 3450 4300 50  0001 C CNN
	1    3450 4350
	1    0    0    -1  
$EndComp
Wire Wire Line
	2750 3450 2750 4400
Wire Wire Line
	3150 4800 3150 4350
$Comp
L Elementos~Arduino:Bluetooth-HC-05 U2
U 1 1 618BD4E4
P 3750 1850
F 0 "U2" H 4578 1896 50  0000 L CNN
F 1 "Bluetooth-HC-05" H 4578 1805 50  0000 L CNN
F 2 "" H 3800 1300 50  0001 C CNN
F 3 "" H 3800 1300 50  0001 C CNN
	1    3750 1850
	1    0    0    -1  
$EndComp
Wire Wire Line
	5100 3250 5100 1350
Wire Wire Line
	5100 1350 2450 1350
Wire Wire Line
	2450 1350 2450 2000
Wire Wire Line
	2450 2000 2850 2000
Connection ~ 5100 3250
Wire Wire Line
	2850 1900 2350 1900
Wire Wire Line
	2350 1900 2350 4400
Connection ~ 2350 4400
Wire Wire Line
	2350 4400 2750 4400
Wire Wire Line
	2850 1700 2550 1700
Wire Wire Line
	2550 1700 2550 2750
Wire Wire Line
	2550 2750 3350 2750
Wire Wire Line
	3350 2750 3350 2850
Wire Wire Line
	3250 2850 3250 2650
Wire Wire Line
	3250 2650 2700 2650
Wire Wire Line
	2700 2650 2700 1800
Wire Wire Line
	2700 1800 2850 1800
$Comp
L Elementos~Arduino:TCS3200 U3
U 1 1 618C2691
P 6350 2500
F 0 "U3" H 6350 2915 50  0000 C CNN
F 1 "TCS3200" H 6350 2824 50  0000 C CNN
F 2 "" H 6300 2700 50  0001 C CNN
F 3 "" H 6300 2700 50  0001 C CNN
	1    6350 2500
	1    0    0    -1  
$EndComp
$Comp
L Device:R R1
U 1 1 618C4D02
P 5600 2350
F 0 "R1" V 5393 2350 50  0000 C CNN
F 1 "133" V 5484 2350 50  0000 C CNN
F 2 "" V 5530 2350 50  0001 C CNN
F 3 "~" H 5600 2350 50  0001 C CNN
	1    5600 2350
	0    1    1    0   
$EndComp
$Comp
L Device:R R2
U 1 1 618C5493
P 5600 2700
F 0 "R2" V 5393 2700 50  0000 C CNN
F 1 "103" V 5484 2700 50  0000 C CNN
F 2 "" V 5530 2700 50  0001 C CNN
F 3 "~" H 5600 2700 50  0001 C CNN
	1    5600 2700
	0    1    1    0   
$EndComp
$Comp
L Device:R R3
U 1 1 618CAACA
P 5600 3400
F 0 "R3" V 5393 3400 50  0000 C CNN
F 1 "133" V 5484 3400 50  0000 C CNN
F 2 "" V 5530 3400 50  0001 C CNN
F 3 "~" H 5600 3400 50  0001 C CNN
	1    5600 3400
	0    1    1    0   
$EndComp
$Comp
L Device:R R4
U 1 1 618CAE5D
P 5600 3750
F 0 "R4" V 5393 3750 50  0000 C CNN
F 1 "103" V 5484 3750 50  0000 C CNN
F 2 "" V 5530 3750 50  0001 C CNN
F 3 "~" H 5600 3750 50  0001 C CNN
	1    5600 3750
	0    1    1    0   
$EndComp
$Comp
L Device:R R5
U 1 1 618CB0AD
P 5600 4100
F 0 "R5" V 5393 4100 50  0000 C CNN
F 1 "102" V 5484 4100 50  0000 C CNN
F 2 "" V 5530 4100 50  0001 C CNN
F 3 "~" H 5600 4100 50  0001 C CNN
	1    5600 4100
	0    1    1    0   
$EndComp
Wire Wire Line
	6050 2350 5750 2350
Wire Wire Line
	6050 2450 5750 2450
Wire Wire Line
	5750 2450 5750 2700
Wire Wire Line
	4450 5100 6050 5100
Wire Wire Line
	6050 5100 6050 2650
Connection ~ 4450 5100
Wire Wire Line
	6650 2650 6650 4950
Wire Wire Line
	6650 4950 4900 4950
Wire Wire Line
	4900 4950 4900 3450
Wire Wire Line
	4900 3450 4750 3450
Wire Wire Line
	6650 2450 6750 2450
Wire Wire Line
	6750 2450 6750 3400
Wire Wire Line
	6750 3400 5750 3400
Wire Wire Line
	6650 2350 6850 2350
Wire Wire Line
	6850 2350 6850 3750
Wire Wire Line
	6850 3750 5750 3750
Wire Wire Line
	6650 2550 6950 2550
Wire Wire Line
	6950 2550 6950 4100
Wire Wire Line
	6950 4100 5750 4100
Wire Wire Line
	5450 2350 4150 2350
Wire Wire Line
	4150 2350 4150 2850
Wire Wire Line
	5450 2700 5350 2700
Wire Wire Line
	5350 2700 5350 2400
Wire Wire Line
	4050 2400 4050 2850
Wire Wire Line
	4050 2400 5350 2400
Wire Wire Line
	5450 3400 5300 3400
Wire Wire Line
	5300 3400 5300 2450
Wire Wire Line
	5300 2450 3950 2450
Wire Wire Line
	3950 2450 3950 2850
Wire Wire Line
	5450 3750 5250 3750
Wire Wire Line
	5250 3750 5250 2500
Wire Wire Line
	5250 2500 3850 2500
Wire Wire Line
	3850 2500 3850 2850
Wire Wire Line
	5450 4100 5200 4100
Wire Wire Line
	5200 4100 5200 2550
Wire Wire Line
	5200 2550 3750 2550
Wire Wire Line
	3750 2550 3750 2850
$Comp
L Device:LED D2
U 1 1 618DA78C
P 6300 1850
F 0 "D2" H 6293 1595 50  0000 C CNN
F 1 "LED" H 6293 1686 50  0000 C CNN
F 2 "" H 6300 1850 50  0001 C CNN
F 3 "~" H 6300 1850 50  0001 C CNN
	1    6300 1850
	-1   0    0    1   
$EndComp
$Comp
L Device:LED D1
U 1 1 618DB65D
P 6300 1450
F 0 "D1" H 6293 1195 50  0000 C CNN
F 1 "LED" H 6293 1286 50  0000 C CNN
F 2 "" H 6300 1450 50  0001 C CNN
F 3 "~" H 6300 1450 50  0001 C CNN
	1    6300 1450
	-1   0    0    1   
$EndComp
$Comp
L Device:R R6
U 1 1 618E3438
P 6850 1450
F 0 "R6" V 6643 1450 50  0000 C CNN
F 1 "10" V 6734 1450 50  0000 C CNN
F 2 "" V 6780 1450 50  0001 C CNN
F 3 "~" H 6850 1450 50  0001 C CNN
	1    6850 1450
	0    1    1    0   
$EndComp
$Comp
L Device:R R7
U 1 1 618E4D9D
P 6850 1850
F 0 "R7" V 6643 1850 50  0000 C CNN
F 1 "10" V 6734 1850 50  0000 C CNN
F 2 "" V 6780 1850 50  0001 C CNN
F 3 "~" H 6850 1850 50  0001 C CNN
	1    6850 1850
	0    1    1    0   
$EndComp
Wire Wire Line
	6450 1850 6700 1850
Wire Wire Line
	6450 1450 6700 1450
Wire Wire Line
	6050 5100 7150 5100
Wire Wire Line
	7150 5100 7150 1850
Wire Wire Line
	7150 1850 7000 1850
Connection ~ 6050 5100
Wire Wire Line
	7000 1450 7150 1450
Wire Wire Line
	7150 1450 7150 1850
Connection ~ 7150 1850
Wire Wire Line
	3650 2850 3650 2300
Wire Wire Line
	3650 2300 5450 2300
Wire Wire Line
	5450 2300 5450 1850
Wire Wire Line
	5450 1850 6150 1850
Wire Wire Line
	3550 2850 3550 2250
Wire Wire Line
	3550 2250 5350 2250
Wire Wire Line
	5350 2250 5350 1450
Wire Wire Line
	5350 1450 6150 1450
$Comp
L power:+12V #PWR?
U 1 1 618F1E37
P 2150 4250
F 0 "#PWR?" H 2150 4100 50  0001 C CNN
F 1 "+12V" H 2165 4423 50  0000 C CNN
F 2 "" H 2150 4250 50  0001 C CNN
F 3 "" H 2150 4250 50  0001 C CNN
	1    2150 4250
	1    0    0    -1  
$EndComp
Wire Wire Line
	1850 4300 2150 4300
Wire Wire Line
	2150 4300 2150 4250
Connection ~ 3950 5100
Wire Wire Line
	3950 5100 4450 5100
Wire Wire Line
	3950 4800 4450 4800
Connection ~ 3950 4800
Connection ~ 4450 4800
Wire Wire Line
	2950 4800 3150 4800
Connection ~ 2950 5100
Wire Wire Line
	2950 5100 3450 5100
Wire Wire Line
	2350 5100 2950 5100
Wire Wire Line
	2350 4800 2950 4800
Connection ~ 2950 4800
Wire Wire Line
	2150 4300 2150 4800
Wire Wire Line
	2150 4800 2350 4800
Connection ~ 2150 4300
Connection ~ 2350 4800
$EndSCHEMATC
