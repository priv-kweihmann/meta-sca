SUMMARY = "NPM: string.prototype.trimright"
DESCRIPTION = "ES2019 spec-compliant String.prototype.trimLeft shim."
HOMEPAGE = "https://github.com/es-shims/String.prototype.trimRight#readme"

# To avoid dep loop remove npm-es-abstract-native
DEPENDS = "npm-define-properties-native npm-string.prototype.trimend-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

SRC_URI = "https://registry.npmjs.org/string.prototype.trimright/-/string.prototype.trimright-2.1.2.tgz"
SRC_URI[md5sum] = "d0c190dad1174ab23a34fc624aedd3a7"
SRC_URI[sha256sum] = "1790f97f35c663efed82e45161d454dec776a76146b32ff73e5facb2bdcd8d4b"

NPM_PKGNAME = "string.prototype.trimright"

inherit npmhelper
inherit native
