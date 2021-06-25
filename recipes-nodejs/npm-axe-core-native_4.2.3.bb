SUMMARY = "NPM: axe-core"
DESCRIPTION = "Accessibility engine for automated Web UI testing"
HOMEPAGE = "https://www.deque.com/axe/"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f27a50d2e878867827842f2c60e30bfc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/axe-core/-/axe-core-4.2.3.tgz"
SRC_URI[md5sum] = "00a46b55bf869fa1df17aaa47a56365f"
SRC_URI[sha256sum] = "51871c94963e62e083c6a6fdba51c1b47369edbef50bb180077010ee38f6ce03"

NPM_PKGNAME = "axe-core"

inherit npmhelper
inherit native
