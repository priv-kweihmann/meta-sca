## Include arch depending sources
require ${@'shellcheck-native_arch_%s.inc' % d.getVar('BUILD_ARCH')}

include shellcheck-native_helper.inc

LIC_FILES_CHKSUM = "file://${S}/usr/share/doc/shellcheck/copyright;md5=4225f5a4cb918d258dc26493d45922ef"

include shellcheck-native.inc