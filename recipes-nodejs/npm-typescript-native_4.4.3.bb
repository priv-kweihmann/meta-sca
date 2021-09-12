SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-4.4.3.tgz"
SRC_URI[md5sum] = "610db0c7d47ba6cf715bbdb6f919dbc5"
SRC_URI[sha256sum] = "aea423e9f38bab0b12a3598eed07cae111eb6663dc29987e0b47389b42f3c017"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
