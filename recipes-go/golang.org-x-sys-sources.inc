SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20220513210249-45d2b4557a2a.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20220513210249-45d2b4557a2a;downloadfilename=golang-org-x-sys-0.0.0-20220513210249-45d2b4557a2a.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "a02cd20236505fa36426b8b8e62953bda77e2580d36b4ca380387e9fa927b5dd"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

