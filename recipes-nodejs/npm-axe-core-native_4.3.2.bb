SUMMARY = "NPM: axe-core"
DESCRIPTION = "Accessibility engine for automated Web UI testing"
HOMEPAGE = "https://www.deque.com/axe/"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f27a50d2e878867827842f2c60e30bfc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/axe-core/-/axe-core-4.3.2.tgz"
SRC_URI[md5sum] = "4195b41431289216f6cac5032a510234"
SRC_URI[sha256sum] = "8672623d79267ce74851fb393b6cf13111caabe6c62679cf1b05e0c5be4f5065"

NPM_PKGNAME = "axe-core"

inherit npmhelper
inherit native
