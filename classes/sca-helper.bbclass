def get_relative_source_path(d):
    import os
    source = d.getVar("S")
    dl_dir = d.getVar("DL_DIR")
    ## use build-dir as base
    dl_dir = os.path.dirname(dl_dir)
    common = os.path.commonprefix([source, dl_dir])
    return os.path.relpath(source, common)

def get_build_dir(d):
    import os
    source = d.getVar("S")
    dl_dir = d.getVar("DL_DIR")
    ## use build-dir as base
    dl_dir = os.path.dirname(dl_dir)
    return os.path.commonprefix([source, dl_dir])

def xml_combine(d, *args):
    import sys
    from xml.etree import ElementTree
    first = None
    for content in args:
        try:
            data = ElementTree.ElementTree(ElementTree.fromstring(content)).getroot()
            if first is None:
                first = data
            else:
                first.extend(data)
        except Exception as e:
            pass
    if first is not None:
        try:
            return ElementTree.tostring(first).decode("utf-8")
        except:
            return ElementTree.tostring(first)
    else:
        return ""

def _combine_x_entries(d, input_file, extra_key):
    import os
    _filename = d.getVar(input_file, True)
    _extra = d.getVar(extra_key, True) or ""
    res = []
    if _filename:
        _rules_file = _filename
        with open(_rules_file) as f:
            res = f.readlines()
    res += _extra.split(" ")
    res = [x.strip() for x in res if x]
    return res

def get_files_by_shabang(d, path, pattern, excludes=[]):
    import os
    import re
    res = []
    pattern = r"^'!\s+{}".format(pattern)
    for root, dirs, files in os.walk(path, topdown=True):
        for item in files:
            _filename = os.path.join(root, item)
            if _filename in excludes:
                continue
            try:
                with open(_filename, "r") as f:
                    cnt = f.readlines()
                    if cnt:
                        cnt = cnt[0]
                        if re.match(pattern, cnt):
                            res.append(_filename)
            except:
                pass
    return res

def get_files_by_extention(d, path, pattern, excludes=[]):
    import os
    res = []
    if isinstance(pattern, str):
        pattern = pattern.split(" ")
    for root, dirs, files in os.walk(path, topdown=True):
        for item in files:
            _filepath = os.path.join(root, item)
            if _filepath in excludes:
                continue
            _filename, _file_extension = os.path.splitext(_filepath)
            if _file_extension in pattern:
                res.append(_filepath)
    return res

def get_files_by_extention_or_shebang(d, path, shebang, extentions, excludes=[]):
    res = get_files_by_shabang(d, path, shebang, excludes) + get_files_by_extention(d, path, extentions, excludes)
    return sorted(list(set(res)))

def get_suppress_entries(d):
    return _combine_x_entries(d, "SCA_SUPRESS_FILE", "SCA_EXTRA_SUPPRESS")

def get_fatal_entries(d):
    return _combine_x_entries(d, "SCA_FATAL_FILE", "SCA_EXTRA_FATAL")

def _get_x_from_result(d, xml_path = ".//", lookup_key = "severity", match_key = ""):
    from xml.etree.ElementTree import Element, SubElement, Comment, tostring
    from xml.etree import ElementTree
    from xml.dom import minidom
    _filename = d.getVar("SCA_RESULT_FILE", True)
    if _filename:
        data = ElementTree.parse(_filename).getroot()
        for node in data.findall(".//"):
            ## FIXME get a grip on the severity attribute and count them
            pass
    return []

def get_warnings_from_result(d):
    return _get_x_from_result(d, match_key = "warning")

def get_errors_from_result(d):
    return _get_x_from_result(d, match_key = "error")

def get_fatal_from_result(d, fatal_ids):
    res = []
    for i in fatal_ids:
        res += _get_x_from_result(d, lookup_key = "id", match_key = i)
    return list(set(res))
