SUMMARY = "NPM: axe-core"
DESCRIPTION = "Accessibility engine for automated Web UI testing"
HOMEPAGE = "https://www.deque.com/axe/"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f27a50d2e878867827842f2c60e30bfc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/axe-core/-/axe-core-4.3.3.tgz"
SRC_URI[md5sum] = "1653d30b235bfac4802cf817351d450f"
SRC_URI[sha256sum] = "c87391dcdf49275b279fc554328820e720355beb1e5ac51c7e2aab5949b96bff"

NPM_PKGNAME = "axe-core"

inherit npmhelper
inherit native
