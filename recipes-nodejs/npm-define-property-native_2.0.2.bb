SUMMARY = "NPM: define-property"
DESCRIPTION = "Define a non-enumerable property on an object. Uses Reflect.defineProperty when available, otherwise Object.defineProperty."
HOMEPAGE = "https://github.com/jonschlinkert/define-property"

DEPENDS = "npm-is-descriptor-native npm-isobject-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5fb5a7fdbcfa3640822ec69bd3ee86e7"

SRC_URI = "https://registry.npmjs.org/define-property/-/define-property-2.0.2.tgz"
SRC_URI[md5sum] = "2751868d9fa31ebbbe851fdcb729115d"
SRC_URI[sha256sum] = "0ade8d2e984ecfcdbaafc3eb236fc61d5ea71e49580676cee1a399e37d1d1d55"

NPM_PKGNAME = "define-property"

inherit npmhelper
inherit native
