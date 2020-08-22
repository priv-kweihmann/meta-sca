SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-4.0.2.tgz"
SRC_URI[md5sum] = "01a7b08d79f3674591f65ffa6bfd9b29"
SRC_URI[sha256sum] = "756653c513e3635f4fafdae383f81eda44a0ff5466da028881a7ba1fdd19afeb"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
