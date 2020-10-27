SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-4.0.5.tgz"
SRC_URI[md5sum] = "0f2d693052d1af3e00f6a703186aae85"
SRC_URI[sha256sum] = "52bbbcc4f16cd5ea797d30b9daaf0650ee6d7b024189d00b2e193142cd79d00e"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
