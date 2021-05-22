SUMMARY = "NPM: axe-core"
DESCRIPTION = "Accessibility engine for automated Web UI testing"
HOMEPAGE = "https://www.deque.com/axe/"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f27a50d2e878867827842f2c60e30bfc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/axe-core/-/axe-core-4.2.1.tgz"
SRC_URI[md5sum] = "7d6af2e2616c496e2cc0d2794ef46a51"
SRC_URI[sha256sum] = "ed4dd8e93938db9e56755fcd5c50dd3a4133d5f0da39fac15e706066897cb586"

NPM_PKGNAME = "axe-core"

inherit npmhelper
inherit native
