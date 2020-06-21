SUMMARY = "NPM: axe-core"
DESCRIPTION = "Accessibility engine for automated Web UI testing"
HOMEPAGE = "https://www.deque.com/axe/"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f27a50d2e878867827842f2c60e30bfc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/axe-core/-/axe-core-3.5.5.tgz"
SRC_URI[md5sum] = "42f90307c64e698068427f6b61e657fa"
SRC_URI[sha256sum] = "a234dd13c16c2312401f35f2ede9bd2240bf45d0a0543e481b88d295c35ca9a6"

NPM_PKGNAME = "axe-core"

inherit npmhelper
inherit native
