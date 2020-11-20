SUMMARY = "NPM: typescript"
DESCRIPTION = "TypeScript is a language for application scale JavaScript development"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=55a8748c7d5c7253f3e4bb7402ff04db"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typescript/-/typescript-4.1.2.tgz"
SRC_URI[md5sum] = "059442e5fd22d3e561c5e34d2e0ac838"
SRC_URI[sha256sum] = "383b18630fc00016cb7bde65f111e79d43fccb8c025faf33d7a3a07a5abdf026"

NPM_PKGNAME = "typescript"

inherit npmhelper
inherit native
