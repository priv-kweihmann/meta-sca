SUMMARY = "NPM: pyright"
DESCRIPTION = "Type checker for the Python language"
HOMEPAGE = "https://github.com/Microsoft/pyright#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a2a1e4d251b834bf3e0ceee69ab1d4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pyright/-/pyright-1.1.63.tgz"
SRC_URI[md5sum] = "152316a4558cdf7b62696281932a9523"
SRC_URI[sha256sum] = "4245f1b259ef4e95828bcac115d0c49ad27cfedc006aaa7a279b0d9112f67d6b"

NPM_PKGNAME = "pyright"

inherit npmhelper
inherit native
