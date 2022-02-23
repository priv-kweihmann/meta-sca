SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220222200937-f2425489ef4c.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220222200937-f2425489ef4c;downloadfilename=golang-org-x-sys-0.0.0-20220222200937-f2425489ef4c.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "7a2bd4f5c3b317c19c7aa4a9159818c0a6f051a30047863d701f188b1c994950"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

