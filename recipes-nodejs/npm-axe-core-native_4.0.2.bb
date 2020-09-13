SUMMARY = "NPM: axe-core"
DESCRIPTION = "Accessibility engine for automated Web UI testing"
HOMEPAGE = "https://www.deque.com/axe/"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f27a50d2e878867827842f2c60e30bfc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/axe-core/-/axe-core-4.0.2.tgz"
SRC_URI[md5sum] = "7b2aead89e5145634dd00a206e6a0419"
SRC_URI[sha256sum] = "bed4b0c4e00a2404a4dacc4a7ada21a619c1bebf56b29f322d04decd5520bc34"

NPM_PKGNAME = "axe-core"

inherit npmhelper
inherit native
