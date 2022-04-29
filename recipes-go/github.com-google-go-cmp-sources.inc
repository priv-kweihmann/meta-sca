SRC_URI += "https://proxy.golang.org/github.com/google/go-cmp/@v/v0.5.8.zip;srcoutput=github.com/google/go-cmp;srcinput=github.com/google/go-cmp@v0.5.8;downloadfilename=github-com-google-go-cmp-0.5.8.zip;name=github-com-google-go-cmp"
SRC_URI[github-com-google-go-cmp.sha256sum] = "d17574d5a6ea9f606ed735117170e02aefc2f11f8ae15e3898ed99d255b46f06"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/google/go-cmp/LICENSE;md5=4ac66f7dea41d8d116cb7fb28aeff2ab \
"

GOSRC_INCLUDEGUARD += "github.com-google-go-cmp-sources.inc"

