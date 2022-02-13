# ExtendedData

Run Demo Application in Debug Mode and add 
breakpoints to /Save Post Function in DnisController OR ControllerBase

Got to - http://localhost:8080/get

Change Any field and click save.

At the breakpoints you will see that the entity comes over as 
Extended<java.lang.Object>
``Extended{name='INITIAL', customData=java.lang.Object@367a1df4}``

This repeats even if overridden in Dnis Controller and given an exact type



The way I have found around this is to send Extended<DnisData> and DnisData
And submit both with the form. and recombine them in the save method before adding to the DB.
Not elegant but works. (Not implemented in this project)