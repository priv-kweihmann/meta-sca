SUMMARY = "NPM: axe-core"
DESCRIPTION = "Accessibility engine for automated Web UI testing"
HOMEPAGE = "https://www.deque.com/axe/"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f27a50d2e878867827842f2c60e30bfc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/axe-core/-/axe-core-4.1.0.tgz"
SRC_URI[md5sum] = "7ba0eef0b9a3861d0dd8060b67215f1c"
SRC_URI[sha256sum] = "ac17042c1568377d7d4498746fe34317851eca290a2755820f6b1a5388d93034"

NPM_PKGNAME = "axe-core"

inherit npmhelper
inherit native
