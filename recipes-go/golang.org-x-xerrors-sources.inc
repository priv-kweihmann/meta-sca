SRC_URI += "https://proxy.golang.org/golang.org/x/xerrors/@v/v0.0.0-20220411194840-2f41105eb62f.zip;srcoutput=golang.org/x/xerrors;srcinput=golang.org/x/xerrors@v0.0.0-20220411194840-2f41105eb62f;downloadfilename=golang-org-x-xerrors-0.0.0-20220411194840-2f41105eb62f.zip;name=golang-org-x-xerrors"
SRC_URI[golang-org-x-xerrors.sha256sum] = "74da8691af0731e342692d53b91af7a0b8b1d7ce509eccc4fc6fddde4fecfcd1"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/xerrors/LICENSE;md5=a413d6b3884e141783f23d00d5838777 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-xerrors-sources.inc"

