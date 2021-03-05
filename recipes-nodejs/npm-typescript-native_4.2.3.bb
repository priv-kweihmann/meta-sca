SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-4.2.3.tgz"
SRC_URI[md5sum] = "675786df5d207f522fd52c788bffe05c"
SRC_URI[sha256sum] = "cf58ef57a8b173fad9f81969d3995299e40c770a02805117520b4c75d43ff14a"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
