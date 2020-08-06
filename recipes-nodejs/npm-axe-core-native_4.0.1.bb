SUMMARY = "NPM: axe-core"
DESCRIPTION = "Accessibility engine for automated Web UI testing"
HOMEPAGE = "https://www.deque.com/axe/"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f27a50d2e878867827842f2c60e30bfc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/axe-core/-/axe-core-4.0.1.tgz"
SRC_URI[md5sum] = "d38e0dbca5f5991dc1d155d0c90e40e8"
SRC_URI[sha256sum] = "14eed01265217913ad1fbbaa64efd1d965ba820f334d4938d08bc428a1c9999b"

NPM_PKGNAME = "axe-core"

inherit npmhelper
inherit native
