SUMMARY = "NPM: unherit"
DESCRIPTION = "Clone a constructor without affecting the super-class"
HOMEPAGE = "https://github.com/wooorm/unherit#readme"

DEPENDS = "npm-inherits-native npm-xtend-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=82fd7b0a70b89a370d3bcef312cfd54d"

SRC_URI = "https://registry.npmjs.org/unherit/-/unherit-1.1.3.tgz"
SRC_URI[md5sum] = "5d900f2a695121504106f325a5ab1219"
SRC_URI[sha256sum] = "10ce194ebf86771808bf92c212f0e987fef0e2b886b2bd998a73c986f07878ce"

NPM_PKGNAME = "unherit"

inherit npmhelper
inherit native
