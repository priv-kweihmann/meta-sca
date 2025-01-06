SRC_URI += "https://proxy.golang.org/golang.org/x/telemetry/@v/v0.0.0-20250105011419-6d9ea865d014.zip;srcoutput=golang.org/x/telemetry;srcinput=golang.org/x/telemetry@v0.0.0-20250105011419-6d9ea865d014;downloadfilename=golang-org-x-telemetry-0.0.0-20250105011419-6d9ea865d014.zip;name=golang-org-x-telemetry"
SRC_URI[golang-org-x-telemetry.sha256sum] = "a32ec2f2a7cd3b893f2afd013b30419c62b43c28f46fa124a3b37edd70abf55c"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://golang.org/x/telemetry/LICENSE;md5=7998cb338f82d15c0eff93b7004d272a \
"

GOSRC_INCLUDEGUARD += "golang.org-x-telemetry-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-mod-sources.inc', '', 'golang.org-x-mod-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sync-sources.inc', '', 'golang.org-x-sync-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-sys-sources.inc', '', 'golang.org-x-sys-sources.inc', d)}
