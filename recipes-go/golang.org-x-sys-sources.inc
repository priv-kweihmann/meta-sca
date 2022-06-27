SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220624220833-87e55d714810.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220624220833-87e55d714810;downloadfilename=golang-org-x-sys-0.0.0-20220624220833-87e55d714810.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "543e0f595c2fbaca08f6f2dbf9412077d6dcf5bed29bb8e9e739e51287475930"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

