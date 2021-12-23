SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-4.5.4.tgz"
SRC_URI[md5sum] = "37c763c3ff939ea3b6a9892397df628b"
SRC_URI[sha256sum] = "5b2b014c4d6f9ad4615d7ced8cc32f882a4a96df8213722577b42277afb03cba"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
