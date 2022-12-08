SRC_URI += "https://proxy.golang.org/cloud.google.com/go/compute/metadata/@v/v0.2.2.zip;srcoutput=cloud.google.com/go/compute/metadata;srcinput=cloud.google.com/go/compute/metadata@v0.2.2;downloadfilename=cloud-google-com-go-compute-metadata-0.2.2.zip;name=cloud-google-com-go-compute-metadata"
SRC_URI[cloud-google-com-go-compute-metadata.sha256sum] = "a3b0b52d11930157555f230ffac61ab4d3fb944bf50a9da4dd5b2e50a99edf9d"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/compute/metadata/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-compute-metadata-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-compute-sources.inc', '', 'cloud.google.com-go-compute-sources.inc', d)}
