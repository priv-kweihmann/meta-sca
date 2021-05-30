SRC_URI += "https://proxy.golang.org/gopkg.in/neurosnap/sentences.v1/@v/v1.0.7.zip;srcoutput=gopkg.in/neurosnap/sentences.v1;srcinput=gopkg.in/neurosnap/sentences.v1@v1.0.7;downloadfilename=gopkg-in-neurosnap-sentences-v1-1.0.7.zip;name=gopkg-in-neurosnap-sentences-v1"
SRC_URI[gopkg-in-neurosnap-sentences-v1.sha256sum] = "f438078048ba5ef3595450f00c11fd2cc8b7baa10272f75fae03a8958e338181"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/gopkg.in/neurosnap/sentences.v1/LICENSE.md;md5=4682920380baa290a03b7da7cdf4b327 \
"

GOSRC_INCLUDEGUARD += "gopkg.in-neurosnap-sentences.v1-sources.inc"

