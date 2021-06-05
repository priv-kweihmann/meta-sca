SUMMARY = "NPM: axe-core"
DESCRIPTION = "Accessibility engine for automated Web UI testing"
HOMEPAGE = "https://www.deque.com/axe/"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f27a50d2e878867827842f2c60e30bfc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/axe-core/-/axe-core-4.2.2.tgz"
SRC_URI[md5sum] = "c2ebe160a06292a88b0081905071da64"
SRC_URI[sha256sum] = "ed35acad60ec813fa516c807faa6fdd73f40f924faae165c68275f34b0a2a016"

NPM_PKGNAME = "axe-core"

inherit npmhelper
inherit native
