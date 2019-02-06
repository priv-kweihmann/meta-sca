PV = "0.5.0-3"

## Include arch depending sources
include ${@'shellcheck_arch_%s.inc' % d.getVar('BUILD_ARCH')}

include shellcheck_helper.inc

LIC_FILES_CHKSUM = "file://${S}/usr/share/doc/shellcheck/copyright;md5=4225f5a4cb918d258dc26493d45922ef"

include shellcheck.inc