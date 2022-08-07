SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220804214406-8e32c043e418.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220804214406-8e32c043e418;downloadfilename=golang-org-x-sys-0.0.0-20220804214406-8e32c043e418.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "fe8e87e754957256465cf1d3eca2f3630d6c316261a3c42d66f481a118804b38"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

