SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-3.9.6.tgz"
SRC_URI[md5sum] = "cbd4e2d5e0ddc6c85b3851dfce42cf9c"
SRC_URI[sha256sum] = "8ff4c1a65f9dd4f5293f47089b199a9f8a51600e1986ba86cf6b89a1092ff798"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
