SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220503163025-988cb79eb6c6.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220503163025-988cb79eb6c6;downloadfilename=golang-org-x-sys-0.0.0-20220503163025-988cb79eb6c6.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "607a791ff884d53ba131ec54fd701d956929818905cad32d22bbe7a227c70c27"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

