/*

1.  Trace the above with the following information, add space to the table as needed:

|~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~|
|statement			|goal						|startPos				|
|~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~|
|She’s my sister|sister					|0							|
|~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~|

|~~~~~~~~~~~|~~~~~~~~~~~|~~~~~~~~~~~|~~~~~~~~~~~|
|phrase			|psn				|before			|after			|
|~~~~~~~~~~~|~~~~~~~~~~~|~~~~~~~~~~~|~~~~~~~~~~~|
|She's my 	|9					|" "				|" "				|
|sister			|						|						|						|
|~~~~~~~~~~~|~~~~~~~~~~~|~~~~~~~~~~~|~~~~~~~~~~~|
return 9



2.  Trace the above with the following information, add space to the table as needed:

|~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~|
|statement			|goal						|startPos				|
|~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~|
|Brother Tom is	|brother				|0							|
|helpful				|								|								|
|~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~|

|~~~~~~~~~~~|~~~~~~~~~~~|~~~~~~~~~~~|~~~~~~~~~~~|
|phrase			|psn				|before			|after			|
|~~~~~~~~~~~|~~~~~~~~~~~|~~~~~~~~~~~|~~~~~~~~~~~|
|Brother Tom|0					|" "				|" "				|
| is helpful| 					|						|						|
|~~~~~~~~~~~|~~~~~~~~~~~|~~~~~~~~~~~|~~~~~~~~~~~|	
return 0



3. Trace the above with the following information, add space to the table as needed:

|~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~|
|statement			|goal						|startPos				|
|~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~|
|I can't catch 	|cat						|0							|
|wild cats.			|								|								|
|~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~|

|~~~~~~~~~~~|~~~~~~~~~~~|~~~~~~~~~~~|~~~~~~~~~~~|
|phrase			|psn				|before			|after			|
|~~~~~~~~~~~|~~~~~~~~~~~|~~~~~~~~~~~|~~~~~~~~~~~|
|I can't 		|8					|" "				|"c"				|
|catch wild |19					|" "				|"s"				|
|cats.			|-1					|" "				|" "				|
|~~~~~~~~~~~|~~~~~~~~~~~|~~~~~~~~~~~|~~~~~~~~~~~|	
return -1



4. Trace the above with the following information, add space to the table as needed:

|~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~|
|statement			|goal						|startPos				|
|~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~|
|I know nothing |no							|0							|
|about snow 		|								|								|
|plows.					|								|								|
|~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~|

|~~~~~~~~~~~|~~~~~~~~~~~|~~~~~~~~~~~|~~~~~~~~~~~|
|phrase			|psn				|before			|after			|
|~~~~~~~~~~~|~~~~~~~~~~~|~~~~~~~~~~~|~~~~~~~~~~~|
|I know 		|3					|"k"				|"w"				|
|nothing 		|7					|" "				|"t"				|
|about snow |22					|"s"				|"w"				|
|plows.			|-1					|" "				|" "				|
|~~~~~~~~~~~|~~~~~~~~~~~|~~~~~~~~~~~|~~~~~~~~~~~|
return -1

*/