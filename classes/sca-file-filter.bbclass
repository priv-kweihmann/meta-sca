## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-license-filter

## Global file filter
SCA_FILE_FILTER ?= "\
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
    _filter = [x for x in d.getVar("SCA_FILE_FILTER", True).split(" ") if x] + addfilter
    for item in _filter:
        try:
            cmd_out = subprocess.check_output(["find", d.getVar("SCA_SOURCES_DIR", True), "-type", "f", "-wholename", item])
        except subprocess.CalledProcessError as e:
            cmd_out = e.output or ""
        if not isinstance(cmd_out, str):
            cmd_out = cmd_out.decode('utf-8')
        res += [x.strip() for x in cmd_out.split("\n") if x]
    res += sca_filter_by_license(d)
    return sorted(list(set(res)))
