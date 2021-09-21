SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20210921065528-437939a70204.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20210921065528-437939a70204;downloadfilename=golang-org-x-sys-0.0.0-20210921065528-437939a70204.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "df154bbaea1365889b033c1d001c3c7f0058899d66918e6f9b52a4f07e2de8ed"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

