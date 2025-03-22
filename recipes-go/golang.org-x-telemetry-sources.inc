SRC_URI += "https://proxy.golang.org/golang.org/x/telemetry/@v/v0.0.0-20250310203348-fdfaad844314.zip;srcoutput=golang.org/x/telemetry;srcinput=golang.org/x/telemetry@v0.0.0-20250310203348-fdfaad844314;downloadfilename=golang-org-x-telemetry-0.0.0-20250310203348-fdfaad844314.zip;name=golang-org-x-telemetry"
SRC_URI[golang-org-x-telemetry.sha256sum] = "fa43bffeaa06473abdb55fdbcd275adfff574772496e4c8b45c1850d5aed482a"

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
