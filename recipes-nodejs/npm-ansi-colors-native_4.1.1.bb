SUMMARY = "NPM: ansi-colors"
DESCRIPTION = "Easily add ANSI colors to your text and symbols in the terminal. A faster drop-in replacement for chalk, kleur and turbocolor (without the dependencies and rendering bugs)."
HOMEPAGE = "https://github.com/doowb/ansi-colors"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=442b5b961878bc805832d1d24572f62d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ansi-colors/-/ansi-colors-4.1.1.tgz"
SRC_URI[md5sum] = "ce72bb5360d8326616cae64d8ae9bdfe"
SRC_URI[sha256sum] = "24d803210289f2afc6448276aa9d5a9608e86e584698307d2365d93195cf1f44"

NPM_PKGNAME = "ansi-colors"

inherit npmhelper
inherit native
