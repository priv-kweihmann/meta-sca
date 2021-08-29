SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-4.4.2.tgz"
SRC_URI[md5sum] = "f385a7d140c583008786cb4553dc9669"
SRC_URI[sha256sum] = "6de61b7a3a79680b0de4c77a22eecf0dad7dfab5e9301894bfea452c5b9b4b25"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
