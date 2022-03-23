SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220319134239-a9b59b0215f8.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220319134239-a9b59b0215f8;downloadfilename=golang-org-x-sys-0.0.0-20220319134239-a9b59b0215f8.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "3e821e70fa546e73b95eadb03db0737f920e242cd4aecf5f7fa669992c749b27"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

