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
    import glob
    res = []
    _filter = [x for x in d.getVar("SCA_FILE_FILTER").split(" ") if x] + addfilter
    for item in _filter:
        res += glob.glob(os.path.join(d.getVar("SCA_SOURCES_DIR"), item), recursive=True)
    res += sca_filter_by_license(d)
    return sorted(list(set(res)))
