SRC_URI += "https://proxy.golang.org/github.com/neelance/sourcemap/@v/v0.0.0-20200213170602-2833bce08e4c.zip;srcoutput=github.com/neelance/sourcemap;srcinput=github.com/neelance/sourcemap@v0.0.0-20200213170602-2833bce08e4c;downloadfilename=github-com-neelance-sourcemap-0.0.0-20200213170602-2833bce08e4c.zip;name=github-com-neelance-sourcemap"
SRC_URI[github-com-neelance-sourcemap.sha256sum] = "a29daae5bf3dd206f953a52d5d4da8c84d82fdc9a0376f96cfd9ab1a860ce2a8"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/neelance/sourcemap/LICENSE;md5=2173499f525ea5d21bcec968f5e730d9 \
"

GOSRC_INCLUDEGUARD += "github.com-neelance-sourcemap-sources.inc"

