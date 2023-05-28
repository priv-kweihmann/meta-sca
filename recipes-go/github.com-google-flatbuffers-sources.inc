SRC_URI += "https://proxy.golang.org/github.com/google/flatbuffers/@v/v23.5.26+incompatible.zip;srcoutput=github.com/google/flatbuffers;srcinput=github.com/google/flatbuffers@v23.5.26+incompatible;downloadfilename=github-com-google-flatbuffers-23.5.26+incompatible.zip;name=github-com-google-flatbuffers"
SRC_URI[github-com-google-flatbuffers.sha256sum] = "facb94fc951fbe2aa3b70789e72a25c3a16612e5531ffaeb3d6178c48d1eb7b1"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/google/flatbuffers/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://src/github.com/google/flatbuffers/dart/LICENSE;md5=de048fefedc11f95ce6013188756c8c5 \
    file://src/github.com/google/flatbuffers/swift/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "github.com-google-flatbuffers-sources.inc"

