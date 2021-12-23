SUMMARY = "NPM: es-to-primitive"
DESCRIPTION = "ECMAScript “ToPrimitive” algorithm. Provides ES5 and ES2015 versions."
HOMEPAGE = "https://github.com/ljharb/es-to-primitive#readme"

DEPENDS = "npm-is-callable-native npm-is-date-object-native npm-is-symbol-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

SRC_URI = "https://registry.npmjs.org/es-to-primitive/-/es-to-primitive-1.2.1.tgz"
SRC_URI[md5sum] = "a32f26c478b76efa377601b8d17268a9"
SRC_URI[sha256sum] = "f30558271d77e69fffa5eea8b4d990fff7cfa9d33e1168d0e28982179e698bea"

NPM_PKGNAME = "es-to-primitive"

inherit npmhelper
inherit native
