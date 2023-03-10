SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.6.0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.6.0;downloadfilename=golang-org-x-sys-0.6.0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "8c15860e3850e3cea5a7186bb79b8cf98f513d9ac5498099d3bddfd49c6dfc3f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

