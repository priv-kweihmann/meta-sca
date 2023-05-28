SRC_URI += "https://proxy.golang.org/lukechampine.com/uint128/@v/v1.3.0.zip;srcoutput=lukechampine.com/uint128;srcinput=lukechampine.com/uint128@v1.3.0;downloadfilename=lukechampine-com-uint128-1.3.0.zip;name=lukechampine-com-uint128"
SRC_URI[lukechampine-com-uint128.sha256sum] = "8f70dbb56881c4037a9863429bb1be42d560f08f02b2b4b93f9e707f385f4fa3"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/lukechampine.com/uint128/LICENSE;md5=6b5906c9bc4161f1f80926297fb76484 \
"

GOSRC_INCLUDEGUARD += "lukechampine.com-uint128-sources.inc"

