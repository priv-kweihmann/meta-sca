SUMMARY = "NPM: define-properties"
DESCRIPTION = "Define multiple non-enumerable properties at once. Uses `Object.defineProperty` when available; falls back to standard assignment in older engines."
HOMEPAGE = "https://github.com/ljharb/define-properties#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=53ffc646fdb83e45279cfe7105e5157b"

DEPENDS = "npm-has-property-descriptors-native \
           npm-object-keys-native"

SRC_URI = "https://registry.npmjs.org/define-properties/-/define-properties-1.1.4.tgz"
SRC_URI[md5sum] = "d2ec48d9ec2ffc96c1cade78993d2fc4"
SRC_URI[sha256sum] = "db524cc69a1fb36e417553bcf82df6511685c6b94d4b82eae99759589a686948"

NPM_PKGNAME = "define-properties"

inherit npmhelper
inherit native
