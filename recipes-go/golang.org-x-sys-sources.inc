SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20211002104244-808efd93c36d.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20211002104244-808efd93c36d;downloadfilename=golang-org-x-sys-0.0.0-20211002104244-808efd93c36d.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "1c80c4ef3aaa4577c9f570d2df9b35af9a08fc7779a02d91d3ba01f8760fd418"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

