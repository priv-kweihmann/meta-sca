SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-4.4.4.tgz"
SRC_URI[md5sum] = "146927170caf27794e60d8014ed662dc"
SRC_URI[sha256sum] = "7524841bbf63777fef1fe6e1a826026b1dd4849f54f5affa481502faab2cdb16"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
