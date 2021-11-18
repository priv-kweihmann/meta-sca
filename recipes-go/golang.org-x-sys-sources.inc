SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20211117180635-dee7805ff2e1.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20211117180635-dee7805ff2e1;downloadfilename=golang-org-x-sys-0.0.0-20211117180635-dee7805ff2e1.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "43b19b911e51f210ca2d97cd0edf1084b2b88e7b29107d2a46d56a66062878a8"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

