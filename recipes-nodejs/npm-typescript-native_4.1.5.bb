SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-4.1.5.tgz"
SRC_URI[md5sum] = "9d3f053c1921b45dbf73ce7d7a94d99c"
SRC_URI[sha256sum] = "b39221f974d2d2f7c770ba66323ce4b12152813fa31b86e20602580d64e7dbb4"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
