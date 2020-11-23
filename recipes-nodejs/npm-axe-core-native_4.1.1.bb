SUMMARY = "NPM: axe-core"
DESCRIPTION = "Accessibility engine for automated Web UI testing"
HOMEPAGE = "https://www.deque.com/axe/"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f27a50d2e878867827842f2c60e30bfc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/axe-core/-/axe-core-4.1.1.tgz"
SRC_URI[md5sum] = "688ca7a73098cbdefc65a9351ea6d156"
SRC_URI[sha256sum] = "9923c0e0abe128594c19448972cee1d56eea1c336d42e8a52a9d3194e029a278"

NPM_PKGNAME = "axe-core"

inherit npmhelper
inherit native
