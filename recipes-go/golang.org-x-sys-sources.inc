SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20210903071746-97244b99971b.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20210903071746-97244b99971b;downloadfilename=golang-org-x-sys-0.0.0-20210903071746-97244b99971b.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "ba4a6dd03dec0182d440484e9f6215f36de0e8524ae931a15ce9ee21127d7304"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

