SUMMARY = "NPM: is-boolean-object"
DESCRIPTION = "Is this value a JS Boolean? This module works cross-realm/iframe, and despite ES6 @@toStringTag."
HOMEPAGE = "https://github.com/ljharb/is-boolean-object#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-call-bind-native"

SRC_URI = "https://registry.npmjs.org/is-boolean-object/-/is-boolean-object-1.1.0.tgz"
SRC_URI[md5sum] = "437cd924c1b81c6cd17b3561f8983345"
SRC_URI[sha256sum] = "9a50e05b60c9d813f1b784a2027453fcf88c6bf14285c9ccfc29c918ea66cfa8"

NPM_PKGNAME = "is-boolean-object"

inherit npmhelper
inherit native
