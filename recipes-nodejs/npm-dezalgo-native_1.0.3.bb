SUMMARY = "NPM: dezalgo"
DESCRIPTION = "Contain async insanity so that the dark pony lord doesn't eat souls"
HOMEPAGE = "https://github.com/npm/dezalgo"

DEPENDS = "npm-asap-native npm-wrappy-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

SRC_URI = "https://registry.npmjs.org/dezalgo/-/dezalgo-1.0.3.tgz"
SRC_URI[md5sum] = "7cd9ce11cea278e44f66650cd8bf634a"
SRC_URI[sha256sum] = "3d4328ea5d4c543c1a7b166b35b028d66323f5a19308376eebcf0d4ef059d4b1"

NPM_PKGNAME = "dezalgo"

inherit npmhelper
inherit native
