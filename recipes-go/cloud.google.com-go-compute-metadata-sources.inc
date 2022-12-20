SRC_URI += "https://proxy.golang.org/cloud.google.com/go/compute/metadata/@v/v0.2.3.zip;srcoutput=cloud.google.com/go/compute/metadata;srcinput=cloud.google.com/go/compute/metadata@v0.2.3;downloadfilename=cloud-google-com-go-compute-metadata-0.2.3.zip;name=cloud-google-com-go-compute-metadata"
SRC_URI[cloud-google-com-go-compute-metadata.sha256sum] = "292864dbd0b1de37a968e285e949885e573384837d81cd3695be5ce2e2391887"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/compute/metadata/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-compute-metadata-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-compute-sources.inc', '', 'cloud.google.com-go-compute-sources.inc', d)}
