## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2021, Konrad Weihmann

inherit go

HOMEPAGE ?= "https://${GO_IMPORT}"

S = "${WORKDIR}"

export GO111MODULE = "auto"

python gosrc_do_unpack() {
    import os
    import shutil

    src_uri = (d.getVar('SRC_URI') or "").split()
    if not src_uri:
        return

    # create a mapping for the source moving part
    # move all from an arbitrary sources-dir into
    # the real S tree using the mapping

    # ${WORKDIR}/sources/${name}@v${ver} -> ${S}/src/${name}
    _mapping = {}

    fetcher = bb.fetch2.Fetch(src_uri, d)
    for url in fetcher.urls:
        _srcinput = fetcher.ud[url].parm.get('srcinput')
        _srcoutput = fetcher.ud[url].parm.get('srcoutput')
        if _srcinput and _srcoutput:  
            _mapping[d.expand("${S}/src/" + _srcoutput)] = \
                d.expand("${WORKDIR}/sources/" + _srcinput)
    fetcher.unpack(d.expand('${WORKDIR}/sources'))

    for k,v in _mapping.items():
        os.makedirs(k, exist_ok=True)
        for f in os.listdir(v):
            if os.path.exists(os.path.join(k, f)):
                continue
            if os.path.isdir(os.path.join(v, f)):
                shutil.copytree(os.path.join(v, f), os.path.join(k, f))
            else:
                shutil.copy(os.path.join(v, f), os.path.join(k, f))
}
do_unpack[dirs] += "${WORKDIR}/sources ${WORKDIR}/src"
do_unpack[cleandirs] += "${WORKDIR}/sources ${WORKDIR}/src"

python remove_testdirs() {
    import os
    import shutil

    # optionally remove a few directories
    for _dir in (d.getVar("GOSRC_REMOVEDIRS") or "").split(" "):
        if not _dir:
            continue
        _path = os.path.join(d.getVar("WORKDIR"), "src", _dir)
        if os.path.isdir(_path):
            shutil.rmtree(_path, ignore_errors=True)
        elif os.path.isfile(_path):
            os.remove(_path)
}

python create_pseudo_mod() {
    import os
    # create a pseudo go.mod in case none could be found
    _path = d.expand("${WORKDIR}/src/${GO_IMPORT}/go.mod")
    if not os.path.exists(_path):
        with open(_path, "w") as o:
            o.write("module {}\n".format(d.getVar("GO_IMPORT")))
}

do_compile[prefuncs] += "remove_testdirs create_pseudo_mod"

EXPORT_FUNCTIONS do_unpack

UPSTREAM_CHECK_IMPORT_SUFFIX ?= ""
UPSTREAM_CHECK_GITHUB_TAGS ?= "0"

def gosrc_upstream_url(d):
    if d.getVar("UPSTREAM_CHECK_GITHUB_TAGS") != "0":
        return "https://${GO_IMPORT}/tags"
    return "https://pkg.go.dev/${GO_IMPORT}${UPSTREAM_CHECK_IMPORT_SUFFIX}?tab=versions"

def gosrc_version_pattern(d):
    if d.getVar("UPSTREAM_CHECK_GITHUB_TAGS") != "0":
        return "releases/tag/v(?P<pver>\\d+\\.\\d+\\.\\d+)"
    import re
    _map = {
        r"0.0.0-(\d+)-[a-f0-9]+": "/${GO_IMPORT}${UPSTREAM_CHECK_IMPORT_SUFFIX}@v(?P<pver>0.0.0-\\d+-[a-f0-9]+)$",
        r"1.0.0-(\d+)-[a-f0-9]+": "/${GO_IMPORT}${UPSTREAM_CHECK_IMPORT_SUFFIX}@v(?P<pver>1.0.0-\\d+-[a-f0-9]+)$",
        r"2.0.0-(\d+)-[a-f0-9]+": "/${GO_IMPORT}${UPSTREAM_CHECK_IMPORT_SUFFIX}@v(?P<pver>2.0.0-\\d+-[a-f0-9]+)$",
        r"3.0.0-(\d+)-[a-f0-9]+": "/${GO_IMPORT}${UPSTREAM_CHECK_IMPORT_SUFFIX}@v(?P<pver>3.0.0-\\d+-[a-f0-9]+)$",
        r"4.0.0-(\d+)-[a-f0-9]+": "/${GO_IMPORT}${UPSTREAM_CHECK_IMPORT_SUFFIX}@v(?P<pver>4.0.0-\\d+-[a-f0-9]+)$",
        r"5.0.0-(\d+)-[a-f0-9]+": "/${GO_IMPORT}${UPSTREAM_CHECK_IMPORT_SUFFIX}@v(?P<pver>5.0.0-\\d+-[a-f0-9]+)$",
        r"6.0.0-(\d+)-[a-f0-9]+": "/${GO_IMPORT}${UPSTREAM_CHECK_IMPORT_SUFFIX}@v(?P<pver>6.0.0-\\d+-[a-f0-9]+)$",
        r"7.0.0-(\d+)-[a-f0-9]+": "/${GO_IMPORT}${UPSTREAM_CHECK_IMPORT_SUFFIX}@v(?P<pver>7.0.0-\\d+-[a-f0-9]+)$",
        r"8.0.0-(\d+)-[a-f0-9]+": "/${GO_IMPORT}${UPSTREAM_CHECK_IMPORT_SUFFIX}@v(?P<pver>8.0.0-\\d+-[a-f0-9]+)$",
        r"9.0.0-(\d+)-[a-f0-9]+": "/${GO_IMPORT}${UPSTREAM_CHECK_IMPORT_SUFFIX}@v(?P<pver>9.0.0-\\d+-[a-f0-9]+)$",
        r"10.0.0-(\d+)-[a-f0-9]+": "/${GO_IMPORT}${UPSTREAM_CHECK_IMPORT_SUFFIX}@v(?P<pver>10.0.0-\\d+-[a-f0-9]+)$",
        r"(\d+)\.(\d+)\.(\d+)\+incompatible": "/${GO_IMPORT}${UPSTREAM_CHECK_IMPORT_SUFFIX}@v(?P<pver>\\d+\.\\d+\.\\d+\+incompatible)$",
        r"(\d+)\.(\d+)\.(\d+)": "/${GO_IMPORT}${UPSTREAM_CHECK_IMPORT_SUFFIX}@v(?P<pver>\\d+\.\\d+\.\\d+)$",
    }
    for pattern, value in _map.items():
        if re.match(pattern, d.getVar("PV")):
            bb.warn("Using {}".format(value))
            return value
    return "/${GO_IMPORT}@v(?P<pver>\\d+[\.\-_a-f0-9]+)"

UPSTREAM_CHECK_URI ?= "${@gosrc_upstream_url(d)}"
UPSTREAM_CHECK_REGEX ?= "${@gosrc_version_pattern(d)}"
