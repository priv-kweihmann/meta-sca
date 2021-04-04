SRC_URI += "https://proxy.golang.org/github.com/apache/beam/@v/v2.28.0+incompatible.zip;srcoutput=github.com/apache/beam;srcinput=github.com/apache/beam@v2.28.0+incompatible;downloadfilename=github-com-apache-beam-2.28.0+incompatible.zip;name=github-com-apache-beam"
SRC_URI[github-com-apache-beam.sha256sum] = "6a83c6020fa7777e90fdae710b10f3e35e2e32923a38f4bab5bf63aefa07ce5f"
GOSRC_REMOVEDIRS += "github.com/apache/beam/sdks/go/test/integration/xlang"

GOSRC_LICENSE += "\
    Apache-2.0 \
    BSD-3-Clause \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/apache/beam/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
    file://src/github.com/apache/beam/release/go-licenses/get-licenses.sh;md5=8a86b59d6600aace15fd7623ff86af8e \
    file://src/github.com/apache/beam/runners/google-cloud-dataflow-java/worker/src/main/resources/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://src/github.com/apache/beam/sdks/java/container/license_scripts/license_script.sh;md5=f183884aeaa2d93459f423d57cdefe9a \
    file://src/github.com/apache/beam/sdks/python/container/license_scripts/manual_licenses/enum34/LICENSE;md5=0a97a53a514564c20efd7b2e8976c87e \
    file://src/github.com/apache/beam/sdks/python/container/license_scripts/manual_licenses/singledispatch/LICENSE;md5=5e6896d8cfba370e833d8166c7618ded \
    file://src/github.com/apache/beam/sdks/python/container/license_scripts/manual_licenses/termcolor/LICENSE;md5=e66f46c675aae457f994a829c35dd86c \
    file://src/github.com/apache/beam/website/notebooks/imports/license.md;md5=2227d660dc4b948d0101068dda5b2418 \
"

GOSRC_INCLUDEGUARD += "github.com-apache-beam-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-bigquery-sources.inc', '', 'cloud.google.com-go-bigquery-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-datastore-sources.inc', '', 'cloud.google.com-go-datastore-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-pubsub-sources.inc', '', 'cloud.google.com-go-pubsub-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'cloud.google.com-go-storage-sources.inc', '', 'cloud.google.com-go-storage-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-go-cmp-sources.inc', '', 'github.com-google-go-cmp-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-linkedin-goavro-sources.inc', '', 'github.com-linkedin-goavro-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-nightlyone-lockfile-sources.inc', '', 'github.com-nightlyone-lockfile-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-spf13-cobra-sources.inc', '', 'github.com-spf13-cobra-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-oauth2-sources.inc', '', 'golang.org-x-oauth2-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-text-sources.inc', '', 'golang.org-x-text-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-api-sources.inc', '', 'google.golang.org-api-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-genproto-sources.inc', '', 'google.golang.org-genproto-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-grpc-sources.inc', '', 'google.golang.org-grpc-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'google.golang.org-protobuf-sources.inc', '', 'google.golang.org-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v2-sources.inc', '', 'gopkg.in-yaml.v2-sources.inc', d)}
