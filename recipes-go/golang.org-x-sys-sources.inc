SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.22.0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.22.0;downloadfilename=golang-org-x-sys-0.22.0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "2434299f530b049a5c8121d6465751ce58bd62f939afde34c442f79c88e9033c"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

