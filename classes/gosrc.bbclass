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
            _mapping[d.expand("${WORKDIR}/sources/" + _srcinput)] = \
                d.expand("${S}/src/" + _srcoutput)
    fetcher.unpack(d.expand('${WORKDIR}/sources'))

    for k,v in _mapping.items():
        os.makedirs(v, exist_ok=True)
        for f in os.listdir(k):
            shutil.move(os.path.join(k, f), os.path.join(v, f))
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

UPSTREAM_CHECK_URI ?= "https://pkg.go.dev/${GO_IMPORT}?tab=versions"
UPSTREAM_CHECK_REGEX ?= "/${GO_IMPORT}@v(?P<pver>\d+[\.\-_a-f0-9]+)"
