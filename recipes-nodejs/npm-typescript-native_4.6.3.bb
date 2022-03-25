SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-4.6.3.tgz"
SRC_URI[md5sum] = "3199fec0d97f67b01f45fc227adf87e8"
SRC_URI[sha256sum] = "70d5d30a8ee92004e529c41fc05d5c7993f7a4ddea33b4c0909896936230964d"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
