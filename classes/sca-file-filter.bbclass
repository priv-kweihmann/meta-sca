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

SCA_LOCAL_FILE_FILTER ?= "\
                    recipe-sysroot/* \
                    recipe-sysroot-native/* \
                    temp/* \
                    image/* \
                    package/* \
                    packages-split/* \
    "

## Local file filter
SCA_FILE_FILTER_EXTRA ??= ""

def sca_filter_files(d, path, addfilter=[]):
    import os
    import glob
    res = []
    _filter = [x for x in d.getVar("SCA_FILE_FILTER").split(" ") if x] + addfilter
    if d.getVar("SCA_SOURCES_DIR") == d.getVar("WORKDIR"):
        ## in case we have a unclean split of source/build we do need to
        ## filter out the local workdir folders create by bitbake
        _filter += [x for x in d.getVar("SCA_LOCAL_FILE_FILTER").split(" ") if x]
    for item in _filter:
        res += glob.glob(os.path.join(d.getVar("SCA_SOURCES_DIR"), item), recursive=True)
    res += sca_filter_by_license(d)
    return sorted(list(set(res)))
