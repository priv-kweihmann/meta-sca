SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20221013171732-95e765b1cc43.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20221013171732-95e765b1cc43;downloadfilename=golang-org-x-sys-0.0.0-20221013171732-95e765b1cc43.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "f8162ab11de3602d8439d6ed3c8d0e239048bf8d95525f5919e3f60e56a52aeb"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

