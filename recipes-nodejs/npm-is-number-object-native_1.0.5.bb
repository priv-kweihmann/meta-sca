SUMMARY = "NPM: is-number-object"
DESCRIPTION = "Is this value a JS Number object? This module works cross-realm/iframe, and despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/inspect-js/is-number-object#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-number-object/-/is-number-object-1.0.5.tgz"
SRC_URI[md5sum] = "5ea0802facbe214263f821f7ef9ba53c"
SRC_URI[sha256sum] = "d2d64d64cd18b09512d3a86e530d2f1ce091287bd595b1514ac2c15415205ecd"

NPM_PKGNAME = "is-number-object"

inherit npmhelper
inherit native
