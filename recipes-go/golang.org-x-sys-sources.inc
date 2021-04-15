SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20210414055047-fe65e336abe0.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20210414055047-fe65e336abe0;downloadfilename=golang-org-x-sys-0.0.0-20210414055047-fe65e336abe0.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "463d926c76fcbd3f920dc728d093d380a1213bb5ce25d5d5c48bb499200d7d87"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

