SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-3.9.5.tgz"
SRC_URI[md5sum] = "2c70c744fafefac6ad45e78b39934f45"
SRC_URI[sha256sum] = "7d542965aac5ce66a20866b1e1d71f75960efe6c18cb6209a0d2959e34ebe371"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
