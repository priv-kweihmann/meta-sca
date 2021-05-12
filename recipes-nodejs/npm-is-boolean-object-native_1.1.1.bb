SUMMARY = "NPM: is-boolean-object"
DESCRIPTION = "Is this value a JS Boolean? This module works cross-realm/iframe, and despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/inspect-js/is-boolean-object#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-call-bind-native"

SRC_URI = "https://registry.npmjs.org/is-boolean-object/-/is-boolean-object-1.1.1.tgz"
SRC_URI[md5sum] = "ff411bba7615c797e21c7fda62ccfb69"
SRC_URI[sha256sum] = "d22f197a1a9798fb3c2d117e79fe3ab04cf8354429332421f98e888ec5122d6d"

NPM_PKGNAME = "is-boolean-object"

inherit npmhelper
inherit native
