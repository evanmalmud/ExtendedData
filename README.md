# ExtendedData

Explanation of issue

I have an issue where Im trying to create a generic type, and Post that data to spring (where it will know the type) so I can share code for different types and different controllers. 
Essentially im trying to make an Edit form for this data. Where someone can simply change the html fields in thymeleaf to map, but wont need to change the fields on the controller over overriding this method (below) to just have the typing set correctly.

Extended<T> is my Entity
DnisData is my type that will change for each use case.
For example 

@Override
@PostMapping({"/save"})
public ModelAndView saveEditedEntity(@ModelAttribute("entry") @Valid Extended<DnisData> entry, BindingResult bindingResult, Model model) {}

So this "works" but the problem is that type erasure happens and the Object doesnt map at all it seems. 
I get back java.lang.Object in place of ExtendedDnisData.



How To:
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

@PostMapping({"/save"})
public ModelAndView saveEditedEntity(@ModelAttribute("entry") @Valid Extended<DnisData> entry, (@ModelAttribute("customData") @Valid DnisData customData, BindingResult bindingResult, Model model) {}
