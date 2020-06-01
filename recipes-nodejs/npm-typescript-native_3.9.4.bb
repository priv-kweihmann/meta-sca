SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-3.9.4.tgz"
SRC_URI[md5sum] = "a9775e268d52748fdc322534d02917c3"
SRC_URI[sha256sum] = "282a62295cf6b386bbaf6959d63b51a6789ed46e90d2acac2dad62db83d3cecd"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
