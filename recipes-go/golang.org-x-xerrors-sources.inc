SRC_URI += "https://proxy.golang.org/golang.org/x/xerrors/@v/v0.0.0-20220609144429-65e65417b02f.zip;srcoutput=golang.org/x/xerrors;srcinput=golang.org/x/xerrors@v0.0.0-20220609144429-65e65417b02f;downloadfilename=golang-org-x-xerrors-0.0.0-20220609144429-65e65417b02f.zip;name=golang-org-x-xerrors"
SRC_URI[golang-org-x-xerrors.sha256sum] = "90ea512102594b3be8350fea4b15b98c20cb4e6b84551c3146d445f31ce9a50f"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/xerrors/LICENSE;md5=a413d6b3884e141783f23d00d5838777 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-xerrors-sources.inc"

