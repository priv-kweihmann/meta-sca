SUMMARY = "NPM: object.values"
DESCRIPTION = "ES2017 spec-compliant Object.values shim."
HOMEPAGE = "https://github.com/es-shims/Object.values#readme"

DEPENDS = "npm-define-properties-native npm-es-abstract-native npm-function-bind-native npm-has-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

SRC_URI = "https://registry.npmjs.org/object.values/-/object.values-1.1.1.tgz"
SRC_URI[md5sum] = "4cf7f574f295aa5077332b7d5aa4a5c2"
SRC_URI[sha256sum] = "efa81a02e39435fdfe024dbc040d9743511f961be3491ac2ab9c79418153abc7"

NPM_PKGNAME = "object.values"

inherit npmhelper
inherit native
