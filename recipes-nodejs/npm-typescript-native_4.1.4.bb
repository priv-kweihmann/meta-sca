SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-4.1.4.tgz"
SRC_URI[md5sum] = "6afa53406e9b067d1d547f905549897f"
SRC_URI[sha256sum] = "dba5c640a6fd0d5418d26ebf9f61a95ca50a78587f5d4603af3fbd49ea891901"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
