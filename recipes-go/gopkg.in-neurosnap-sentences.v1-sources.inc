SRC_URI += "https://proxy.golang.org/gopkg.in/neurosnap/sentences.v1/@v/v1.0.6.zip;srcoutput=gopkg.in/neurosnap/sentences.v1;srcinput=gopkg.in/neurosnap/sentences.v1@v1.0.6;downloadfilename=gopkg-in-neurosnap-sentences-v1-1.0.6.zip;name=gopkg-in-neurosnap-sentences-v1"
SRC_URI[gopkg-in-neurosnap-sentences-v1.sha256sum] = "e3df38d6fc6097f9d1d76ee13e24fec69103c43248ca6a7f3ade2afec5e85bdd"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/gopkg.in/neurosnap/sentences.v1/LICENSE.md;md5=4682920380baa290a03b7da7cdf4b327 \
"

GOSRC_INCLUDEGUARD += "gopkg.in-neurosnap-sentences.v1-sources.inc"

