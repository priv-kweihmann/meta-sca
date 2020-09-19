SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-4.0.3.tgz"
SRC_URI[md5sum] = "03ba763c28c9b013a5f340b102cb7dc7"
SRC_URI[sha256sum] = "84457b86a8bc4be5421e4d8212367aa1a6afa744af2324ba9c33f76b46bdeac4"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
