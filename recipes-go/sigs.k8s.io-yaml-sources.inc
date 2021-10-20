SRC_URI += "https://proxy.golang.org/sigs.k8s.io/yaml/@v/v1.3.0.zip;srcoutput=sigs.k8s.io/yaml;srcinput=sigs.k8s.io/yaml@v1.3.0;downloadfilename=sigs-k8s-io-yaml-1.3.0.zip;name=sigs-k8s-io-yaml"
SRC_URI[sigs-k8s-io-yaml.sha256sum] = "aac88da551c2a512b642cb35658bf3dc862595a3566bd840ebf18e4802f1fcc9"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/sigs.k8s.io/yaml/LICENSE;md5=0ceb9ff3b27d3a8cf451ca3785d73c71 \
"

GOSRC_INCLUDEGUARD += "sigs.k8s.io-yaml-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v2-sources.inc', '', 'gopkg.in-yaml.v2-sources.inc', d)}
