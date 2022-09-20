SRC_URI += "https://proxy.golang.org/golang.org/x/xerrors/@v/v0.0.0-20220907171357-04be3eba64a2.zip;srcoutput=golang.org/x/xerrors;srcinput=golang.org/x/xerrors@v0.0.0-20220907171357-04be3eba64a2;downloadfilename=golang-org-x-xerrors-0.0.0-20220907171357-04be3eba64a2.zip;name=golang-org-x-xerrors"
SRC_URI[golang-org-x-xerrors.sha256sum] = "b9c481db33c4b682ba8ba348018ddbd2155bd227cc38ff9f6b4cb2b74bbc3c14"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/xerrors/LICENSE;md5=a413d6b3884e141783f23d00d5838777 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-xerrors-sources.inc"

