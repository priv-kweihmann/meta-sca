SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-4.5.5.tgz"
SRC_URI[md5sum] = "94edccf47834f30bb370c79d061b13e8"
SRC_URI[sha256sum] = "9ec479672e48d9f4b72c1a1dcdb5af063ece7c274f3a932d96b9acc60d100fe8"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
