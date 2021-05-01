SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20210426230700-d19ff857e887.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20210426230700-d19ff857e887;downloadfilename=golang-org-x-sys-0.0.0-20210426230700-d19ff857e887.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "1da383a5cb2bf04be54eed373962caf4fd020a5430d701b08283b53488e82d27"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

