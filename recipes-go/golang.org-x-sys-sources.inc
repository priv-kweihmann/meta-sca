SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.14.0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.14.0;downloadfilename=golang-org-x-sys-0.14.0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "b89913c967594ac104dc08f1b6a2f1ac888d0d001494f80e053ce95d0a13989d"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

