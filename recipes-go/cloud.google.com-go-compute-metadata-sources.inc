SRC_URI += "https://proxy.golang.org/cloud.google.com/go/compute/metadata/@v/v0.2.1.zip;srcoutput=cloud.google.com/go/compute/metadata;srcinput=cloud.google.com/go/compute/metadata@v0.2.1;downloadfilename=cloud-google-com-go-compute-metadata-0.2.1.zip;name=cloud-google-com-go-compute-metadata"
SRC_URI[cloud-google-com-go-compute-metadata.sha256sum] = "3a0de5e16122a8d290a00fe44253fd9cd740bbb69517f41257fddfa622af52ab"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/cloud.google.com/go/compute/metadata/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"

GOSRC_INCLUDEGUARD += "cloud.google.com-go-compute-metadata-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-compute-sources.inc', '', 'cloud.google.com-go-compute-sources.inc', d)}
