SUMMARY = "NPM: @types/node-fetch"
DESCRIPTION = "Stub TypeScript definitions entry for node-fetch, which provides its own types definitions"
HOMEPAGE = "{homepage}"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = "npm-node-fetch-native"

SRC_URI = "https://registry.npmjs.org/@types/node-fetch/-/node-fetch-3.0.2.tgz"
SRC_URI[md5sum] = "11961822b0baf0f0bfde794c449dc345"
SRC_URI[sha256sum] = "d9da57d29dd5e10b86766b604761be114f1cd2d8f3823f74159328acf9e1794a"

NPM_PKGNAME = "@types/node-fetch"

inherit npmhelper
inherit native

S = "${WORKDIR}/node-fetch"
