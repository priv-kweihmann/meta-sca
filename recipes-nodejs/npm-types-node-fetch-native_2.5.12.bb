SUMMARY = "NPM: @types/node-fetch"
DESCRIPTION = "TypeScript definitions for node-fetch"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/node-fetch"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = "npm-form-data-native \
           npm-types-node-native"

SRC_URI = "https://registry.npmjs.org/@types/node-fetch/-/node-fetch-2.5.12.tgz"
SRC_URI[md5sum] = "3560f6ccd7be7f8fcb4e54e5d0772ef9"
SRC_URI[sha256sum] = "acf4f647c2f1ae679e9a2b5769490afae9124ce6f739bf34a63e61a3244ea114"

NPM_PKGNAME = "@types/node-fetch"

inherit npmhelper
inherit native

S = "${WORKDIR}/node-fetch"
