SUMMARY = "NPM: cspell-dict-python"
DESCRIPTION = "Python dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/python#readme"

DEPENDS = "npm-configstore-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

SRC_URI = "https://registry.npmjs.org/cspell-dict-python/-/cspell-dict-python-1.0.20.tgz"
SRC_URI[md5sum] = "0f47fe4651183bfd79dc41b2d92808a4"
SRC_URI[sha256sum] = "6485743ec2f5050040047ce6176877155534625078a25cb859242dd4f2d5d2b0"

S = "${WORKDIR}/package"

NPM_PKGNAME = "cspell-dict-python"

inherit npmhelper
inherit native
