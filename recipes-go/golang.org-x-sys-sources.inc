SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.15.0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.15.0;downloadfilename=golang-org-x-sys-0.15.0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "8612eb416c739c3b04ce48dcbe65632c6fbc427031fd981caeceec6410d1e1fc"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

