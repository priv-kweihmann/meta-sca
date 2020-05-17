SUMMARY = "NPM: shelljs"
DESCRIPTION = "Portable Unix shell commands for Node.js"
HOMEPAGE = "http://github.com/arturadib/shelljs"

LICENSE = "BSD-2-Clause | BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4d534bba3a94c8be6a9e37265197d453"

SRC_URI = "https://registry.npmjs.org/shelljs/-/shelljs-0.3.0.tgz"
SRC_URI[md5sum] = "7a3a1d2773c57f577844b7885024ce55"
SRC_URI[sha256sum] = "b9b374c8e14cc1396b9d3ca45a0c872862ee5aba3a556cba3530abca5e8ee181"

S = "${WORKDIR}/package"

NPM_PKGNAME = "shelljs"

inherit npmhelper
inherit native
