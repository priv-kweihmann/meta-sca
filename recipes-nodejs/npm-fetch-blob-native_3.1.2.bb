SUMMARY = "NPM: fetch-blob"
DESCRIPTION = "Blob & File implementation in Node.js, originally from node-fetch."
HOMEPAGE = "https://github.com/node-fetch/fetch-blob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=db6bf2cba86c6207f4c83860e373aba1"

DEPENDS = "npm-web-streams-polyfill-native"

SRC_URI = "https://registry.npmjs.org/fetch-blob/-/fetch-blob-3.1.2.tgz"
SRC_URI[md5sum] = "94e5c2d7e77cb3eec1165756c02e6997"
SRC_URI[sha256sum] = "86ca03363ec1f177be8ad9682466b265113854f20b227472fd8c73ba5207d51f"

NPM_PKGNAME = "fetch-blob"

inherit npmhelper
inherit native
