inherit go

HOMEPAGE ?= "https://${GO_IMPORT}"

S = "${WORKDIR}"

export GO111MODULE = "auto"

python gosrc_do_unpack() {
    import os
    import re
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

EXPORT_FUNCTIONS do_unpack

RDEPENDS_${PN}_class-target_append = " go"
RDEPENDS_${PN}_class-native_append = " go-binary-native"

UPSTREAM_CHECK_URI ?= "https://pkg.go.dev/${GO_IMPORT}?tab=versions"
UPSTREAM_CHECK_REGEX ?= "/${GO_IMPORT}/v(?P<pver>(\d+[\.\-_a-f0-9]*)+)/"
