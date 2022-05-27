SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220520151302-bc2c85ada10a.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220520151302-bc2c85ada10a;downloadfilename=golang-org-x-sys-0.0.0-20220520151302-bc2c85ada10a.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "734caf189549ea9b85dd93f58e87e3f3bceaec72229449f5879c3c067a2ad60e"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

