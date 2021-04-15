SRC_URI += "https://proxy.golang.org/github.com/alcortesm/tgz/@v/v0.0.0-20161220082320-9c5fe88206d7.zip;srcoutput=github.com/alcortesm/tgz;srcinput=github.com/alcortesm/tgz@v0.0.0-20161220082320-9c5fe88206d7;downloadfilename=github-com-alcortesm-tgz-0.0.0-20161220082320-9c5fe88206d7.zip;name=github-com-alcortesm-tgz"
SRC_URI[github-com-alcortesm-tgz.sha256sum] = "ccedffb2c46724216b787fb1a79ae33fb0dfdd672c669db000c4ed5a68b08014"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/alcortesm/tgz/LICENSE;md5=e3780b004ef4db4136f217000931b9b4 \
"

GOSRC_INCLUDEGUARD += "github.com-alcortesm-tgz-sources.inc"

