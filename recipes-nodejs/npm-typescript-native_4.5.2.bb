SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"

DEFAULT_PREFERENCE = "-1"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-4.5.2.tgz"
SRC_URI[md5sum] = "39b88d916ff86fe9267d42da2a35c903"
SRC_URI[sha256sum] = "2368e53db3b877d2f9bc29812b10e91f6af3f0c078cc5204add9778cb521405e"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
