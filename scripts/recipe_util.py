import sys

try:
    from oelint_parser.cls_item import Variable
    from oelint_parser.cls_stash import Stash
except ImportError:
    sys.stderr.write("Can't import 'oelint-parser'. Please run 'pip install oelint-parser>=3.0' to enable this script here\n")

def __get_info_from_stash(_filepath):
    _rdepends = set()
    _depends = set()

    _stash = Stash(quiet=True)
    _stash.AddFile(_filepath)
           
    for item in _stash.GetItemsFor(attribute=Variable.ATTR_VAR, attributeValue="RDEPENDS"):
        _rdepends.update([_stash.ExpandTerm(_filepath, y)
                            for y in item.get_items()])

    # Get build time dependencies
    for item in _stash.GetItemsFor(attribute=Variable.ATTR_VAR, attributeValue="DEPENDS"):
        _depends.update([_stash.ExpandTerm(_filepath, y)
                            for y in item.get_items()])

    return (_depends, _rdepends)

def check_depends(depends, rdepends, oldrecipes):
    _rdepends = set()
    _depends = set()
    for x in oldrecipes:
        d, r = __get_info_from_stash(x)
        _depends.update(d)
        _rdepends.update(r)
    
    depends = set(list(depends) + list(_depends))
    rdepends = set(list(rdepends) + list(_rdepends))
    return (depends, rdepends)

    