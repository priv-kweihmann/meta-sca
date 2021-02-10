SUMMARY = "NPM: axe-core"
DESCRIPTION = "Accessibility engine for automated Web UI testing"
HOMEPAGE = "https://www.deque.com/axe/"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f27a50d2e878867827842f2c60e30bfc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/axe-core/-/axe-core-4.1.2.tgz"
SRC_URI[md5sum] = "d7da04ae25c6ef9af800f609016589c6"
SRC_URI[sha256sum] = "345328d43ab6383b7dba1f18c47c667d67ed2828579528458298cce25c57d855"

NPM_PKGNAME = "axe-core"

inherit npmhelper
inherit native
