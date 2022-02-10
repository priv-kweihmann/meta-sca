SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220209214540-3681064d5158.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220209214540-3681064d5158;downloadfilename=golang-org-x-sys-0.0.0-20220209214540-3681064d5158.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "84289ab5dec00ea6f7b911c392b59198d046eabe43185cba45cff79f5b1a9233"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

