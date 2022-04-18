SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220412211240-33da011f77ad.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220412211240-33da011f77ad;downloadfilename=golang-org-x-sys-0.0.0-20220412211240-33da011f77ad.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "ffb4b3488ab203e6a883355e57fd1c4a84983c41fb0880ef520587863d47219c"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

