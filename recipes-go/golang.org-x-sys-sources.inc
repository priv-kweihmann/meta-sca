SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20210820121016-41cdb8703e55.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20210820121016-41cdb8703e55;downloadfilename=golang-org-x-sys-0.0.0-20210820121016-41cdb8703e55.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "a4cf3656ad0fd3e51530be0f153e0a421dc63f3b0b55f32598f56d48e5a2b66c"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

