SRC_URI += "https://proxy.golang.org/github.com/sony/gobreaker/@v/v0.5.0.zip;srcoutput=github.com/sony/gobreaker;srcinput=github.com/sony/gobreaker@v0.5.0;downloadfilename=github-com-sony-gobreaker-0.5.0.zip;name=github-com-sony-gobreaker"
SRC_URI[github-com-sony-gobreaker.sha256sum] = "9b4fe3991963f409116289a0d9830896096da7dd8a090bf404348904737ba833"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/sony/gobreaker/LICENSE;md5=bc9754edcba199de9bf88b85ff7d5d2c \
"

GOSRC_INCLUDEGUARD += "github.com-sony-gobreaker-sources.inc"

