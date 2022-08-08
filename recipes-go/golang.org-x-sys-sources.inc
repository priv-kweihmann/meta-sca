SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220808155132-1c4a2a72c664.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220808155132-1c4a2a72c664;downloadfilename=golang-org-x-sys-0.0.0-20220808155132-1c4a2a72c664.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "dacc565724c01ddb4cab7806b82dab6f2a643139082bcf4c0c6d5f0953be549a"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

