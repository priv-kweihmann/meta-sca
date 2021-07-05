SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-4.3.5.tgz"
SRC_URI[md5sum] = "a02a06d1b30878a2be01b6bb1e23da67"
SRC_URI[sha256sum] = "c7be550da858be7abfc73dd0b9060ab23ce835ae3b05931f4500a25c09766d45"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
