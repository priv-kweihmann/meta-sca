SUMMARY = "NPM: is-map"
DESCRIPTION = "Is this value a JS Map? This module works cross-realm/iframe, and despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/inspect-js/is-map#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c18cc44449ec61c93b216bf74e6c4fa4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-map/-/is-map-2.0.1.tgz"
SRC_URI[md5sum] = "0438029537ca40d12c3cefac52afa2ee"
SRC_URI[sha256sum] = "b848a2036a11842706e0031a626c743305f0964915dc88d459c1f3d3fd5eec52"

NPM_PKGNAME = "is-map"

inherit npmhelper
inherit native
