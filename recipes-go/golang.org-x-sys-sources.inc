SRC_URI += "https://proxy.golang.org/golang.org/x/sys/@v/v0.0.0-20210415045647-66c3f260301c.zip;srcoutput=golang.org/x/sys;srcinput=golang.org/x/sys@v0.0.0-20210415045647-66c3f260301c;downloadfilename=golang-org-x-sys-0.0.0-20210415045647-66c3f260301c.zip;name=golang-org-x-sys"
SRC_URI[golang-org-x-sys.sha256sum] = "365ddb19fcbac24ac450167c99e18f602108e7cc8e94972c9113c5df63acfea4"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/golang.org/x/sys/LICENSE;md5=5d4950ecb7b26d2c5e4e7b4e0dd74707 \
"

GOSRC_INCLUDEGUARD += "golang.org-x-sys-sources.inc"

