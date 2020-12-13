SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-4.1.3.tgz"
SRC_URI[md5sum] = "e5b857f13ec4c60897656721c32558ce"
SRC_URI[sha256sum] = "213b2677e1f29700601c29e4a603eabe63f87f14fa02fd3633bf141aaa4e0e7e"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
