SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20210908233432-aa78b53d3365.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20210908233432-aa78b53d3365;downloadfilename=golang-org-x-sys-0.0.0-20210908233432-aa78b53d3365.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "b8b8dd6fec268a87b86b5f144c9bc1e3fc1f2c8c237870c99e777cbaccb161f7"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

