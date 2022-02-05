SUMMARY = "NPM: axe-core"
DESCRIPTION = "Accessibility engine for automated Web UI testing"
HOMEPAGE = "https://www.deque.com/axe/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f27a50d2e878867827842f2c60e30bfc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/axe-core/-/axe-core-4.4.1.tgz"
SRC_URI[md5sum] = "cd9733506cd209129ba1e9c46b32c75a"
SRC_URI[sha256sum] = "e273eef45a7ccbd5fa63cc0557ddfc1955db8926b13f875d6013dee317c91773"

NPM_PKGNAME = "axe-core"

inherit npmhelper
inherit native
