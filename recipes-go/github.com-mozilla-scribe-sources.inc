SRC_URI += "https://proxy.golang.org/github.com/mozilla/scribe/@v/v0.0.0-20220110210141-3fd4271eb395.zip;srcoutput=github.com/mozilla/scribe;srcinput=github.com/mozilla/scribe@v0.0.0-20220110210141-3fd4271eb395;downloadfilename=github-com-mozilla-scribe-0.0.0-20220110210141-3fd4271eb395.zip;name=github-com-mozilla-scribe"
SRC_URI[github-com-mozilla-scribe.sha256sum] = "926c32210545d47f64df4b4e398e6cf82f426179d7c938b4bb1e05c112ba296c"

GOSRC_LICENSE += "\
    MPL-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mozilla/scribe/LICENSE;md5=65d26fcc2f35ea6a181ac777e42db1ea \
"

GOSRC_INCLUDEGUARD += "github.com-mozilla-scribe-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-lib-pq-sources.inc', '', 'github.com-lib-pq-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v2-sources.inc', '', 'gopkg.in-yaml.v2-sources.inc', d)}
