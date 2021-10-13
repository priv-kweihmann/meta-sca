SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20211013075003-97ac67df715c.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20211013075003-97ac67df715c;downloadfilename=golang-org-x-sys-0.0.0-20211013075003-97ac67df715c.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "5e21fc276acc5e250687d98c35b73682bf9244fc83488b7b0766a5fa5881017f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

