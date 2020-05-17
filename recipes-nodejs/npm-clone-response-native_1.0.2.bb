SUMMARY = "NPM: clone-response"
DESCRIPTION = "Clone a Node.js HTTP response stream"
HOMEPAGE = "https://github.com/lukechilds/clone-response"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9a2baa6947d5018096b83508bd94026e"

DEPENDS = "npm-mimic-response-native"

SRC_URI = "https://registry.npmjs.org/clone-response/-/clone-response-1.0.2.tgz"
SRC_URI[md5sum] = "b8d2f5045d1cd8bddfba88e4c0fa785b"
SRC_URI[sha256sum] = "ab36f4b84a3fc7df118de5528a4b315a7a576ee3b5a1b7f49035f6c2e9f7d9cb"

NPM_PKGNAME = "clone-response"

inherit npmhelper
inherit native
