SUMMARY = "NPM: is-core-module"
DESCRIPTION = "Is this specifier a node.js core module?"
HOMEPAGE = "https://github.com/inspect-js/is-core-module"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=02b0fb5ff4014a08fd4193bc3e2349e2"

DEPENDS = "npm-has-native"

SRC_URI = "https://registry.npmjs.org/is-core-module/-/is-core-module-2.4.0.tgz"
SRC_URI[md5sum] = "230a47f6467cf05722f73d5073ab0610"
SRC_URI[sha256sum] = "cdb309300e5897b1db36f8e609a15dc8a35ce909965350a1021ca0bde05e8f0c"

NPM_PKGNAME = "is-core-module"

inherit npmhelper
inherit native
