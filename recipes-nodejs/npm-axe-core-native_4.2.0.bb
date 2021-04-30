SUMMARY = "NPM: axe-core"
DESCRIPTION = "Accessibility engine for automated Web UI testing"
HOMEPAGE = "https://www.deque.com/axe/"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f27a50d2e878867827842f2c60e30bfc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/axe-core/-/axe-core-4.2.0.tgz"
SRC_URI[md5sum] = "f3373384f2aed42aa01849678985946d"
SRC_URI[sha256sum] = "a0dece03b152771c5165cea7c4581968d72f352bb6a57582f40399fe8274ee21"

NPM_PKGNAME = "axe-core"

inherit npmhelper
inherit native
