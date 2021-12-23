SUMMARY = "NPM: confusing-browser-globals"
DESCRIPTION = "A list of browser globals that are often used by mistake instead of local variables"
HOMEPAGE = "https://github.com/facebook/create-react-app#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=94f0d486b3ba1dd568004dc5cccd32bc"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/confusing-browser-globals/-/confusing-browser-globals-1.0.11.tgz"
SRC_URI[md5sum] = "dd7ffad04606018fe77e26827d5ac8f0"
SRC_URI[sha256sum] = "3dc37aeb944b02318421d73163b9a5aa5d155466951a420ebec78a14993cc4c6"

NPM_PKGNAME = "confusing-browser-globals"

inherit npmhelper
inherit native
