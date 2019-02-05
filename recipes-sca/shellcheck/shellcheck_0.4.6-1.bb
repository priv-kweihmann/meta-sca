PV = "0.4.6-1"

## Include arch depending sources
include ${@'shellcheck_arch_%s.inc' % d.getVar('BUILD_ARCH')}

include shellcheck_helper.inc

LIC_FILES_CHKSUM = "file://${S}/usr/share/doc/shellcheck/copyright;md5=78ee6317e57db6d0b07c94fc5e0b51d1"

include shellcheck.inc