SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20210403161142-5e06dd20ab57.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20210403161142-5e06dd20ab57;downloadfilename=golang-org-x-sys-0.0.0-20210403161142-5e06dd20ab57.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "b3b5cd897ddb9bc13367f02bb61dc7cc043dbfc050de7655885dc82a5e609450"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

