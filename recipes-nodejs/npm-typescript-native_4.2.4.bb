SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-4.2.4.tgz"
SRC_URI[md5sum] = "b2bc84d3b5dda602a5c171c53fc03998"
SRC_URI[sha256sum] = "6eed9794296d93c83074e022652ac680314e0cf37b969945e9f0da4e47332901"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
