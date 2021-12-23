SUMMARY = "NPM: object.entries"
DESCRIPTION = "ES2017 spec-compliant Object.entries shim."
HOMEPAGE = "https://github.com/es-shims/Object.entries#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native"

SRC_URI = "https://registry.npmjs.org/object.entries/-/object.entries-1.1.5.tgz"
SRC_URI[md5sum] = "ad5e86ca2cd622476e643238ab674f5c"
SRC_URI[sha256sum] = "db5e05175c2df4ba265fc46129eda77cd8650a6165c2f4ad1fb564f9fa679422"

NPM_PKGNAME = "object.entries"

inherit npmhelper
inherit native
