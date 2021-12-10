SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20211209171907-798191bca915.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20211209171907-798191bca915;downloadfilename=golang-org-x-sys-0.0.0-20211209171907-798191bca915.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "39e67deceac8ae85c7f13a5ceea050c5d03952c1ab11a381b54fca8951a40cb3"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

