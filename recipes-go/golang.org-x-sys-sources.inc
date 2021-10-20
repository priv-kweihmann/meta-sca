SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20211020064051-0ec99a608a1b.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20211020064051-0ec99a608a1b;downloadfilename=golang-org-x-sys-0.0.0-20211020064051-0ec99a608a1b.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "3822771216d51558ee56567ad474df918705d967e3a7fd0974e5e42aaf03f759"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

