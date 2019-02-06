## This file contains helper function used 
## when converting raw elements from checkers
## to checkstyle-format

def checkstyle_prettify(d, elem):
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom
    rough_string = ElementTree.tostring(elem, 'utf-8')
    reparsed = minidom.parseString(rough_string)
    return reparsed.toprettyxml(indent="  ")

def checkstyle_allowed_warning_level(d):
    opts = ["info", "warning", "error"]
    while (opts and d.getVar("SCA_WARNING_LEVEL") != opts[0]):
        opts = opts[1:]
    return opts