SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-4.6.2.tgz"
SRC_URI[md5sum] = "86d05aadbb96caf19791cd2bef258ec5"
SRC_URI[sha256sum] = "30afe4c71ff164ba41560e0770e0f8c48f9c03959cbcdcc7c410ab052bf2f6d6"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
