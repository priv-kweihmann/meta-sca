SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20221010170243-090e33056c14.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20221010170243-090e33056c14;downloadfilename=golang-org-x-sys-0.0.0-20221010170243-090e33056c14.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "90ea00ad812be6819bb4963bda5ea62beee71aee00f437e9320a33cc14bab768"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

