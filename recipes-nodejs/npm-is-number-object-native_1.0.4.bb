SUMMARY = "NPM: is-number-object"
DESCRIPTION = "Is this value a JS Number object? This module works cross-realm/iframe, and despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/inspect-js/is-number-object#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-number-object/-/is-number-object-1.0.4.tgz"
SRC_URI[md5sum] = "53ef2557470cf4d6822008dd81a23b86"
SRC_URI[sha256sum] = "24cc5522f1806797b12464b160d591390d2729e0c8aed4af5fca6910556796ec"

NPM_PKGNAME = "is-number-object"

inherit npmhelper
inherit native
