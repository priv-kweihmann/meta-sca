SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220708085239-5a0f0661e09d.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220708085239-5a0f0661e09d;downloadfilename=golang-org-x-sys-0.0.0-20220708085239-5a0f0661e09d.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "8bc66febb732c3ca540c185c7f34d337259931a84335ec167b70b69d49263685"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

