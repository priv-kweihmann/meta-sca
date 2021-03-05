SUMMARY = "NPM: axe-core"
DESCRIPTION = "Accessibility engine for automated Web UI testing"
HOMEPAGE = "https://www.deque.com/axe/"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f27a50d2e878867827842f2c60e30bfc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/axe-core/-/axe-core-4.1.3.tgz"
SRC_URI[md5sum] = "c72a602d1dd6dcd69610bc7af3b75fef"
SRC_URI[sha256sum] = "19d4ad27d10899e08b7030b7e5e0aa40d4ac67c9504fb9e8f65651c791356752"

NPM_PKGNAME = "axe-core"

inherit npmhelper
inherit native
