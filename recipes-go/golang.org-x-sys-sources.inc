SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20210421221651-33663a62ff08.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20210421221651-33663a62ff08;downloadfilename=golang-org-x-sys-0.0.0-20210421221651-33663a62ff08.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "04f3e0a944db25ba8689aec8f2eba2db9ced493921e64c60866aa19330d03cf4"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

