SUMMARY = "NPM: is-stream"
DESCRIPTION = "Check if something is a Node.js stream"
HOMEPAGE = "https://github.com/sindresorhus/is-stream#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-stream/-/is-stream-2.0.0.tgz"
SRC_URI[md5sum] = "d4612a02df79da69a9743e26e8a37da6"
SRC_URI[sha256sum] = "d6412611e731caafb1796ca17f9aa3104e8ae72517d122c2b313bcf2bb43de54"

NPM_PKGNAME = "is-stream"

inherit npmhelper
inherit native
