SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220610221304-9f5ed59c137d.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220610221304-9f5ed59c137d;downloadfilename=golang-org-x-sys-0.0.0-20220610221304-9f5ed59c137d.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "2684e9cec7b48014b253546979b947edd2ade0e8f6e8c165af182c8eb1fac11f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

