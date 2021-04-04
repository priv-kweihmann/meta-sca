SRC_URI += "https://proxy.golang.org/github.com/ghodss/yaml/@v/v1.0.0.zip;srcoutput=github.com/ghodss/yaml;srcinput=github.com/ghodss/yaml@v1.0.0;downloadfilename=github-com-ghodss-yaml-1.0.0.zip;name=github-com-ghodss-yaml"
SRC_URI[github-com-ghodss-yaml.sha256sum] = "c3f295d23c02c0b35e4d3b29053586e737cf9642df9615da99c0bda9bbacc624"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/ghodss/yaml/LICENSE;md5=0ceb9ff3b27d3a8cf451ca3785d73c71 \
"

GOSRC_INCLUDEGUARD += "github.com-ghodss-yaml-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v2-sources.inc', '', 'gopkg.in-yaml.v2-sources.inc', d)}
