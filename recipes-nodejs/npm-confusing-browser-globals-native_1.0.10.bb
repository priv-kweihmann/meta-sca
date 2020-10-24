SUMMARY = "NPM: confusing-browser-globals"
DESCRIPTION = "A list of browser globals that are often used by mistake instead of local variables"
HOMEPAGE = "https://github.com/facebook/create-react-app#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94f0d486b3ba1dd568004dc5cccd32bc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/confusing-browser-globals/-/confusing-browser-globals-1.0.10.tgz"
SRC_URI[md5sum] = "cfa46d197aab222f956667f87637f969"
SRC_URI[sha256sum] = "2258b1e9fe09ba680d6d9583a0df9e996da2a21e0131173792c588240eb3f5db"

NPM_PKGNAME = "confusing-browser-globals"

inherit npmhelper
inherit native
