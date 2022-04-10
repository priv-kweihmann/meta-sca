SUMMARY = "NPM: dezalgo"
DESCRIPTION = "Contain async insanity so that the dark pony lord doesn't eat souls"
HOMEPAGE = "https://github.com/npm/dezalgo"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

DEPENDS = "npm-asap-native \
           npm-wrappy-native"

SRC_URI = "https://registry.npmjs.org/dezalgo/-/dezalgo-1.0.4.tgz"
SRC_URI[md5sum] = "993fd4f9b58f76216b86b87ef11e8286"
SRC_URI[sha256sum] = "09888c549179c39c600b064502cc043e0178abfd6d7e5b087ef2d2d028d1baa6"

NPM_PKGNAME = "dezalgo"

inherit npmhelper
inherit native
