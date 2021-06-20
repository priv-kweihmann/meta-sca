SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-4.3.4.tgz"
SRC_URI[md5sum] = "e1b17c7a0939dedf831da937d9a035f7"
SRC_URI[sha256sum] = "124624965249ca4788a1852d10c3001a428952551a7a9d7ebe9c1b6243ab4f11"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
