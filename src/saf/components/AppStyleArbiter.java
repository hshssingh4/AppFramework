package saf.components;

/**
 * This interface serves as a family of type that will initialize
 * the style for some set of controls, like the workspace, for example.
 * 
 * @author Richard McKenna
 * @author Harpreet Singh
 * @version 1.0
 */
public interface AppStyleArbiter 
{
    // THESE ARE COMMON STYLE CLASSES WE'LL USE
    public static final String CLASS_BORDERED_PANE = "bordered_pane";
    public static final String CLASS_CANVAS = "canvas_class";
    public static final String CLASS_HEADING_LABEL = "heading_label";
    public static final String CLASS_SUBHEADING_LABEL = "subheading_label";
    public static final String CLASS_PROMPT_LABEL = "prompt_label";
    public static final String CLASS_PROMPT_TEXT_FIELD = "prompt_text_field";
    public static final String CLASS_FILE_BUTTON = "file_button";
    public static final String CLASS_MAX_PANE = "max_pane";
    public static final String CLASS_COMPONENT_TOOLBAR = "component_toolbar";
    public static final String CLASS_COMPONENT_CHILD_ELEMENT = "component_child_element";
    public static final String CLASS_COMPONENT_BUTTON = "component_button";
    public static final String CLASS_TEXT_LABEL = "text_label";
    
    public void initStyle();
}
