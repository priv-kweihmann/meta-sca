SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220608164250-635b8c9b7f68.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220608164250-635b8c9b7f68;downloadfilename=golang-org-x-sys-0.0.0-20220608164250-635b8c9b7f68.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "8b39f87683883dc56f604f4b2125e9b470c72a25b17586f613bc3e13e5d9b4d8"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

