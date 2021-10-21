SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20211020174200-9d6173849985.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20211020174200-9d6173849985;downloadfilename=golang-org-x-sys-0.0.0-20211020174200-9d6173849985.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "a4cff627ef6b6b493562f6fa7d4ee0a34c13d57e9760c68386c94850418aeee7"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

