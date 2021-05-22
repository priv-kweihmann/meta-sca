SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20210521203332-0cec03c779c1.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20210521203332-0cec03c779c1;downloadfilename=golang-org-x-sys-0.0.0-20210521203332-0cec03c779c1.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "9dae57e12d14f1c06a21d2c7ae9142f51fcc9a2d742d6868463bbdbebd50ea46"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

