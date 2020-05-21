SUMMARY = "NPM: is-set"
DESCRIPTION = "Is this value a JS Set? This module works cross-realm/iframe, and despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/inspect-js/is-set#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c18cc44449ec61c93b216bf74e6c4fa4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-set/-/is-set-2.0.1.tgz"
SRC_URI[md5sum] = "bbf305a2473f0e1e006ceabbed0330b6"
SRC_URI[sha256sum] = "55db1ba0764d73c5e6e29e59bed6a35c307c6a47d2939a9b296e3c2e1b221c1c"

NPM_PKGNAME = "is-set"

inherit npmhelper
inherit native
