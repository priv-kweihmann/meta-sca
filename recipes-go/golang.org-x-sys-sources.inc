SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220110181412-a018aaa089fe.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220110181412-a018aaa089fe;downloadfilename=golang-org-x-sys-0.0.0-20220110181412-a018aaa089fe.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "912d296f401618a01e080bcf5b6bde60ec3c0803b81b3c16e10170139234ddbc"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

