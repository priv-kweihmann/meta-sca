SUMMARY = "NPM: is-weakmap"
DESCRIPTION = "Is this value a JS WeakMap? This module works cross-realm/iframe, and despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/inspect-js/is-weakmap#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c18cc44449ec61c93b216bf74e6c4fa4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-weakmap/-/is-weakmap-2.0.1.tgz"
SRC_URI[md5sum] = "98447d093322dcfd081300f73776044e"
SRC_URI[sha256sum] = "6d5f57651562964642415f1e588ddbfad57a2e75c9bf0b5d505ac08ac18a0f19"

NPM_PKGNAME = "is-weakmap"

inherit npmhelper
inherit native
