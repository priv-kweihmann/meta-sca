SUMMARY = "NPM: axe-core"
DESCRIPTION = "Accessibility engine for automated Web UI testing"
HOMEPAGE = "https://www.deque.com/axe/"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f27a50d2e878867827842f2c60e30bfc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/axe-core/-/axe-core-4.3.1.tgz"
SRC_URI[md5sum] = "f6bbe02445c7f0e778f4a36650ea26b8"
SRC_URI[sha256sum] = "c5c216cdbf3ba0d0fa9325e87dd9f181e658a74a0dafbe222ea58ee49ffa537d"

NPM_PKGNAME = "axe-core"

inherit npmhelper
inherit native
