## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-license-filter

## Global file filter
SCA_FILE_FILTER ?= "\
                    .pc/* \
                    tests/* \
                    test/* \
                    doc/* \
                    testsuite/* \
                    **/tests/* \
                    **/test/* \
                    **/doc/* \
                    **/testsuite/* \
"



## Local file filter
SCA_FILE_FILTER_EXTRA ??= ""

def sca_filter_files(d, path, addfilter=[]):
    import os
    import subprocess
    res = []
    _filter = [x for x in d.getVar("SCA_FILE_FILTER").split(" ") if x] + addfilter
    for item in _filter:
        _pattern = os.path.join(d.getVar("SCA_SOURCES_DIR"), item)
        try:
            cmd_out = subprocess.check_output(["find", path, "-type", "f", "-wholename", _pattern])
        except subprocess.CalledProcessError as e:
            cmd_out = e.output or ""

        if not isinstance(cmd_out, str):
            cmd_out = cmd_out.decode('utf-8')

        res += [x for x in cmd_out.split("\n") if x]

    res += sca_filter_by_license(d)
    return sorted(list(set(res)))

def sca_get_installed_pkgs(d):
    import os
    import json

    try:
        with open(d.getVar("SCA_IMAGE_PKG_LIST")) as i:
            _json = json.load(i)
            return _json.keys()
    except:
        pass
    return []
