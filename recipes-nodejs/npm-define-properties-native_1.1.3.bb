SUMMARY = "NPM: define-properties"
DESCRIPTION = "Define multiple non-enumerable properties at once. Uses `Object.defineProperty` when available; falls back to standard assignment in older engines."
HOMEPAGE = "https://github.com/ljharb/define-properties#readme"

DEPENDS = "npm-object-keys-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=53ffc646fdb83e45279cfe7105e5157b"

SRC_URI = "https://registry.npmjs.org/define-properties/-/define-properties-1.1.3.tgz"
SRC_URI[md5sum] = "d06819a7b947f1b335da2f41519994ac"
SRC_URI[sha256sum] = "5524f4db15bb95af92c791ba208e2fc774bd8ae17eb347865492d444f95a70a5"

NPM_PKGNAME = "define-properties"

inherit npmhelper
inherit native
