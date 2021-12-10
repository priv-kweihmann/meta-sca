SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"
DEFAULT_PREFERENCE = "-1"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-4.5.3.tgz"
SRC_URI[md5sum] = "c1e3b7cc524486cd50f2de5f9bcaec80"
SRC_URI[sha256sum] = "d8f6a9ddafac40e982bab89cd98b01ed4df0eb514f5e9670d10454c7aa65b92f"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
