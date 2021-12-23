SUMMARY = "NPM: bash-color"
DESCRIPTION = "a simple tool for wrapping strings in bash color codes. Used to color console output."
HOMEPAGE = "https://github.com/mbilokonsky/bash-color#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0a52afb4c2761a306a74d05fc6856a63"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/bash-color/-/bash-color-0.0.4.tgz"
SRC_URI[md5sum] = "fafbae8fdf798f37e51942deb0e844d6"
SRC_URI[sha256sum] = "79a1c144190d421c767539e6aa76b95b39a7f700f1f5d4aa328909553c5d87b6"

NPM_PKGNAME = "bash-color"

inherit npmhelper
inherit native
