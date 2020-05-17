SUMMARY = "NPM: lodash._createassigner"
DESCRIPTION = "The modern build of lodash’s internal `createAssigner` as a module."
HOMEPAGE = "https://lodash.com/"

DEPENDS = "npm-lodash.bindcallback-native npm-lodash.isiterateecall-native npm-lodash.restparam-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f519f8cb155e30cece6b0e75aa6a3a53"

SRC_URI = "https://registry.npmjs.org/lodash._createassigner/-/lodash._createassigner-3.1.1.tgz"
SRC_URI[md5sum] = "c98889cbb64023de4c169980511446b2"
SRC_URI[sha256sum] = "a0aee59fd72b141a9b3660b31373bbf3ba7b5b9bc662af5875ace74ce99c5225"

NPM_PKGNAME = "lodash._createassigner"

inherit npmhelper
inherit native
