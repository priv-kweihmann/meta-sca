SUMMARY = "NPM: object-is"
DESCRIPTION = "ES2015-compliant shim for Object.is - differentiates between -0 and +0"
HOMEPAGE = "https://github.com/es-shims/object-is"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5"

DEPENDS = "npm-define-properties-native \
           npm-es-abstract-native"

SRC_URI = "https://registry.npmjs.org/object-is/-/object-is-1.1.3.tgz"
SRC_URI[md5sum] = "84dd59c869dbfdd6ba2f2970024621a5"
SRC_URI[sha256sum] = "1a41e26f21fbe32880e93cd35741b08a13301530c9c61834991e3ce4ca84b022"

NPM_PKGNAME = "object-is"

inherit npmhelper
inherit native
