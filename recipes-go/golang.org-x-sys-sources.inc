SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220405052023-b1e9470b6e64.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220405052023-b1e9470b6e64;downloadfilename=golang-org-x-sys-0.0.0-20220405052023-b1e9470b6e64.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "fe227bd36a502de1df04daffb13ab6d1b8eaa6178edaddcdbbda3c02d6f6280c"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

