SRC_URI += "https://proxy.golang.org/github.com/oklog/oklog/@v/v0.3.2.zip;srcoutput=github.com/oklog/oklog;srcinput=github.com/oklog/oklog@v0.3.2;downloadfilename=github-com-oklog-oklog-0.3.2.zip;name=github-com-oklog-oklog"
SRC_URI[github-com-oklog-oklog.sha256sum] = "b37d032de5b0dd5e96063c06b77fcb29a692a07bd52a4d99a361f2fef68822ec"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/oklog/oklog/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
"

GOSRC_INCLUDEGUARD += "github.com-oklog-oklog-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-djherbis-buffer-sources.inc', '', 'github.com-djherbis-buffer-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-djherbis-nio-sources.inc', '', 'github.com-djherbis-nio-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-kit-kit-sources.inc', '', 'github.com-go-kit-kit-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-google-btree-sources.inc', '', 'github.com-google-btree-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-go-sockaddr-sources.inc', '', 'github.com-hashicorp-go-sockaddr-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-hashicorp-memberlist-sources.inc', '', 'github.com-hashicorp-memberlist-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-oklog-run-sources.inc', '', 'github.com-oklog-run-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-oklog-ulid-sources.inc', '', 'github.com-oklog-ulid-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pborman-uuid-sources.inc', '', 'github.com-pborman-uuid-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-pkg-errors-sources.inc', '', 'github.com-pkg-errors-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-prometheus-client-golang-sources.inc', '', 'github.com-prometheus-client-golang-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-rs-cors-sources.inc', '', 'github.com-rs-cors-sources.inc', d)}
