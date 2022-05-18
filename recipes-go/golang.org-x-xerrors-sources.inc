SRC_URI += "https://proxy.golang.org/golang.org/x/xerrors/@v/v0.0.0-20220517211312-f3a8303e98df.zip;srcoutput=golang.org/x/xerrors;srcinput=golang.org/x/xerrors@v0.0.0-20220517211312-f3a8303e98df;downloadfilename=golang-org-x-xerrors-0.0.0-20220517211312-f3a8303e98df.zip;name=golang-org-x-xerrors"
SRC_URI[golang-org-x-xerrors.sha256sum] = "bc395a1480bac68c5444a29926b9bc5ecea88f5fcec7451c1946dec6bd9a051f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/xerrors/LICENSE;md5=a413d6b3884e141783f23d00d5838777 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-xerrors-sources.inc"

