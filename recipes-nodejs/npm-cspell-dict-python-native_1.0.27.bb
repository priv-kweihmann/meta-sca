SUMMARY = "NPM: cspell-dict-python"
DESCRIPTION = "Python dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/python#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-python/-/cspell-dict-python-1.0.27.tgz"
SRC_URI[md5sum] = "45e9b8b524371ac0869be724fa0720d3"
SRC_URI[sha256sum] = "a2c1c3f801c9f9dddb401e9fa500a6872ed0c013743c1cb45acaa1fefb65ee16"

NPM_PKGNAME = "cspell-dict-python"

inherit npmhelper
inherit native
