SUMMARY = "NPM: object.hasown"
DESCRIPTION = "ES spec-compliant shim for Object.hasOwn"
HOMEPAGE = "https://github.com/es-shims/Object.hasOwn"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c7ba3c323e19b530833ba2c08ca8dc54"

DEPENDS = "npm-define-properties-native \
           npm-es-abstract-native"

SRC_URI = "https://registry.npmjs.org/object.hasown/-/object.hasown-1.0.0.tgz"
SRC_URI[md5sum] = "c8fbb064c6a98e9ca68fb4f0531fb479"
SRC_URI[sha256sum] = "a990717b9d7904afca0ecdf7d8fea908461c007949c582cd6dffde4e2a73502d"

NPM_PKGNAME = "object.hasown"

inherit npmhelper
inherit native
