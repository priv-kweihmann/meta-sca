SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-3.9.2.tgz"
SRC_URI[md5sum] = "eb81cca5d949a22a405e046858d6ebd3"
SRC_URI[sha256sum] = "c98ed9e87f35f975a3d072a6e87217f35f15303fe9d6a390acd4532b9d029a50"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
