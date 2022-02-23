SUMMARY = "NPM: @cspell/dict-dart"
DESCRIPTION = "Dart dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/dart#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-dart/-/dict-dart-1.1.0.tgz"
SRC_URI[md5sum] = "4c8f41daf3dc6aeb0f89da91e72657d5"
SRC_URI[sha256sum] = "78b54d50090d6f5366d5be774433d417466b89041ef7d44bcf3589161f11ccff"

NPM_PKGNAME = "@cspell/dict-dart"

inherit npmhelper
inherit native
