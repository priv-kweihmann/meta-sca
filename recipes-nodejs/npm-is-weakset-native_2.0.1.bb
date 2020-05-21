SUMMARY = "NPM: is-weakset"
DESCRIPTION = "Is this value a JS WeakSet? This module works cross-realm/iframe, and despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/inspect-js/is-weakset#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c18cc44449ec61c93b216bf74e6c4fa4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-weakset/-/is-weakset-2.0.1.tgz"
SRC_URI[md5sum] = "18d142c399d029c2a5ccfe3aae40ccdb"
SRC_URI[sha256sum] = "1d83033e3bb125dc6d8186cabae9f4f783e2290e0a12b80d15fd19aa0887f24a"

NPM_PKGNAME = "is-weakset"

inherit npmhelper
inherit native
