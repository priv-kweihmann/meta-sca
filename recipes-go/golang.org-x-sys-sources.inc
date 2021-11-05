SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20211103235746-7861aae1554b.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20211103235746-7861aae1554b;downloadfilename=golang-org-x-sys-0.0.0-20211103235746-7861aae1554b.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "01c68faa2448e7371033223caf55ae1e59f8eb0606a7bf950a95a2d9db33fdf3"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

