SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20210507014357-30e306a8bba5.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20210507014357-30e306a8bba5;downloadfilename=golang-org-x-sys-0.0.0-20210507014357-30e306a8bba5.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "887bc1204d2f08ee75ebd6d9d58177d9a0e0a2250a3b6885eeaf03fb472ae9f4"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

