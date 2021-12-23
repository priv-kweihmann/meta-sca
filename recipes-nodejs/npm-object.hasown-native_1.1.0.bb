SUMMARY = "NPM: object.hasown"
DESCRIPTION = "ES spec-compliant shim for Object.hasOwn"
HOMEPAGE = "https://github.com/es-shims/Object.hasOwn"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c7ba3c323e19b530833ba2c08ca8dc54"

DEPENDS = "npm-define-properties-native \
           npm-es-abstract-native"

SRC_URI = "https://registry.npmjs.org/object.hasown/-/object.hasown-1.1.0.tgz"
SRC_URI[md5sum] = "af5597648f65b588718909b252d80d31"
SRC_URI[sha256sum] = "b2766ad95b84f8ba7f2439a9eb0ea62f33a5c46374dc99a29e17acac4a1b19ef"

NPM_PKGNAME = "object.hasown"

inherit npmhelper
inherit native
