SUMMARY = "NPM: axe-core"
DESCRIPTION = "Accessibility engine for automated Web UI testing"
HOMEPAGE = "https://www.deque.com/axe/"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f27a50d2e878867827842f2c60e30bfc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/axe-core/-/axe-core-4.1.4.tgz"
SRC_URI[md5sum] = "53c93f4ef542e6125ac55fef9d1ca45e"
SRC_URI[sha256sum] = "0ec0a18f4003bcc528e03e595ae5ad4c32d0223571a3e4bd50329ada243e588f"

NPM_PKGNAME = "axe-core"

inherit npmhelper
inherit native
