SUMMARY = "NPM: confusing-browser-globals"
DESCRIPTION = "A list of browser globals that are often used by mistake instead of local variables"
HOMEPAGE = "https://github.com/facebook/create-react-app#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94f0d486b3ba1dd568004dc5cccd32bc"

SRC_URI = "https://registry.npmjs.org/confusing-browser-globals/-/confusing-browser-globals-1.0.9.tgz"
SRC_URI[md5sum] = "f629b05285ffbd5260bef19c0c242ff3"
SRC_URI[sha256sum] = "1bbdc5f5f19fbe51e0b19f7d0757116e38d49adcf67dedfaf86d1f065900732c"

NPM_PKGNAME = "confusing-browser-globals"

inherit npmhelper
inherit native
