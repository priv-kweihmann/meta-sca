SUMMARY = "NPM: fetch-blob"
DESCRIPTION = "Blob & File implementation in Node.js, originally from node-fetch."
HOMEPAGE = "https://github.com/node-fetch/fetch-blob#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=db6bf2cba86c6207f4c83860e373aba1"

DEPENDS = "npm-node-domexception-native \
           npm-web-streams-polyfill-native"

SRC_URI = "https://registry.npmjs.org/fetch-blob/-/fetch-blob-3.1.5.tgz"
SRC_URI[md5sum] = "1de4456c3b460b8fdfda10322e8d8b29"
SRC_URI[sha256sum] = "1ee0899cf869519e9dac47a0bae82545ba96b8de29a97fb4df6dd8335c9ea1aa"

NPM_PKGNAME = "fetch-blob"

inherit npmhelper
inherit native
